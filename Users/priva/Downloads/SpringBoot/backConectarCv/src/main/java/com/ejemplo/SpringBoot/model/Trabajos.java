/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechainicTrabajo;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechafinTrabajo;
    
   

    public Trabajos() {
    }

    public Trabajos(Long id, String nombreTrabajo, String puestoTrabajo, String descripcionTrabajo, String tipoTrabajo, String redesTrabajo, Date fechainicTrabajo, Date fechafinTrabajo ){
        this.id = id;
        this.nombreTrabajo = nombreTrabajo;
        this.puestoTrabajo = puestoTrabajo;
        this.descripcionTrabajo = descripcionTrabajo;
        this.tipoTrabajo = tipoTrabajo;
        this.redesTrabajo = redesTrabajo;
        this.fechainicTrabajo = fechainicTrabajo;
        this.fechafinTrabajo = fechafinTrabajo;
     //   this.person = person;
    }

    

    

}
