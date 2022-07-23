
package com.ejemplo.SpringBoot.service;


import com.ejemplo.SpringBoot.model.Estudios;
import com.ejemplo.SpringBoot.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService{
@Autowired

    public EstudiosRepository estrep;
    @Override
    public List<Estudios> verEstudios() {
        return estrep.findAll();
        
       }

    @Override
    public void crearEstudios(Estudios est) {
        estrep.save(est);
        }

    @Override
    public void borrarEstudios(Long id) {
        estrep.deleteById(id);
        }

    @Override
    public Estudios buscarEstudios(Long id) {
        return estrep.findById(id).orElse(null);
        }

    @Override
    public void modificarEstudios(Estudios estud) {
        estrep.save(estud);
        }

    @Override
    public List<Estudios> verEtudiosOrdenados() {
        Sort sortOrder = Sort.by("fechainicEstudios").descending(); 
 
       return estrep.findAll(sortOrder);

    }
}

   
