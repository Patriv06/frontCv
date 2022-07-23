
package com.ejemplo.SpringBoot.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ejemplo.SpringBoot.model.rol;
import com.ejemplo.SpringBoot.security.enumerado.RolEnumerado;

@Repository
public interface RolRepository extends JpaRepository<rol, Integer> {
    Optional<rol> findByRolNombre(RolEnumerado rolNombre);
}
