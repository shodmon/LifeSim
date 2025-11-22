package com.lifesim;

/**
 * Hello world!
 *
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new Label("Hello JavaFX!"), 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        Time time = new Time();
        Player player = new Player();

        // things to-do:
        // 1. time
        // 2. gui
        // 3. player stats
        // 4. file i/o
        //  
    }
}