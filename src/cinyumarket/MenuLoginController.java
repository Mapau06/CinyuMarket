/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cinyumarket;

import static cinyumarket.LoginController.exit;
import static cinyumarket.LoginController.log;
import static cinyumarket.LoginController.reg;
import static cinyumarket.LoginController.rexit;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Paula
 */
public class MenuLoginController implements Initializable {
    
    public static usuario loged;
    public static String nom;
    
    @FXML
    private Button btnCrear, btnLogin;
    
    @FXML
    private TextField user, pass;
    
    public void actionEvent (ActionEvent e){
        Object evt = e.getSource();
        if (evt.equals(btnCrear)){
            log.setVisible(false);
            exit.setVisible(false);
            reg.setVisible(true);
            rexit.setVisible(false);
        }
        if (evt.equals(btnLogin)){
            loged = MenuRegistroController.lista.login(user.getText(), pass.getText());
            if (loged != null){
                nom = user.getText();
                log.setVisible(false);
                exit.setVisible(true);
                reg.setVisible(false);
                rexit.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Datos erroneos");
            }
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }        
}
