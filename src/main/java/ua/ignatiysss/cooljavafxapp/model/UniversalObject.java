package ua.ignatiysss.cooljavafxapp.model;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import lombok.Getter;
import ua.ignatiysss.cooljavafxapp.controllers.NewMicroObjectController;
import ua.ignatiysss.cooljavafxapp.model.micro.BaseMicroObject;
import ua.ignatiysss.cooljavafxapp.model.micro.MicroObject;
import ua.ignatiysss.cooljavafxapp.util.Utils;

import java.util.ArrayList;
import java.util.List;

public class UniversalObject extends Scene {
    @Getter
    private static final UniversalObject Instance = new UniversalObject(1600, 900);

    private final List<MicroObject> microObjects = new ArrayList<>();

    private UniversalObject(double width, double height) {
        super(new Group(), width, height);

        var view = new ImageView(Utils.getImage("misaki.jpg"));

        getNodes().add(view);

        setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()) {
                case INSERT -> NewMicroObjectController.call(this::addMicroObject);
                case A -> {
                }
            }
        });
    }

    private void addMicroObject(BaseMicroObject microObject) {
        getNodes().add(microObject);
        microObjects.add(microObject);
    }

    private Group getGroup() {
        return (Group) getRoot();
    }

    private List<Node> getNodes() {
        return getGroup().getChildren();
    }
}
