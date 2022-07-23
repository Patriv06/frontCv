package com.ejemplo.SpringBoot.repository;



import com.ejemplo.SpringBoot.model.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository<Estudios, Long>{
    
}