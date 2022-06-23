
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Trabajos;
import java.util.List;


public interface ITrabajosService {
    public List<Trabajos> verTrabajos();
    
    public void crearTrabajos(Trabajos tra);
    
    public void borrarTrabajos(Long id);
    
    public Trabajos buscarTrabajos(Long id);
    
    public void modifTrabajos(Trabajos trab);
    
}
