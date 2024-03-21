
package com.mycompany.clase10dia11ejercicio1.persistencia;

import com.mycompany.clase10dia11ejercicio1.logica.Voto;
import com.mycompany.clase10dia11ejercicio1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    VotoJpaController votoJPA = new VotoJpaController();;

    public void crearVoto(Voto voto) {
        votoJPA.create(voto);
    }

    public void eliminarVoto(int id) {
        try {
            votoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Voto> traerVotos() {
        return votoJPA.findVotoEntities();
    }
    

    public void editarVoto(Voto voto) {
        try {
            votoJPA.edit(voto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
