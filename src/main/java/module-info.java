module com.ihnat.melnyk.mytermpaper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ihnat.melnyk.mytermpaper to javafx.fxml;
    exports com.ihnat.melnyk.mytermpaper;
}