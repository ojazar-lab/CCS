package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Omar
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

     private ViewManager viewManager;

    public void setViewManager(ViewManager viewManager) {
        this.viewManager = viewManager;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonAction(ActionEvent event) throws IOException {
         String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("user") && password.equals("userpass")) {
            viewManager.showSystemPage();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Login");
            alert.setHeaderText("Invalid username or password");
            alert.setContentText("Please enter a valid username and password.");
            alert.showAndWait();
        }
    
    }
    
}
