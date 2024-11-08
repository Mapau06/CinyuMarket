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
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Paula
 */
public class PrincipalController implements Initializable {
    
    colaCarrito cola = new colaCarrito();
    
    @FXML
    private Button btnDeseos, btnCarrito, btnC1, btnC2, btnC3, btnC4, btnC5, btnC6;
    
    public void actionEvent (ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnC1)){
            producto p = new producto("Asistente Virtual Alexa 110V/240V Color Negro", "images/image-removebg-preview (2).png", MenuLoginController.nom, 195393);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC2)){
            producto p = new producto("Cerradura digital inteligente", "images/image-removebg-preview (5).png", MenuLoginController.nom, 1236000);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC3)){
            producto p = new producto("Corrector de postura digital", "images/image-removebg-preview (7).png", MenuLoginController.nom, 490000);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC4)){
            producto p = new producto("Enchufe Inteligente Smart Plug Wifi Control App Color Blanco", "images/image-removebg-preview (3).png", MenuLoginController.nom, 26990);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC5)){
            producto p = new producto("Bascula inteligente Color Blanco", "images/image-removebg-preview (6).png", MenuLoginController.nom, 816000);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC6)){
            producto p = new producto("Lampara de mesa inteligente", "images/image-removebg-preview (9).png", MenuLoginController.nom, 127000);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnCarrito)){
            loadStage("/cinyumarket/carrito.fxml", e);
        }
        if(evt.equals(btnDeseos)){
            loadStage("/cinyumarket/deseos.fxml", e);
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    private void loadStage(String url, Event event){
        
        try {
            Object eventSource = event.getSource();
            Node sourceAsNode = (Node) eventSource;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window;
            stage.hide();
            
            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
            
            newStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Platform.exit();
                }
            });
        }catch ( IOException ex){
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null, ex);
        }     
    }
}
