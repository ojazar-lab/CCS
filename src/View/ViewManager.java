/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.File;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Omar
 */
public class ViewManager {
//    private static final String LOGIN_PAGE = "loginPage.fxml";
//    private static final String SYSTEM_PAGE = "systemPage.fxml";

    private Stage stage;

    public ViewManager(Stage stage) {
        this.stage = stage;
    }

    public void showLoginPage() throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginPage.fxml"));
//        Parent root = loader.load();
        FXMLLoader loader = new FXMLLoader(new File("C:\\Users\\Omar\\Documents\\NetBeansProjects\\CCS\\src\\ccs\\loginPage.fxml").toURI().toURL());
        Pane root = loader.load();
//        FXMLLoader loader = new FXMLLoader(getClass().getResource(LOGIN_PAGE));
//        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void showSystemPage() throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("systemPage.fxml"));
//        Parent root = loader.load();
        FXMLLoader loader = new FXMLLoader(new File("C:\\Users\\Omar\\Documents\\NetBeansProjects\\CCS\\src\\ccs\\systemPage.fxml").toURI().toURL());
        Pane root = loader.load();
//        FXMLLoader loader = new FXMLLoader(getClass().getResource(SYSTEM_PAGE));
//        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
