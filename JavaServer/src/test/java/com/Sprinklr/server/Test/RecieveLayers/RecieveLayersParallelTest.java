package com.Sprinklr.server.Test.RecieveLayers;

import com.*;

import com.Sprinklr.server.connection.ServiceLayerTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.TestInfo;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RecieveLayersParallelTest extends ServiceLayerTest {
    
    
    TestData testData;
    
    RecieveLayersParallelTest(){
        testData = new TestData();
    }
    
    @Test
    public void testWithMultipleLayers(TestInfo testInfo) {

        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer1);
        imageLayersList.add(testData.imgLayer2);
        imageLayersList.add(testData.imgLayer3);

        Layers.Builder layersBuilder = Layers.newBuilder();

        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }

        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer01(TestInfo testInfo) {

        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer4)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }


    @Test
    public void testWithSingleLayer04(TestInfo testInfo) {

        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer4)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer05(TestInfo testInfo) {

        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer7)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer06(TestInfo testInfo) {

        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer8)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer02(TestInfo testInfo) {

        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer5)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer03(TestInfo testInfo) {


        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer6)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }
}
