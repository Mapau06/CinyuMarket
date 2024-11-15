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
    
    public void añadirHistorial (producto p){
        pila.push(p);
    }
    
    public Stack<producto> getHistorial() {
        return pila;
    }
}
