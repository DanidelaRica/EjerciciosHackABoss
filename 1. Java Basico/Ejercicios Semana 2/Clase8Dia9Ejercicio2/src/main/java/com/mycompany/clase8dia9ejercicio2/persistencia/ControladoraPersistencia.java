
package com.mycompany.clase8dia9ejercicio2.persistencia;

import com.mycompany.clase8dia9ejercicio2.logica.Platillo;
import com.mycompany.clase8dia9ejercicio2.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    PlatilloJpaController platiJPA = new PlatilloJpaController();
    
     public void crearPlatillo(Platillo plati){
        platiJPA.create(plati);
    }
    
    public void borrarPlatillo(Long id) {
        try {
            platiJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public List<Platillo> traerPlatillos(){
        return platiJPA.findPlatilloEntities();
    }
    
     public Platillo traerPlatillo(Long id) {
            return platiJPA.findPlatillo(id);
    }
    
    public void modificarPlatillo (Platillo plati) {
        try {
            platiJPA.edit(plati);
        } catch (Exception ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
