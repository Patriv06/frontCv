/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Idioma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreIdioma;
    private String nivelIdioma;

  //  @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name= "idPersona")
  //  private Persona person;
    
    public Idioma() {
    }

    public Idioma(Long id, String nombreIdioma, String nivelIdioma, Persona person) {
        this.id = id;
        this.nombreIdioma = nombreIdioma;
        this.nivelIdioma = nivelIdioma;
      //  this.person = person;
    }

    
    
    

     
    
    
}
