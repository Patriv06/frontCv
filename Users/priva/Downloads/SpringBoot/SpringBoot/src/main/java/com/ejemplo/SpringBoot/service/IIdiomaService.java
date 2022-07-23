
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    public List<Idioma> verIdiomas();
    
    public void crearIdiomas(Idioma idm);
    
    public void borrarIdiomas(Long id);
    
    public Idioma buscarIdiomas(Long id);
    
    public void modificarIdiomas(Idioma idi);
    
}
