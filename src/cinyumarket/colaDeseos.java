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
        cola.add(prod);
        JOptionPane.showMessageDialog(null, "Producto agregado a deseos: " + prod.getNombre());
    }

    // Método para eliminar un producto específico por su nombre
    public void eliminarProductoPorNombre(String nombreProducto) {
        for (producto elim : cola){
            if(elim.nombre.equals(nombreProducto)){
                cola.remove(elim);
                break;
            }
        }
    }

    // Método para comprar un producto específico por su nombre
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

    // Método para procesar la compra de todos los productos en el carrito
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

        cola.clear(); // Vacía el carrito después de comprar
        System.out.println("Compra realizada. Total: $" + total);
    }
}
