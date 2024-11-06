/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cinyumarket;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Paula
 */
public class LoginController implements Initializable {
    
    @FXML
    private StackPane stack;
    
    private VBox log, exit;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            log = LoadForm("/cinyumarket/menuLogin.fxml");
            exit = LoadForm("/cinyumarket/loginexit.fxml");
            stack.getChildren().addAll(log, exit);
            log.setVisible(true);
            exit.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }    
    private VBox LoadForm(String url) throws IOException{
        return (VBox)FXMLLoader.load(getClass().getResource(url));
    } 
}
