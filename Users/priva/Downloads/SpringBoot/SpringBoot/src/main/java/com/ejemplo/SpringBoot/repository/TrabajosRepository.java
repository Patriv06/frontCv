
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Trabajos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajosRepository extends JpaRepository<Trabajos, Long> {
    
}
