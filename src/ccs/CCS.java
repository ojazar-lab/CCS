/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ccs;

import View.ViewManager;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Omar
 */
public class CCS extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewManager viewManager = new ViewManager(primaryStage);
        viewManager.showLoginPage();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
