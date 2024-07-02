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
    public void testWithMultipleLayers01(TestInfo testInfo) {
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
    public void testWithSingleLayer07(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer10)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer08(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer11)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer09(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer9)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer10(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer12)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers02(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer2);
        imageLayersList.add(testData.imgLayer3);
        imageLayersList.add(testData.imgLayer4);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers03(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer3);
        imageLayersList.add(testData.imgLayer4);
        imageLayersList.add(testData.imgLayer5);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers04(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer4);
        imageLayersList.add(testData.imgLayer5);
        imageLayersList.add(testData.imgLayer6);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers05(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer5);
        imageLayersList.add(testData.imgLayer6);
        imageLayersList.add(testData.imgLayer7);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers06(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer6);
        imageLayersList.add(testData.imgLayer7);
        imageLayersList.add(testData.imgLayer8);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers07(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer7);
        imageLayersList.add(testData.imgLayer8);
        imageLayersList.add(testData.imgLayer9);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers08(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer8);
        imageLayersList.add(testData.imgLayer9);
        imageLayersList.add(testData.imgLayer10);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers09(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer9);
        imageLayersList.add(testData.imgLayer10);
        imageLayersList.add(testData.imgLayer11);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers10(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer10);
        imageLayersList.add(testData.imgLayer11);
        imageLayersList.add(testData.imgLayer12);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

// Repeat the pattern

    @Test
    public void testWithMultipleLayers11(TestInfo testInfo) {
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
    public void testWithSingleLayer11(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer4)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer12(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer5)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer13(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer6)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer14(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer4)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer15(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer7)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer16(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer8)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer17(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer10)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer18(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer11)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer19(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer9)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer20(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer12)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers12(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer2);
        imageLayersList.add(testData.imgLayer3);
        imageLayersList.add(testData.imgLayer4);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers13(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer3);
        imageLayersList.add(testData.imgLayer4);
        imageLayersList.add(testData.imgLayer5);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers14(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer4);
        imageLayersList.add(testData.imgLayer5);
        imageLayersList.add(testData.imgLayer6);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers15(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer5);
        imageLayersList.add(testData.imgLayer6);
        imageLayersList.add(testData.imgLayer7);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers16(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer6);
        imageLayersList.add(testData.imgLayer7);
        imageLayersList.add(testData.imgLayer8);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers17(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer7);
        imageLayersList.add(testData.imgLayer8);
        imageLayersList.add(testData.imgLayer9);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers18(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer8);
        imageLayersList.add(testData.imgLayer9);
        imageLayersList.add(testData.imgLayer10);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers19(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer9);
        imageLayersList.add(testData.imgLayer10);
        imageLayersList.add(testData.imgLayer11);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithMultipleLayers20(TestInfo testInfo) {
        List<imageLayer> imageLayersList = new ArrayList<>();
        imageLayersList.add(testData.imgLayer10);
        imageLayersList.add(testData.imgLayer11);
        imageLayersList.add(testData.imgLayer12);

        Layers.Builder layersBuilder = Layers.newBuilder();
        for (imageLayer imgLayer : imageLayersList) {
            layersBuilder.addImglayers(imgLayer);
        }
        layersBuilder.addTxtlayers(testData.txtLayer);
        Layers layers = layersBuilder.build();

        executeTest(testInfo, layers);
    }

// Repeat the pattern...

    @Test
    public void testWithMultipleLayers21(TestInfo testInfo) {
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
    public void testWithSingleLayer21(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer4)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer22(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer5)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer23(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer6)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer24(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer4)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer25(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer7)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer26(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer8)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer27(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer10)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer28(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer11)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }

    @Test
    public void testWithSingleLayer29(TestInfo testInfo) {
        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer9)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo, layers);
    }


}
