
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Idioma;
import com.ejemplo.SpringBoot.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService{
@Autowired
    public IdiomaRepository idioRepo;

    @Override
    public List<Idioma> verIdiomas() {
        return idioRepo.findAll();
       }

    @Override
    public void crearIdiomas(Idioma idm) {
        idioRepo.save(idm);
        }

    @Override
    public void borrarIdiomas(Long id) {
        idioRepo.deleteById(id);
        }

    @Override
    public Idioma buscarIdiomas(Long id) {
        return idioRepo.findById(id).orElse(null);
        }

    @Override
    public void modificarIdiomas(Idioma idi) {
        idioRepo.save(idi);
        }
    
}
