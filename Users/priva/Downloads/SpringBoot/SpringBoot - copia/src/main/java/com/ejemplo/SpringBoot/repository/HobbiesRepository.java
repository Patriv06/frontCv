
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Hobbies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbiesRepository extends JpaRepository<Hobbies, Long>{
    
}
