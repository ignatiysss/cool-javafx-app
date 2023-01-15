package com.ihnat.melnyk.mytermpaper;

import com.ihnat.melnyk.mytermpaper.model.UniversalObject;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setScene(UniversalObject.instance);
        stage.setTitle("My Very Cool JavaFX Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
