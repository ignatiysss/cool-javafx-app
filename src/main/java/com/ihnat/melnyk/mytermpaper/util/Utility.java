package com.ihnat.melnyk.mytermpaper.util;

import com.ihnat.melnyk.mytermpaper.Main;
import javafx.scene.image.Image;

import java.io.InputStream;
import java.net.URL;
import java.util.Objects;

public class Utility {
    public static Image imageFromResource(String resourceName) {
        return new Image(Objects.requireNonNull(Main.class.getResourceAsStream("images/" + resourceName)));
    }

    public static URL viewURL(String filename) {
        return Objects.requireNonNull(Main.class.getResource("views/" + filename));
    }

    public static InputStream streamResource(String resourceName) {
        return Main.class.getResourceAsStream(resourceName);
    }
}
