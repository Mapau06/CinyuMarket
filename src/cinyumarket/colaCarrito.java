/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinyumarket;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Paula
 */
public class colaCarrito {
    public static Queue<producto> cola;
    
    public colaCarrito(){
        this.cola = new LinkedList<>();
    }
    
    public void añadirAlCarrito(producto p){
        cola.add(p);
    }
}
