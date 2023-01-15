module com.ihnat.melnyk.mytermpaper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ihnat.melnyk.mytermpaper to javafx.fxml;
    opens com.ihnat.melnyk.mytermpaper.controllers to javafx.fxml;
    exports com.ihnat.melnyk.mytermpaper;
    exports com.ihnat.melnyk.mytermpaper.controllers;
    exports com.ihnat.melnyk.mytermpaper.implementations;
    exports com.ihnat.melnyk.mytermpaper.implementations.micro;
    exports com.ihnat.melnyk.mytermpaper.implementations.macro;
    exports com.ihnat.melnyk.mytermpaper.interfaces.micro;
    exports com.ihnat.melnyk.mytermpaper.interfaces.macro;
}