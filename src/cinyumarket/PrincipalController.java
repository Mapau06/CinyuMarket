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
    
    public static colaCarrito cola = new colaCarrito();
    public static colaDeseos cola2 = new colaDeseos();
    public static pilaHistorial pila = new pilaHistorial();
    
    @FXML
    private Button btnBack, btnDeseos, btnCarrito, btnHistorial, btnC1, btnC2, btnC3, btnC4, btnC5, btnC6,
            btnD1, btnD2, btnD3, btnD4, btnD5, btnD6;
    
    public void actionEvent (ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnC1)){
            producto p = new producto("Asistente Virtual Alexa 110V/240V Color Negro", "/cinyumarket/images/image-removebg-preview (2).png", MenuLoginController.nom, 195393, 1);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC2)){
            producto p = new producto("Cerradura digital inteligente", "/cinyumarket/images/image-removebg-preview (5).png", MenuLoginController.nom, 1236000, 1);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC3)){
            producto p = new producto("Corrector de postura digital", "/cinyumarket/images/image-removebg-preview (7).png", MenuLoginController.nom, 490000, 1);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC4)){
            producto p = new producto("Enchufe Inteligente Smart Plug Wifi Control App Color Blanco", "/cinyumarket/images/image-removebg-preview (3).png", MenuLoginController.nom, 26990, 1);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC5)){
            producto p = new producto("Bascula inteligente Color Blanco", "/cinyumarket/images/image-removebg-preview (6).png", MenuLoginController.nom, 816000, 1);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnC6)){
            producto p = new producto("Lampara de mesa inteligente", "/cinyumarket/images/image-removebg-preview (9).png", MenuLoginController.nom, 127000, 1);
            cola.agregarProducto(p);
        }
        if(evt.equals(btnD1)){
            producto p = new producto("Asistente Virtual Alexa 110V/240V Color Negro", "/cinyumarket/images/image-removebg-preview (2).png", MenuLoginController.nom, 195393, 1);
            cola2.agregarProducto(p);
        }
        if(evt.equals(btnD2)){
            producto p = new producto("Cerradura digital inteligente", "/cinyumarket/images/image-removebg-preview (5).png", MenuLoginController.nom, 1236000, 1);
            cola2.agregarProducto(p);
        }
        if(evt.equals(btnD3)){
            producto p = new producto("Corrector de postura digital", "/cinyumarket/images/image-removebg-preview (7).png", MenuLoginController.nom, 490000, 1);
            cola2.agregarProducto(p);
        }
        if(evt.equals(btnD4)){
            producto p = new producto("Enchufe Inteligente Smart Plug Wifi Control App Color Blanco", "/cinyumarket/images/image-removebg-preview (3).png", MenuLoginController.nom, 26990, 1);
            cola2.agregarProducto(p);
        }
        if(evt.equals(btnD5)){
            producto p = new producto("Bascula inteligente Color Blanco", "/cinyumarket/images/image-removebg-preview (6).png", MenuLoginController.nom, 816000, 1);
            cola2.agregarProducto(p);
        }
        if(evt.equals(btnD6)){
            producto p = new producto("Lampara de mesa inteligente", "/cinyumarket/images/image-removebg-preview (9).png", MenuLoginController.nom, 127000, 1);
            cola2.agregarProducto(p);
        }
        if(evt.equals(btnCarrito)){
            loadStage("/cinyumarket/carrito.fxml", e);
        }
        if(evt.equals(btnDeseos)){
            loadStage("/cinyumarket/deseos.fxml", e);
        }
        if(evt.equals(btnBack)){
            loadStage("/cinyumarket/login.fxml", e);
        }
        if(evt.equals(btnHistorial)){
            loadStage("/cinyumarket/historial.fxml", e);
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
