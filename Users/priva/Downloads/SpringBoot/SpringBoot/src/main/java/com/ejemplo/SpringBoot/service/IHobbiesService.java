
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Hobbies;
import java.util.List;


public interface IHobbiesService {
    
public List<Hobbies> verHobbies();
    
    public void crearHobbies(Hobbies hobb);
    
    public void borrarHobbies(Long id);
    
    public Hobbies buscarHobbies(Long id);
    
    public void modificarHobbiues(Hobbies hobb);
}
