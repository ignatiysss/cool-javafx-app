package com.ihnat.melnyk.mytermpaper.model;

import com.ihnat.melnyk.mytermpaper.interfaces.MicroObject;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

abstract public class BaseMicroObject extends ImageView implements MicroObject {
    public BaseMicroObject(Image image) {
        super(image);
    }
}
