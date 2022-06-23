package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Estudios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tituloEstudios;
    private String institucionEstudios;
    private String nivelEstudios;
    private String redesEstudios;
    
    
    
  //  @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name= "idPersona")
  //  private Persona person;

    public Estudios() {
    }

    public Estudios(Long id, String tituloEstudios, String institucionEstudios, String nivelEstudios, String redesEstudios, Persona person) {
        this.id = id;
        this.tituloEstudios = tituloEstudios;
        this.institucionEstudios = institucionEstudios;
        this.nivelEstudios = nivelEstudios;
        this.redesEstudios = redesEstudios;
      //  this.person = person;
    }
    
    

}