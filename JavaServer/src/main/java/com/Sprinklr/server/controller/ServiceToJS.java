package com.Sprinklr.server.controller;

import com.HtmlContent;
import com.ImageData;
import com.RecieveLayersGrpc;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Controller;
import java.util.concurrent.CompletableFuture;

@Controller
public class ServiceToJS {

  // Forwarding Request to JS
    public CompletableFuture<ImageData> sendJS(String htmlContent) {

        // Adding htmlContent to protobuf Structure
        HtmlContent htmlString = HtmlContent.newBuilder()
                .setHtmlContent(htmlContent)
                .build();

        CompletableFuture<ImageData> future = new CompletableFuture<>();

        // Connection to JS
        ManagedChannel channel = ManagedChannelBuilder.forAddress("Js-container", 3000)
                .usePlaintext()
                .build();
        RecieveLayersGrpc.RecieveLayersFutureStub stub = RecieveLayersGrpc.newFutureStub(channel);

        // Calling gRPC service to JS
        ListenableFuture<ImageData> futureResponse = stub.recieveLayers(htmlString);

        // Convert ListenableFuture to CompletableFuture
        futureResponse.addListener(() -> {
            try {
                future.complete(futureResponse.get());
            } catch (Exception e) {
                future.completeExceptionally(e);
            } finally {
                channel.shutdown();
            }
        }, Runnable::run);

        return future;
    }

}
