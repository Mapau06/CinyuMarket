/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinyumarket;

/**
 *
 * @author Paula
 */
public class usuario {
    String nombre, contraseña;
    usuario sig;

    public usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        sig = null;
    }
}
