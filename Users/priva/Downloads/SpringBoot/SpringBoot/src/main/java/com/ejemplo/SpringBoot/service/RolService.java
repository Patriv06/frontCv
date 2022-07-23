
package com.ejemplo.SpringBoot.service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejemplo.SpringBoot.model.rol;
import com.ejemplo.SpringBoot.security.enumerado.RolEnumerado;
import com.ejemplo.SpringBoot.repository.RolRepository;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;
    public Optional<rol> getbyRolNombre(RolEnumerado rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
}
