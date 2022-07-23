
package com.ejemplo.SpringBoot.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ejemplo.SpringBoot.model.usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<usuario, Integer> {
    Optional <usuario> findByNombreUsuario(String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
