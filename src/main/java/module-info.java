module ua.ignatiysss.cooljavafxapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;

    opens ua.ignatiysss.cooljavafxapp to javafx.fxml;
    opens ua.ignatiysss.cooljavafxapp.controllers to javafx.fxml;
    exports ua.ignatiysss.cooljavafxapp;
    exports ua.ignatiysss.cooljavafxapp.controllers;
    exports ua.ignatiysss.cooljavafxapp.model.micro;
    exports ua.ignatiysss.cooljavafxapp.model.macro;
    exports ua.ignatiysss.cooljavafxapp.util;
}
