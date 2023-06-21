package ua.ignatiysss.cooljavafxapp;

import javafx.application.Application;
import javafx.stage.Stage;
import ua.ignatiysss.cooljavafxapp.model.UniversalObject;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setScene(UniversalObject.getInstance());
        stage.setTitle("My Very Cool JavaFX Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
