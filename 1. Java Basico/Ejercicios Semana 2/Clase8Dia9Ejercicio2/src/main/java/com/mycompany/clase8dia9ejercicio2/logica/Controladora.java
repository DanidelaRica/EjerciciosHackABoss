
package com.mycompany.clase8dia9ejercicio2.logica;

import com.mycompany.clase8dia9ejercicio2.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPlatillo(Platillo plati){
        controlPersis.crearPlatillo(plati);
    }
    
    public void borrarPlatillo(Long id) {
        controlPersis.borrarPlatillo(id);
    }

    public List<Platillo> traerPlatillos() {
            return controlPersis.traerPlatillos();
    }

    public Platillo traerPlatillo(Long id) {
        return controlPersis.traerPlatillo(id);
    }

    public void modificarPlatillo(Platillo plati) {
        controlPersis.modificarPlatillo(plati);
    }
}
