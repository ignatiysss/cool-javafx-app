package com.ihnat.melnyk.mytermpaper.controllers;

import com.ihnat.melnyk.mytermpaper.models.BaseMicroObject;
import com.ihnat.melnyk.mytermpaper.util.Utility;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.function.Consumer;

public class NewMicroObjectController {

    private final Stage stage = new Stage();

    private double x, y;
    private Consumer<BaseMicroObject> consumer;

    public static void call(double x, double y, Consumer<BaseMicroObject> consumer) {
        var loader = new FXMLLoader(Utility.viewURL("new-microobject-view.fxml"));
        VBox root;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        var controller = (NewMicroObjectController) loader.getController();

        controller.x = x;
        controller.y = y;
        controller.consumer = consumer;

        controller.stage.setScene(new Scene(root));
        controller.stage.setTitle("New MicroObject...");
        controller.stage.setResizable(false);
        controller.stage.show();
    }

    @FXML
    private TextField text;

    @FXML
    private void submit() {
    }

}
