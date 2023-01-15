package com.ihnat.melnyk.mytermpaper.implementations.micro;

import com.ihnat.melnyk.mytermpaper.interfaces.micro.MicroObject;
import com.ihnat.melnyk.mytermpaper.util.Utility;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.Properties;

abstract public class BaseMicroObject extends ImageView implements MicroObject {
    public static final double DEFAULT_WIDTH, DEFAULT_HEIGHT;

    static {
        var properties = new Properties();
        try {
            properties.load(Utility.streamResource("micro_object.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        DEFAULT_WIDTH = Double.parseDouble(properties.getProperty("default.width"));
        DEFAULT_HEIGHT = Double.parseDouble(properties.getProperty("default.height"));
    }

    public BaseMicroObject(Image image, double width, double height) {
        super(image);

        setFitDimensions(width, height);
    }

    public BaseMicroObject(Image image) {
        this(image, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public void setFitDimensions(double width, double height) {
        setFitWidth(width);
        setFitHeight(height);
    }

    @Override
    public void autoMove() {
    }

    @Override
    public void moveBy(double x, double y) {
    }
}
