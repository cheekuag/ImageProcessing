package com.Sprinklr.server.service;

import com.Layers;
import org.springframework.stereotype.Controller;

import java.util.stream.Collectors;

@Controller
public class HtmlString {


    // Html string building
    public String  htmlstring(Layers layers) {
        StringBuilder htmlContent=new StringBuilder();
        htmlContent.append(
                "<html>" +
                        "  <head>" +
                        "    <style>" +
                        "      body, html { margin: 0;}" +
                        "      .text-layer { position: absolute; }" +
                        "      .layer { transform-origin: top left; }" + // Set transform-origin to top left
                        "    </style>" +
                        "  </head>"+
                        "  <body>");

        // convert all images contained layer to Html string
        if (!layers.getImglayersList().isEmpty()) {
            String imgLayersHtml = layers.getImglayersList().stream()
                    .map(layer -> String.format(
                            "<img class=\"layer\" style=\"position: absolute; left: %dpx; top: %dpx; opacity: %d; transform: rotate(%ddeg); height: %dpx; width: %dpx;\" src=\"%s\" />",
                            layer.getX(), layer.getY(), layer.getOpacity(), layer.getRotation(), layer.getHeight(), layer.getWidth(), layer.getImageUrl()))
                    .collect(Collectors.joining());
            htmlContent.append(imgLayersHtml);
        }

        // convert all text contained layer to Html string
        if (!layers.getTxtlayersList().isEmpty()) {
            String txtLayersHtml = layers.getTxtlayersList().stream()
                    .map(layer -> String.format(
                            "<div class=\"text-layer\" style=\"position: absolute; left: %dpx; top: %dpx; opacity: 1; font-size: %dpx;\">%s</div>",
                            layer.getX(), layer.getY(), layer.getFontSize(), layer.getText()))
                    .collect(Collectors.joining());
            htmlContent.append(txtLayersHtml);
        }

        htmlContent.append("</body></html>");

        return htmlContent.toString();

    }

}
