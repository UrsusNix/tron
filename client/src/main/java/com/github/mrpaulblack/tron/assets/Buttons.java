package com.github.mrpaulblack.tron.assets;

import javafx.scene.control.Button;
import com.github.mrpaulblack.tron.SceneManager;

public class Buttons {

    public Button CenterdLabeldButton(String name) {
        Button join = new Button(name);
        join.setStyle("-fx-padding: 10; -fx-border-radius: 20; -fx-pref-width: 9999; -fx-stroke-width: 1");
        // join.setOnAction(buttonHandler);

        return join;
    }

    public Button goTo(String name, String goTo) {

        SceneManager.pushTo(goTo);
        
        Button changeScene = new Button(name);
        changeScene.setStyle("-fx-padding: 10; -fx-border-radius: 20; -fx-pref-width: 9999; -fx-stroke-width: 1");

        return changeScene;
    }
}