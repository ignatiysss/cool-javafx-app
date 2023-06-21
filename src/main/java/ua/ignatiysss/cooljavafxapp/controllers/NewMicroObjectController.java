package ua.ignatiysss.cooljavafxapp.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ua.ignatiysss.cooljavafxapp.model.micro.BaseMicroObject;
import ua.ignatiysss.cooljavafxapp.model.micro.ColonelImpl;
import ua.ignatiysss.cooljavafxapp.util.Utils;

import java.io.IOException;
import java.util.function.Consumer;

public class NewMicroObjectController {
    private final Stage stage = new Stage();

    private Consumer<BaseMicroObject> consumer;

    public static void call(Consumer<BaseMicroObject> consumer) {
        var loader = new FXMLLoader(Utils.getView("new-microobject-view.fxml"));
        VBox root;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        var controller = (NewMicroObjectController) loader.getController();

        controller.consumer = consumer;

        controller.stage.setScene(new Scene(root));
        controller.stage.setTitle("New MicroObject...");
        controller.stage.setResizable(false);
        controller.stage.show();
    }

    @FXML
    private TextField text;

    @FXML
    private void create() {
        consumer.accept(new ColonelImpl());

        close();
    }

    @FXML
    private void close() {
        stage.close();
    }
}
