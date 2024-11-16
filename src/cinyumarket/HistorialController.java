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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Paula
 */
public class HistorialController implements Initializable {
    
    @FXML
    private Label lbNom1, lbPre1, lbCant1, lbNom2, lbPre2, lbCant2, lbNom3, lbPre3, lbCant3,
            lbNom4, lbPre4, lbCant4, lbNom5, lbPre5, lbCant5, lbNom6, lbPre6, lbCant6; 
    @FXML
    private ImageView img1, img2, img3, img4, img5, img6;
    
    @FXML
    private Button btnBack, btnCarrito, btnDeseos;
    
    @FXML
    private VBox vbox1, vbox2, vbox3, vbox4, vbox5, vbox6;
    
    public void actualizarHistorial() {
        limpiarHistorial();
        int index = 1; 
        for (producto p : PrincipalController.pila.getHistorial()) {
            if (p.comprador.equals(MenuLoginController.nom)){
                if (index == 1) {
                    lbNom1.setText(p.getNombre());
                    lbPre1.setText("$" + p.getPrecio());
                    lbCant1.setText("Cantidad: " + p.getCantidad());
                    String ima1 = p.getFoto();
                    Image image1 = new Image(p.getFoto());
                    img1.setImage(image1);
                } else if (index == 2) {
                    lbNom2.setText(p.getNombre());
                    lbPre2.setText("$" + p.getPrecio());
                    lbCant2.setText("Cantidad: " + p.getCantidad());
                    String ima2 = p.getFoto();
                    Image image2 = new Image(p.getFoto());
                    img2.setImage(image2);
                } else if (index == 3) {
                    lbNom3.setText(p.getNombre());
                    lbPre3.setText("$" + p.getPrecio());
                    lbCant3.setText("Cantidad: " + p.getCantidad());
                    String ima3 = p.getFoto();
                    Image image3 = new Image(p.getFoto());
                    img3.setImage(image3);
                } else if (index == 4) {
                    lbNom4.setText(p.getNombre());
                    lbPre4.setText("$" + p.getPrecio());
                    lbCant4.setText("Cantidad: " + p.getCantidad());
                    String ima4 = p.getFoto();
                    Image image4 = new Image(p.getFoto());
                    img4.setImage(image4);
                } else if (index == 5) {
                    lbNom5.setText(p.getNombre());
                    lbPre5.setText("$" + p.getPrecio());
                    lbCant5.setText("Cantidad: " + p.getCantidad());
                    String ima5 = p.getFoto();
                    Image image5 = new Image(p.getFoto());
                    img5.setImage(image5);
                } else if (index == 6) {
                    lbNom6.setText(p.getNombre());
                    lbPre6.setText("$" + p.getPrecio());
                    lbCant6.setText("Cantidad: " + p.getCantidad());
                    String ima6 = p.getFoto();
                    Image image6 = new Image(p.getFoto());
                    img6.setImage(image6);
                }
                index++;
                if (index > 6) break; 
            }
        }
    }
    
    public void limpiarHistorial() {
        lbNom1.setText("");
        lbPre1.setText("");
        lbCant1.setText("");
        img1.setImage(null);

        lbNom2.setText("");
        lbPre2.setText("");
        lbCant2.setText("");
        img2.setImage(null);

        lbNom3.setText("");
        lbPre3.setText("");
        lbCant3.setText("");
        img3.setImage(null);

        lbNom4.setText("");
        lbPre4.setText("");
        lbCant4.setText("");
        img4.setImage(null);

        lbNom5.setText("");
        lbPre5.setText("");
        lbCant5.setText("");
        img5.setImage(null);

        lbNom6.setText("");
        lbPre6.setText("");
        lbCant6.setText("");
        img6.setImage(null);
    }
    
    public void actionEvent (ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnCarrito)){
            loadStage("/cinyumarket/carrito.fxml", e);
        }
        if(evt.equals(btnDeseos)){
            loadStage("/cinyumarket/deseos.fxml", e);
        }
        if(evt.equals(btnBack)){
            loadStage("/cinyumarket/principal.fxml", e);
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        actualizarHistorial();
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
