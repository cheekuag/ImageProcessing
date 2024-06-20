package com.Sprinklr.server.connection;

import com.ImageData;
import com.Layers;
import com.RecieveLayersGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.serverfactory.GrpcServerLifecycle;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ServiceLayerTest {

    private static ManagedChannel channel;
    private static RecieveLayersGrpc.RecieveLayersStub asyncStub;

    @Autowired
    private GrpcServerLifecycle grpcServerLifecycle;


    @BeforeAll
    public static void setUp() {
        channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
        asyncStub = RecieveLayersGrpc.newStub(channel);
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        if (channel != null) {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }
    }


    public CompletableFuture<ImageData> sendLayersAsync(Layers layers) {

        CompletableFuture<ImageData> future = new CompletableFuture<>();

        asyncStub.recieveLayersClient(layers, new StreamObserver<ImageData>() {
            @Override
            public void onNext(ImageData response) {
                future.complete(response);
            }
            @Override
            public void onError(Throwable t) {
                future.completeExceptionally(t);
            }
            @Override
            public void onCompleted() {
                // No-op
            }
        });
        return future;
    }

     public void executeTest(TestInfo testInfo, Layers layers) {
        long startTime = System.currentTimeMillis();

        try {
            CompletableFuture<ImageData> future = sendLayersAsync(layers);
            ImageData response = future.get();  // Wait for the response

            long endTime = System.currentTimeMillis();
            System.out.println(testInfo.getDisplayName() + " took " + (endTime - startTime) + " ms");

            assertNotNull(response);
        assertEquals("s","s");
        } catch (InterruptedException | ExecutionException e) {
            fail("Test failed due to exception: " + e.getMessage());
        }
    }

}
