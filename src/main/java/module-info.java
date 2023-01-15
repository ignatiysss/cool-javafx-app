module com.ihnat.melnyk.mytermpaper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ihnat.melnyk.mytermpaper to javafx.fxml;
    opens com.ihnat.melnyk.mytermpaper.controllers to javafx.fxml;
    exports com.ihnat.melnyk.mytermpaper;
    exports com.ihnat.melnyk.mytermpaper.controllers;
    exports com.ihnat.melnyk.mytermpaper.models;
    exports com.ihnat.melnyk.mytermpaper.interfaces;
}