/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinyumarket;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class colaDeseos {
    public static Queue<producto> cola;
    
    public colaDeseos(){
        this.cola = new LinkedList<>();
    }
    
    public void agregarProducto(producto prod) {
        boolean existe = false;

        for (producto p : cola) {
            if (p.getNombre().equals(prod.getNombre()) && p.comprador.equals(MenuLoginController.nom)) {  
                existe = true;
                JOptionPane.showMessageDialog(null, "Este producto ya esta en la lista de deseos!");
                break;
            }
        }

        if (!existe && prod.comprador.equals(MenuLoginController.nom)) {
            cola.add(prod);
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito: " + prod.getNombre());
        }
    }

    public void eliminarProductoPorNombre(String nombreProducto) {
        for (producto elim : cola){
            if(elim.nombre.equals(nombreProducto) && elim.comprador.equals(MenuLoginController.nom)){
                cola.remove(elim);
                JOptionPane.showMessageDialog(null, "Producto eliminado de la lista de deseos!");
                break;
            }
        }
    }

    public producto obtenerProducto(String nombreProducto) {
        for (producto prod : cola) {
            if (prod.getNombre().equals(nombreProducto)) {
                return prod;
            }
        }
        return null;  
    }

    public Queue<producto> getProductos() {
        return cola;
    }
}
