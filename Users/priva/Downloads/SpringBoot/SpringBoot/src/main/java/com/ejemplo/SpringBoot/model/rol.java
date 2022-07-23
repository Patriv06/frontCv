
package com.ejemplo.SpringBoot.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ejemplo.SpringBoot.security.enumerado.RolEnumerado;


@Entity
public class rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolEnumerado rolNombre;

    public rol() {
    }

    public rol(RolEnumerado rolNombre) {
        this.rolNombre = rolNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolEnumerado getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolEnumerado rolNombre) {
        this.rolNombre = rolNombre;
    }

   
}
