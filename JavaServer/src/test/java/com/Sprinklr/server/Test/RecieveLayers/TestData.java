package com.Sprinklr.server.Test.RecieveLayers;

import com.imageLayer;
import com.textLayer;

public class TestData {

    imageLayer imgLayer1 = imageLayer.newBuilder()
            .setImageUrl("https://tinypng.com/images/social/website.jpg")
            .setX(10)
            .setY(10)
            .setHeight(200)
            .setWidth(200)
            .setOpacity(100)
            .setRotation(0)
            .build();

    imageLayer imgLayer2 = imageLayer.newBuilder()
            .setImageUrl("https://tinypng.com/images/social/website.jpg")
            .setX(210)
            .setY(10)
            .setHeight(200)
            .setWidth(200)
            .setOpacity(100)
            .setRotation(0)
            .build();

    imageLayer imgLayer3 = imageLayer.newBuilder()
            .setImageUrl("https://tinypng.com/images/social/website.jpg")
            .setX(410)
            .setY(10)
            .setHeight(200)
            .setWidth(200)
            .setOpacity(100)
            .setRotation(0)
            .build();


    imageLayer imgLayer4 = imageLayer.newBuilder()
            .setImageUrl("https://d38b044pevnwc9.cloudfront.net/cutout-nuxt/enhancer/2.jpg")
            .setX(100)
            .setY(100)
            .setHeight(200)
            .setWidth(200)
            .setOpacity(90)
            .setRotation(5)
            .build();

    imageLayer imgLayer5 = imageLayer.newBuilder()
            .setImageUrl("https://kinsta.com/wp-content/uploads/2020/08/tiger-jpg.jpg")
            .setX(100)
            .setY(100)
            .setHeight(200)
            .setWidth(200)
            .setOpacity(90)
            .setRotation(5)
            .build();




    imageLayer imgLayer6 = imageLayer.newBuilder()
            .setImageUrl("https://img.pikbest.com/photo/20240502/spirited-mothers-day-holiday-wishes-222024-png-images-png_10543879.jpg!w700wp")
            .setX(100)
            .setY(100)
            .setHeight(200)
            .setWidth(200)
            .setOpacity(90)
            .setRotation(0)
            .build();

    imageLayer imgLayer7 = imageLayer.newBuilder()
            .setImageUrl("https://png.pngtree.com/thumb_back/fh260/background/20230529/pngtree-dream-animation-wallpapers-image_2669299.jpg")
            .setX(100)
            .setY(100)
            .setHeight(200)
            .setWidth(200)
            .setOpacity(90)
            .setRotation(5)
            .build();
    imageLayer imgLayer8 = imageLayer.newBuilder()
            .setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRR01Yu07DOn3AWKLZaQznB4Fz60oQpG7t1ug&s")
            .setX(100)
            .setY(100)
            .setHeight(200)
            .setWidth(200)
            .setOpacity(90)
            .setRotation(5)
            .build();

    textLayer txtLayer = textLayer.newBuilder()
            .setText("Hello Aditya")
            .setX(100)
            .setY(500)
            .setFontSize(30)
            .build();

}