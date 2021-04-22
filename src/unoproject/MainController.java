/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Sawid
 */
public class MainController implements Initializable {

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
   @FXML
    private StackPane p1;
    
    @FXML
    public void setClick(ActionEvent event) {
        System.out.println("Hello");
        p1.setVisible(false);
        p1.managedProperty().bind(p1.visibleProperty());
    }
    
}
