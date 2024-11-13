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
public class colaCarrito {
    public static Queue<producto> cola;
    
    public colaCarrito(){
        this.cola = new LinkedList<>();
    }
    
    public void agregarProducto(producto prod) {
        boolean existe = false;

        for (producto p : cola) {
            if (p.getNombre().equals(prod.getNombre()) && p.comprador.equals(MenuLoginController.nom)) {  
                p.setCantidad(p.getCantidad() + 1);  
                existe = true;
                JOptionPane.showMessageDialog(null, "Producto agregado al carrito: " + prod.getNombre());
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
            if(elim.nombre.equals(nombreProducto)){
                cola.remove(elim);
                break;
            }
        }
    }

    public void comprarProductoPorNombre(String nombreProducto) {
        producto productoComprado = null;
        for (producto prod : cola) {
            if (prod.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoComprado = prod;
                break;
            }
        }

        if (productoComprado != null) {
            System.out.println("Comprando producto: " + productoComprado.getNombre() + " - Precio: $" + productoComprado.getPrecio());
            cola.remove(productoComprado);
        } else {
            System.out.println("El producto con el nombre '" + nombreProducto + "' no está en el carrito.");
        }
    }

    public void comprarTodosLosProductos() {
        if (cola.isEmpty()) {
            System.out.println("El carrito está vacío, no hay productos para comprar.");
            return;
        }

        float total = 0;
        System.out.println("Procesando compra de todos los productos:");

        for (producto prod : cola) {
            System.out.println("Comprando producto: " + prod.getNombre() + " - Precio: $" + prod.getPrecio());
            total += prod.getPrecio();
        }

        cola.clear(); 
        System.out.println("Compra realizada. Total: $" + total);
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
