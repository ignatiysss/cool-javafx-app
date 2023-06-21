package ua.ignatiysss.cooljavafxapp.util;

import javafx.scene.image.Image;
import lombok.experimental.UtilityClass;
import ua.ignatiysss.cooljavafxapp.Main;

import java.io.InputStream;
import java.net.URL;

@UtilityClass
public class Utils {
    public Image getImage(String imageName) {
        return new Image(getResourceStream("/images/" + imageName));
    }

    public URL getView(String viewName) {
        return getResourceURL("/views/" + viewName);
    }

    public URL getResourceURL(String absolutePath) {
        return Main.class.getResource(absolutePath);
    }

    public InputStream getResourceStream(String absolutePath) {
        return Main.class.getResourceAsStream(absolutePath);
    }
}
