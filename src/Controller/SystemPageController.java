/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Omar
 */
public class SystemPageController implements Initializable {

    @FXML
    private TextField USD;
    @FXML
    private TextField NIS;
    
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
    private void logoutButtonAction(ActionEvent event) throws IOException {
        viewManager.showLoginPage();
    }

    @FXML
    private void convertButtonAction(ActionEvent event) {
        String dollarString = USD.getText();
        String shekelString = NIS.getText();

        if (!dollarString.isEmpty() && shekelString.isEmpty()) {
            double dollar = Double.parseDouble(dollarString);
            double shekel = dollar * 3.6;
            NIS.setText(String.format("%.2f", shekel));
        } else if (dollarString.isEmpty() && !shekelString.isEmpty()) {
            double shekel = Double.parseDouble(shekelString);
            double dollar = shekel / 3.6;
            USD.setText(String.format("%.2f", dollar));
        }
    }
    
}
