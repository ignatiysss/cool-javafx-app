package com.ihnat.melnyk.mytermpaper.implementations.micro;

import com.ihnat.melnyk.mytermpaper.interfaces.micro.MicroObject;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract public class BaseMicroObject extends ImageView implements MicroObject {
    public static double DEFAULT_WIDTH = 100, DEFAULT_HEIGHT = 100;

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
    public void moveBy() {

    }

    @Override
    public void moveBy(double x, double y) {

    }
}
