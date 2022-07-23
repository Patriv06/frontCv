
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Trabajos;
import com.ejemplo.SpringBoot.repository.TrabajosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class trabajosService implements ITrabajosService {
    
    @Autowired
       public TrabajosRepository trabRepo;
    @Override
    public List<Trabajos> verTrabajos() {
        return trabRepo.findAll();
       }

    @Override
    public void crearTrabajos(Trabajos tra) {
        trabRepo.save(tra);
        }

    @Override
    public void borrarTrabajos(Long id) {
        trabRepo.deleteById(id);
       }

    @Override
    public Trabajos buscarTrabajos(Long id) {
        return trabRepo.findById(id).orElse(null);
        }

    @Override
    public void modifTrabajos(Trabajos trab) {
                trabRepo.save(trab);

        }

    
}
