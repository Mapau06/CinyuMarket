/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinyumarket;

import static cinyumarket.LoginController.exit;
import static cinyumarket.LoginController.log;
import static cinyumarket.LoginController.reg;
import static cinyumarket.LoginController.rexit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Paula
 */
public class listausuarios {
    public static usuario cab;
    
    public listausuarios () { cab=null; }
    
    public usuario buscar_nombre(String user){
        usuario u = cab;
        if(cab == null)
            return null;
        else{
            while (u != null){
                if ((u.nombre).equals(user))
                    return u;
                else
                    u=u.sig;
            }
            return null;
        }
    }
    
    public usuario nuevo_nodo(String nombre, String contraseña){
        usuario info, p;
        String nom;
        if (nombre.equals("") || contraseña.equals("")){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return null;
        }else{
            do{
                nom = nombre;
                p = buscar_nombre(nom);
                if(p != null){
                    JOptionPane.showMessageDialog(null, "Ya existe una cuenta con ese nombre, ingrese uno diferente!");
                    return null;
                }
            }while(p != null);
            if(p == null){
                info = new usuario(nom, contraseña);
                return info;
            }else{
                return null;
            }
        }
    }
    
    public void añadir_lista(String nombre, String contraseña){
        usuario info = nuevo_nodo(nombre, contraseña);
        if(cab != null){
            info.sig = cab;
            cab = info;
        }else{
            cab = info;
        }
        log.setVisible(false);
        exit.setVisible(false);
        reg.setVisible(false);
        rexit.setVisible(true);
    }
    
    public usuario login(String nombre, String contraseña){
        usuario p = cab;
        if(cab == null)
            return null;
        else{
            while(p != null){
                if((p.nombre).equals(nombre) && (p.contraseña).equals(contraseña))
                    return p;
                else
                    p=p.sig;
            }
            return null;
        }
    }
}
