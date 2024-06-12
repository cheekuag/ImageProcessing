package com.Sprinklr.Image.Controller;


import com.HtmlContent;
import com.ImageData;
import com.RecieveLayersGrpc;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Controller;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller
public class ServiceToJS {

    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public CompletableFuture<ImageData> sendJS(String htmlContent) {


        HtmlContent html = HtmlContent.newBuilder()
                .setHtmlContent(htmlContent)
                .build();


        CompletableFuture<ImageData> future = new CompletableFuture<>();

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 3000)
                .usePlaintext()
                .build();
        RecieveLayersGrpc.RecieveLayersFutureStub stub = RecieveLayersGrpc.newFutureStub(channel);

        ListenableFuture<ImageData> futureResponse = stub.recieveLayers(html);

        Futures.addCallback(futureResponse, new FutureCallback<ImageData>() {
            @Override
            public void onSuccess(ImageData response) {
                future.complete(response);
                channel.shutdown();

            }

            @Override
            public void onFailure(Throwable t) {
                future.completeExceptionally(t);
                channel.shutdown();


            }
        }, executorService);

        return future;

    }

}
