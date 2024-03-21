
package com.mycompany.clase10dia11ejercicio1.logica;

import com.mycompany.clase10dia11ejercicio1.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearVoto(Voto voto) {
        controlPersis.crearVoto(voto);
    }

    public void eliminarVoto(int id) {
        controlPersis.eliminarVoto(id);
    }

    public List<Voto> traerVotos() {
        return controlPersis.traerVotos();
    }

    public void editarVoto(Voto voto) {
        controlPersis.editarVoto(voto);
    }
}    
