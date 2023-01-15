package com.ihnat.melnyk.mytermpaper.util;

import com.ihnat.melnyk.mytermpaper.Main;
import javafx.scene.image.Image;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Objects;

public class Utility {
    public static Image imageFromResource(String resourceName) {
        return new Image(Objects.requireNonNull(Main.class.getResourceAsStream("images/" + resourceName)));
    }

    public static File viewFile(String filename) {
        try {
            return new File(Objects.requireNonNull(Main.class.getResource("views/" + filename)).toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
