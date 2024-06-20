package com.Sprinklr.server.Test.RecieveLayers;

import com.*;
import com.Sprinklr.server.connection.ServiceLayerTest;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RecieveLayersIndividualTest extends ServiceLayerTest {

    TestData testData;

    RecieveLayersIndividualTest(){
        testData = new TestData();
    }

    @Test
    public void testRecieveLayers(TestInfo testInfo) {

        Layers layers = Layers.newBuilder()
                .addImglayers(testData.imgLayer5)
                .addTxtlayers(testData.txtLayer)
                .build();

        executeTest(testInfo,layers);

    }
}
