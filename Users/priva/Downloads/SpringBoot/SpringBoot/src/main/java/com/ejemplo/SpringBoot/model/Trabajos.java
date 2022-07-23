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

/**
 *
 * @author priva
 */

    @Getter @Setter
@Entity
public class Trabajos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreTrabajo;
    private String puestoTrabajo;
    private String descripcionTrabajo;
    private String tipoTrabajo;
    private String redesTrabajo;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name= "idPersona")
    //private Persona person;

    public Trabajos() {
    }

    public Trabajos(Long id, String nombreTrabajo, String puestoTrabajo, String descripcionTrabajo, String tipoTrabajo, String redesTrabajo, Persona person) {
        this.id = id;
        this.nombreTrabajo = nombreTrabajo;
        this.puestoTrabajo = puestoTrabajo;
        this.descripcionTrabajo = descripcionTrabajo;
        this.tipoTrabajo = tipoTrabajo;
        this.redesTrabajo = redesTrabajo;
     //   this.person = person;
    }

    

    

}
