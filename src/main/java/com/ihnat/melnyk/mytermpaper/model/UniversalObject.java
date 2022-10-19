package com.ihnat.melnyk.mytermpaper.model;

import com.ihnat.melnyk.mytermpaper.interfaces.MicroObject;
import javafx.scene.Group;
import javafx.scene.Scene;

import java.util.ArrayList;

public class UniversalObject extends Scene {
    public static final UniversalObject instance = new UniversalObject(1600, 900);

    private final ArrayList<MicroObject> microObjects = new ArrayList<>();

    private UniversalObject(double width, double height) {
        super(new Group(), width, height);
    }
}
