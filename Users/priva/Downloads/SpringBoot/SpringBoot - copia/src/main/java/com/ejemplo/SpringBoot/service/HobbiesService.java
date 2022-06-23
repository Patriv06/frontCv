
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Hobbies;
import com.ejemplo.SpringBoot.repository.HobbiesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbiesService implements IHobbiesService{
@Autowired
    public HobbiesRepository hobbRepo;
    @Override
    public List<Hobbies> verHobbies() {
        
        return hobbRepo.findAll();
        
    }

    @Override
    public void crearHobbies(Hobbies hobb) {
        hobbRepo.save(hobb);
        
    }

    @Override
    public void borrarHobbies(Long id) {
        hobbRepo.deleteById(id);
        
    }

    @Override
    public Hobbies buscarHobbies(Long id) {
          return hobbRepo.findById(id).orElse(null);
            }

    @Override
    public void modificarHobbiues(Hobbies hob) {
        hobbRepo.save(hob);
    }
    
}
