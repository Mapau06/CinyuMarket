/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cinyumarket;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
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
    private Button btnBack, btnCarrito, btnDeseos, btnHistorial;
    
    @FXML
    private VBox vbox1, vbox2, vbox3, vbox4, vbox5, vbox6;
    
    public static String nom, pre, img;
    
    public void actualizarCarrito() {
        limpiarCarrito();
        int index = 1; 
        for (producto p : PrincipalController.cola.getProductos()) {
            if (p.comprador.equals(MenuLoginController.nom)){
                if (index == 1) {
                    lbNom1.setText(p.getNombre());
                    lbPre1.setText("$" + p.getPrecio());
                    lbCant1.setText("Cantidad: " + p.getCantidad());
                    String ima1 = p.getFoto();
                    Image image1 = new Image(p.getFoto());
                    img1.setImage(image1);
                    Button btnComprar1 = new Button("Comprar");
                    btnComprar1.getStyleClass().add("boton-comprar");
                    btnComprar1.setOnAction(event -> {
                        nom = lbNom1.getText();
                        pre = lbPre1.getText();
                        img = ima1;
                        loadStage("/cinyumarket/compraProducto.fxml", event);
                    });
                    Button btnEliminar1 = new Button("Eliminar");
                    btnEliminar1.getStyleClass().add("boton-comprar");
                    btnEliminar1.setOnAction(event -> {
                        PrincipalController.cola.eliminarProductoPorNombre(lbNom1.getText());
                        ConfirmacionController.texto = "¡Producto eliminado!";
                        ConfirmacionController.url = "/cinyumarket/carrito.fxml";
                        loadStage("/cinyumarket/confirmacion.fxml", event);
                                
                    });
                    vbox1.getChildren().addAll(btnComprar1, btnEliminar1);
                } else if (index == 2) {
                    lbNom2.setText(p.getNombre());
                    lbPre2.setText("$" + p.getPrecio());
                    lbCant2.setText("Cantidad: " + p.getCantidad());
                    String ima2 = p.getFoto();
                    Image image2 = new Image(p.getFoto());
                    img2.setImage(image2);
                    Button btnComprar2 = new Button("Comprar");
                    btnComprar2.getStyleClass().add("boton-comprar");
                    btnComprar2.setOnAction(event -> {
                        nom = lbNom2.getText();
                        pre = lbPre2.getText();
                        img = ima2;
                        loadStage("/cinyumarket/compraProducto.fxml", event);
                    });
                    Button btnEliminar2 = new Button("Eliminar");
                    btnEliminar2.getStyleClass().add("boton-comprar");
                    btnEliminar2.setOnAction(event -> {
                        PrincipalController.cola.eliminarProductoPorNombre(lbNom2.getText());
                        ConfirmacionController.texto = "¡Producto eliminado!";
                        ConfirmacionController.url = "/cinyumarket/carrito.fxml";
                        loadStage("/cinyumarket/confirmacion.fxml", event);
                                
                    });
                    vbox2.getChildren().addAll(btnComprar2,btnEliminar2);
                } else if (index == 3) {
                    lbNom3.setText(p.getNombre());
                    lbPre3.setText("$" + p.getPrecio());
                    lbCant3.setText("Cantidad: " + p.getCantidad());
                    String ima3 = p.getFoto();
                    Image image3 = new Image(p.getFoto());
                    img3.setImage(image3);
                    Button btnComprar3 = new Button("Comprar");
                    btnComprar3.getStyleClass().add("boton-comprar");
                    btnComprar3.setOnAction(event -> {
                        nom = lbNom3.getText();
                        pre = lbPre3.getText();
                        img = ima3;
                        loadStage("/cinyumarket/compraProducto.fxml", event);
                    });
                    Button btnEliminar3 = new Button("Eliminar");
                    btnEliminar3.getStyleClass().add("boton-comprar");
                    btnEliminar3.setOnAction(event -> {
                        PrincipalController.cola.eliminarProductoPorNombre(lbNom3.getText());
                        ConfirmacionController.texto = "¡Producto eliminado!";
                        ConfirmacionController.url = "/cinyumarket/carrito.fxml";
                        loadStage("/cinyumarket/confirmacion.fxml", event);
                                
                    });
                    vbox3.getChildren().addAll(btnComprar3,btnEliminar3);
                } else if (index == 4) {
                    lbNom4.setText(p.getNombre());
                    lbPre4.setText("$" + p.getPrecio());
                    lbCant4.setText("Cantidad: " + p.getCantidad());
                    String ima4 = p.getFoto();
                    Image image4 = new Image(p.getFoto());
                    img4.setImage(image4);
                    Button btnComprar4 = new Button("Comprar");
                    btnComprar4.getStyleClass().add("boton-comprar");
                    btnComprar4.setOnAction(event -> {
                        nom = lbNom4.getText();
                        pre = lbPre4.getText();
                        img = ima4;
                        loadStage("/cinyumarket/compraProducto.fxml", event);
                    });
                    Button btnEliminar4 = new Button("Eliminar");
                    btnEliminar4.getStyleClass().add("boton-comprar");
                    btnEliminar4.setOnAction(event -> {
                        PrincipalController.cola.eliminarProductoPorNombre(lbNom4.getText());
                        ConfirmacionController.texto = "¡Producto eliminado!";
                        ConfirmacionController.url = "/cinyumarket/carrito.fxml";
                        loadStage("/cinyumarket/confirmacion.fxml", event);
                                
                    });
                    vbox4.getChildren().addAll(btnComprar4,btnEliminar4);
                } else if (index == 5) {
                    lbNom5.setText(p.getNombre());
                    lbPre5.setText("$" + p.getPrecio());
                    lbCant5.setText("Cantidad: " + p.getCantidad());
                    String ima5 = p.getFoto();
                    Image image5 = new Image(p.getFoto());
                    img5.setImage(image5);
                    Button btnComprar5 = new Button("Comprar");
                    btnComprar5.getStyleClass().add("boton-comprar");
                    btnComprar5.setOnAction(event -> {
                        nom = lbNom5.getText();
                        pre = lbPre5.getText();
                        img = ima5;
                        loadStage("/cinyumarket/compraProducto.fxml", event);
                    });
                    Button btnEliminar5 = new Button("Eliminar");
                    btnEliminar5.getStyleClass().add("boton-comprar");
                    btnEliminar5.setOnAction(event -> {
                        PrincipalController.cola.eliminarProductoPorNombre(lbNom5.getText());
                        ConfirmacionController.texto = "¡Producto eliminado!";
                        ConfirmacionController.url = "/cinyumarket/carrito.fxml";
                        loadStage("/cinyumarket/confirmacion.fxml", event);
                                
                    });
                    vbox5.getChildren().addAll(btnComprar5,btnEliminar5);
                } else if (index == 6) {
                    lbNom6.setText(p.getNombre());
                    lbPre6.setText("$" + p.getPrecio());
                    lbCant6.setText("Cantidad: " + p.getCantidad());
                    String ima6 = p.getFoto();
                    Image image6 = new Image(p.getFoto());
                    img6.setImage(image6);
                    Button btnComprar6 = new Button("Comprar");
                    btnComprar6.getStyleClass().add("boton-comprar");
                    btnComprar6.setOnAction(event -> {
                        nom = lbNom6.getText();
                        pre = lbPre6.getText();
                        img = ima6;
                        loadStage("/cinyumarket/compraProducto.fxml", event);
                    });
                    Button btnEliminar6 = new Button("Eliminar");
                    btnEliminar6.getStyleClass().add("boton-comprar");
                    btnEliminar6.setOnAction(event -> {
                        PrincipalController.cola.eliminarProductoPorNombre(lbNom6.getText());
                        ConfirmacionController.texto = "¡Producto eliminado!";
                        ConfirmacionController.url = "/cinyumarket/carrito.fxml";
                        loadStage("/cinyumarket/confirmacion.fxml", event);
                                
                    });
                    vbox6.getChildren().addAll(btnComprar6,btnEliminar6);
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
        if(evt.equals(btnHistorial)){
            loadStage("/cinyumarket/historial.fxml", e);
        }
    }
    
    public void limpiarCarrito() {
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
