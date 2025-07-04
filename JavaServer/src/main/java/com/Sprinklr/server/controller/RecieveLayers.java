package com.Sprinklr.server.controller;
import com.ImageData;
import com.Layers;
import com.RecieveLayersGrpc;
import com.Sprinklr.server.service.HtmlString;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CompletableFuture;

@GrpcService
public class RecieveLayers extends RecieveLayersGrpc.RecieveLayersImplBase {

    @Autowired
    private ServiceToJS serviceToJS;

    @Autowired
    private HtmlString htmlString;

    // receive Request from Client
        @Override
        public void recieveLayersClient(Layers layers, StreamObserver<ImageData> responseObserver) {
            try {
                System.out.println("Into GRPC service");
                // Getting the Layers info convert to Html String
                String htmlContent = htmlString.htmlstring(layers);

                // Html string passed to JS
                CompletableFuture<ImageData> futureResponse = serviceToJS.sendJS(htmlContent);

                // Response from JS
                futureResponse.whenComplete((response, throwable) -> {
                    if (throwable != null) {
                        responseObserver.onError(throwable);
                    } else {
                        responseObserver.onNext(response);
                    }
                    responseObserver.onCompleted();
                });
            } catch (Exception e) {
                // Handle any unexpected exceptions
                responseObserver.onError(Status.INTERNAL.withDescription("Internal server error").withCause(e).asException());
                responseObserver.onCompleted();
            }
        }



}