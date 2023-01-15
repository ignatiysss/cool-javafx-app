package com.ihnat.melnyk.mytermpaper.util;

import com.ihnat.melnyk.mytermpaper.Main;
import javafx.scene.image.Image;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;

public class Utility {
    public static Image imageFromResource(String resourceName) {
        return new Image(Objects.requireNonNull(Main.class.getResourceAsStream("images/" + resourceName)));
    }

    public static URL viewURL(String filename) {
        try {
            return Objects.requireNonNull(Main.class.getResource("views/" + filename)).toURI().toURL();
        } catch (MalformedURLException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
