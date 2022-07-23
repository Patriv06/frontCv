package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

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
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechainicEstudios;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechafinEstudios;
    
    
    
  

    public Estudios() {
    }

    public Estudios(Long id, String tituloEstudios, String institucionEstudios, String nivelEstudios, String redesEstudios, Date fechainicEstudios, Date fechafinEstudios) {
        this.id = id;
        this.tituloEstudios = tituloEstudios;
        this.institucionEstudios = institucionEstudios;
        this.nivelEstudios = nivelEstudios;
        this.redesEstudios = redesEstudios;
        this.fechainicEstudios = fechainicEstudios;
        this.fechafinEstudios = fechafinEstudios;
     
    }
    
    

}