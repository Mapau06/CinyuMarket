/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cinyumarket;

import static cinyumarket.LoginController.exit;
import static cinyumarket.LoginController.log;
import static cinyumarket.LoginController.reg;
import static cinyumarket.LoginController.rexit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Paula
 */
public class MenuRegistroController implements Initializable {
    
    public static listausuarios lista = new listausuarios();
    
    @FXML
    private TextField user, pass;
    
    @FXML
    private Button btnCrear;
    
    public void actionEvent (ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnCrear)){
            lista.añadir_lista(user.getText(), pass.getText());
            user.setText("");
            pass.setText("");
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
