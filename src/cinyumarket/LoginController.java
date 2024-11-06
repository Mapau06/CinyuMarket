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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    
    public static VBox log, exit, reg, rexit;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            log = LoadForm("/cinyumarket/menuLogin.fxml");
            exit = LoadForm("/cinyumarket/loginexit.fxml");
            reg = LoadForm("/cinyumarket/menuRegistro.fxml");
            rexit = LoadForm("/cinyumarket/registroexit.fxml");
            stack.getChildren().addAll(log, exit, reg, rexit);
            log.setVisible(true);
            exit.setVisible(false);
            reg.setVisible(false);
            rexit.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }    
    private VBox LoadForm(String url) throws IOException{
        return (VBox)FXMLLoader.load(getClass().getResource(url));
    } 
}
