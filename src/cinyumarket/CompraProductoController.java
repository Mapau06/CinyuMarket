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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Paula
 */
public class CompraProductoController implements Initializable {
    @FXML
    private Button btnBack, btnCarrito, btnDeseos, btnComprar, btnHistorial;
    
    @FXML
    private ImageView img1;
    
    @FXML
    private Label lbNom1, lbPre1;
    
    @FXML
    private TextField correo, nombre, direccion;
    
    public void actionEvent(ActionEvent e){
        Object evt = e.getSource();
        
        if(evt.equals(btnComprar)){
            if(!correo.getText().equals("") && !nombre.getText().equals("") && !direccion.getText().equals("")){
                producto p = new producto(CarritoController.nom, CarritoController.img, MenuLoginController.nom
                        , Float.parseFloat(CarritoController.pre.replace("$", "")), 1);
                PrincipalController.cola.eliminarProductoPorNombre(CarritoController.nom);
                PrincipalController.pila.añadirHistorial(p);
                ConfirmacionController.texto = "¡Compra exitosa!";
                ConfirmacionController.url = "/cinyumarket/historial.fxml";
                loadStage("/cinyumarket/confirmacion.fxml", e);
            }else{
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }
        }
        if(evt.equals(btnCarrito)){
            loadStage("/cinyumarket/carrito.fxml", e);
        }
        if(evt.equals(btnDeseos)){
            loadStage("/cinyumarket/deseos.fxml", e);
        }
        if(evt.equals(btnBack)){
            loadStage("/cinyumarket/principal.fxml", e);
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
        Image image = new Image(CarritoController.img);
        img1.setImage(image);
        lbNom1.setText(CarritoController.nom);
        lbPre1.setText(CarritoController.pre);
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
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE,null, ex);
        }     
    }
    
}
