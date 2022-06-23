
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersona();
    
    public void crearPersona(Persona pers);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPErsona(Long id);
    
    public void modificarPersona(Persona per);
}
