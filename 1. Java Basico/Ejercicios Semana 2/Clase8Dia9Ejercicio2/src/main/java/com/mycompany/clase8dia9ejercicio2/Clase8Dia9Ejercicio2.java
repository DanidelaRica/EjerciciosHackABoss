/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase8dia9ejercicio2;

import com.mycompany.clase8dia9ejercicio2.logica.Controladora;
import com.mycompany.clase8dia9ejercicio2.logica.Platillo;
import com.mycompany.clase8dia9ejercicio2.persistencia.ControladoraPersistencia;
import java.util.List;


public class Clase8Dia9Ejercicio2 {

    public static void main(String[] args) {
        Controladora control = new Controladora ();
        
        Platillo plati1 = new Platillo ("Croquetas","Carne",10);
        
        control.crearPlatillo(plati1);
        
        Platillo plati2 = new Platillo ("Macarrones","Pasta",8);
        Platillo plati3 = new Platillo ("Pizza","Pan",12);
        
        control.crearPlatillo(plati2);
        control.crearPlatillo(plati3);
        
        control.borrarPlatillo(2L);
        
        Platillo platillo = control.traerPlatillo(3L);
        platillo.setPrecio(15);
        control.modificarPlatillo(platillo);
                
        List<Platillo> listaPlatillos = control.traerPlatillos();
        
        //usando for each para recorrer la collection
        System.out.println("----Lista de platillos----");
        for (Platillo elemento:listaPlatillos) {
            System.out.println(elemento.toString());
        }
    }
}
