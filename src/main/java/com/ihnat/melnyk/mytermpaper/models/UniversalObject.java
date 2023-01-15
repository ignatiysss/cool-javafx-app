package com.ihnat.melnyk.mytermpaper.models;

import com.ihnat.melnyk.mytermpaper.controllers.NewMicroObjectController;
import com.ihnat.melnyk.mytermpaper.util.Utility;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class UniversalObject extends Scene {
    public static final UniversalObject instance = new UniversalObject(1600, 900);

    private final List<BaseMicroObject> microObjects = new ArrayList<>();

    private UniversalObject(double width, double height) {
        super(new Group(), width, height);

        addInitialObjects();

        setOnKeyPressed(keyEventHandler());
    }

    private void addInitialObjects() {
        var view = new ImageView(Utility.imageFromResource("misaki.jpg"));

        nodes().add(view);
    }

    private EventHandler<KeyEvent> keyEventHandler() {
        return keyEvent -> {
            switch (keyEvent.getCode()) {
                case INSERT -> NewMicroObjectController.call(1, 2, consumer());
                case A -> {
                }
            }
        };
    }

    private Consumer<BaseMicroObject> consumer() {
        return microObject -> {
            nodes().add(microObject);
            microObjects.add(microObject);
        };
    }

    private Group group() {
        return (Group) getRoot();
    }

    private List<Node> nodes() {
        return group().getChildren();
    }
}
