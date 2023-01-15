package com.ihnat.melnyk.mytermpaper.model;

import com.ihnat.melnyk.mytermpaper.interfaces.MicroObject;
import com.ihnat.melnyk.mytermpaper.util.Utility;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class UniversalObject extends Scene {
    public static final UniversalObject instance = new UniversalObject(1600, 900);

    private final List<MicroObject> microObjects = new ArrayList<>();

    private UniversalObject(double width, double height) {
        super(new Group(), width, height);

        addInitialObjects();
    }

    private void addInitialObjects() {
        var view = new ImageView(Utility.imageFromResource("misaki.jpg"));

        nodes().add(view);
    }

    private Group group() {
        return (Group) getRoot();
    }

    private List<Node> nodes() {
        return group().getChildren();
    }
}
