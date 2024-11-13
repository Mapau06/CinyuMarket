/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cinyumarket;

import java.io.IOException;
import java.net.URL;
import java.util.Queue;
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
public class CarritoController implements Initializable {
    
    @FXML
    private Label lbNom1, lbPre1, lbCant1, lbNom2, lbPre2, lbCant2, lbNom3, lbPre3, lbCant3,
            lbNom4, lbPre4, lbCant4, lbNom5, lbPre5, lbCant5, lbNom6, lbPre6, lbCant6; 
    @FXML
    private ImageView img1, img2, img3, img4, img5, img6;
    
    @FXML
    private Button btnBack, btnCarrito, btnDeseos;
    
    @FXML
    private VBox vbox1, vbox2, vbox3, vbox4, vbox5, vbox6;
    
    public void actualizarCarrito() {
        int index = 1; 
        for (producto p : PrincipalController.cola.getProductos()) {

            if (index == 1) {
                lbNom1.setText(p.getNombre());
                lbPre1.setText("$" + p.getPrecio());
                lbCant1.setText("Cantidad: " + p.getCantidad());
                Image image1 = new Image(p.getFoto());
                img1.setImage(image1);
                Button btnComprar1 = new Button("Comprar");
                btnComprar1.getStyleClass().add("boton-comprar");
                vbox1.getChildren().add(btnComprar1);
            } else if (index == 2) {
                lbNom2.setText(p.getNombre());
                lbPre2.setText("$" + p.getPrecio());
                lbCant2.setText("Cantidad: " + p.getCantidad());
                Image image2 = new Image(p.getFoto());
                img2.setImage(image2);
                Button btnComprar2 = new Button("Comprar");
                btnComprar2.getStyleClass().add("boton-comprar");
                vbox2.getChildren().add(btnComprar2);
            } else if (index == 3) {
                lbNom3.setText(p.getNombre());
                lbPre3.setText("$" + p.getPrecio());
                lbCant3.setText("Cantidad: " + p.getCantidad());
                Image image3 = new Image(p.getFoto());
                img3.setImage(image3);
                Button btnComprar3 = new Button("Comprar");
                btnComprar3.getStyleClass().add("boton-comprar");
                vbox3.getChildren().add(btnComprar3);
            } else if (index == 4) {
                lbNom4.setText(p.getNombre());
                lbPre4.setText("$" + p.getPrecio());
                lbCant4.setText("Cantidad: " + p.getCantidad());
                Image image4 = new Image(p.getFoto());
                img4.setImage(image4);
                Button btnComprar4 = new Button("Comprar");
                btnComprar4.getStyleClass().add("boton-comprar");
                vbox4.getChildren().add(btnComprar4);
            } else if (index == 5) {
                lbNom5.setText(p.getNombre());
                lbPre5.setText("$" + p.getPrecio());
                lbCant5.setText("Cantidad: " + p.getCantidad());
                Image image5 = new Image(p.getFoto());
                img5.setImage(image5);
                Button btnComprar5 = new Button("Comprar");
                btnComprar5.getStyleClass().add("boton-comprar");
                vbox5.getChildren().add(btnComprar5);
            } else if (index == 6) {
                lbNom6.setText(p.getNombre());
                lbPre6.setText("$" + p.getPrecio());
                lbCant6.setText("Cantidad: " + p.getCantidad());
                Image image6 = new Image(p.getFoto());
                img6.setImage(image6);
                Button btnComprar6 = new Button("Comprar");
                btnComprar6.getStyleClass().add("boton-comprar");
                vbox6.getChildren().add(btnComprar6);
            }
            index++;
            if (index > 6) break; 
        }
    }
    
    public void actionEvent(ActionEvent e){
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
        actualizarCarrito();
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
