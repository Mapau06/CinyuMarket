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
public class DeseosController implements Initializable {

    @FXML
    private Label lbNom1, lbPre1, lbNom2, lbPre2, lbNom3, lbPre3,
            lbNom4, lbPre4, lbNom5, lbPre5, lbNom6, lbPre6; 
    @FXML
    private ImageView img1, img2, img3, img4, img5, img6,
            btnimg1, btnimg2, btnimg3, btnimg4, btnimg5, btnimg6;
    
    @FXML
    private Button btnBack, btnCarrito, btnDeseos,
            btn1, btn2, btn3, btn4, btn5, btn6;
    
    
    public void actualizarDeseos() {
        int index = 1; 
        limpiarDeseos();
        for (producto p : PrincipalController.cola2.getProductos()) {
            if (p.comprador.equals(MenuLoginController.nom)){
                if (index == 1) {
                    lbNom1.setText(p.getNombre());
                    lbPre1.setText("$" + p.getPrecio());
                    Image image1 = new Image(p.getFoto());
                    img1.setImage(image1);
                    Image btnimage1 = new Image("/cinyumarket/images/corazon_rojo.png");
                    btnimg1.setImage(btnimage1);
                } else if (index == 2) {
                    lbNom2.setText(p.getNombre());
                    lbPre2.setText("$" + p.getPrecio());
                    Image image2 = new Image(p.getFoto());
                    img2.setImage(image2);
                    Image btnimage2 = new Image("/cinyumarket/images/corazon_rojo.png");
                    btnimg2.setImage(btnimage2);
                } else if (index == 3) {
                    lbNom3.setText(p.getNombre());
                    lbPre3.setText("$" + p.getPrecio());
                    Image image3 = new Image(p.getFoto());
                    img3.setImage(image3);
                    Image btnimage3 = new Image("/cinyumarket/images/corazon_rojo.png");
                    btnimg3.setImage(btnimage3);
                } else if (index == 4) {
                    lbNom4.setText(p.getNombre());
                    lbPre4.setText("$" + p.getPrecio());
                    Image image4 = new Image(p.getFoto());
                    img4.setImage(image4);
                    Image btnimage4 = new Image("/cinyumarket/images/corazon_rojo.png");
                    btnimg4.setImage(btnimage4);
                } else if (index == 5) {
                    lbNom5.setText(p.getNombre());
                    lbPre5.setText("$" + p.getPrecio());
                    Image image5 = new Image(p.getFoto());
                    img5.setImage(image5);
                    Image btnimage5 = new Image("/cinyumarket/images/corazon_rojo.png");
                    btnimg5.setImage(btnimage5);
                } else if (index == 6) {
                    lbNom6.setText(p.getNombre());
                    lbPre6.setText("$" + p.getPrecio());
                    Image image6 = new Image(p.getFoto());
                    img6.setImage(image6);
                    Image btnimage6 = new Image("/cinyumarket/images/corazon_rojo.png");
                    btnimg6.setImage(btnimage6);
                }
                index++;
                if (index > 6) break; 
            }
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
        if(evt.equals(btn1)){
            String elim = lbNom1.getText();
            PrincipalController.cola2.eliminarProductoPorNombre(elim);
            actualizarDeseos();
        }
        if(evt.equals(btn2)){
            String elim = lbNom2.getText();
            PrincipalController.cola2.eliminarProductoPorNombre(elim);
            actualizarDeseos();
        }
        if(evt.equals(btn3)){
            String elim = lbNom3.getText();
            PrincipalController.cola2.eliminarProductoPorNombre(elim);
            actualizarDeseos();
        }
        if(evt.equals(btn4)){
            String elim = lbNom4.getText();
            PrincipalController.cola2.eliminarProductoPorNombre(elim);
            actualizarDeseos();
        }
        if(evt.equals(btn5)){
            String elim = lbNom5.getText();
            PrincipalController.cola2.eliminarProductoPorNombre(elim);
            actualizarDeseos();
        }
        if(evt.equals(btn6)){
            String elim = lbNom6.getText();
            PrincipalController.cola2.eliminarProductoPorNombre(elim);
            actualizarDeseos();
        }
    }
    
    public void limpiarDeseos() {
        lbNom1.setText("");
        lbPre1.setText("");
        img1.setImage(null);
        btnimg1.setImage(null);

        lbNom2.setText("");
        lbPre2.setText("");
        img2.setImage(null);
        btnimg2.setImage(null);

        lbNom3.setText("");
        lbPre3.setText("");
        img3.setImage(null);
        btnimg3.setImage(null);

        lbNom4.setText("");
        lbPre4.setText("");
        img4.setImage(null);
        btnimg4.setImage(null);

        lbNom5.setText("");
        lbPre5.setText("");
        img5.setImage(null);
        btnimg5.setImage(null);

        lbNom6.setText("");
        lbPre6.setText("");
        img6.setImage(null);
        btnimg6.setImage(null);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        actualizarDeseos();
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
