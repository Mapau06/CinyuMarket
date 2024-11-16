/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinyumarket;

import java.util.Stack;

/**
 *
 * @author Paula
 */
public class pilaHistorial {
    public static Stack<producto> pila;
    
    public pilaHistorial(){
        this.pila = new Stack();
    }
    
    public void añadirHistorial (producto prod){
        boolean existe = false;
        
        for (producto p : pila) {
            if (p.getNombre().equals(prod.getNombre()) && p.comprador.equals(MenuLoginController.nom)) {  
                p.setCantidad(p.getCantidad() + 1);  
                existe = true;
                break;
            }
        }
        if (!existe && prod.comprador.equals(MenuLoginController.nom)) {
            pila.push(prod);
        }
    }
    
    public Stack<producto> getHistorial() {
        return pila;
    }
}
