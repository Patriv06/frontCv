
package com.ejemplo.SpringBoot.model;



import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersona;

    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    private String objetivos;
    private String sobreMi;
    
   // @OneToMany(fetch = FetchType.LAZY)
   // @JoinColumn(name="idPersona")
  //  private Set<Idioma> idioma;
    
   // @OneToMany(fetch = FetchType.LAZY)
   // @JoinColumn(name="idPersona")
   // private Set<Trabajos> trabajos;
    
    // @OneToMany(fetch = FetchType.LAZY)
   // @JoinColumn(name="idPersona")
   // private Set<Hobbies> hobbies;
    
   //   @OneToMany(fetch = FetchType.LAZY)
   // @JoinColumn(name="idPersona")
  //  private Set<Estudios> estudios;
 

    public Persona() {
    }

    public Persona(Long idPersona, String nombre, String apellido, String telefono, String mail, String objetivos, String sobreMi, Set<Idioma> idioma, Set<Trabajos> trabajos, Set<Hobbies> hobbies, Set<Estudios> estudios) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        this.objetivos = objetivos;
        this.sobreMi = sobreMi;
        //this.idioma = idioma;
       // this.trabajos = trabajos;
       // this.hobbies = hobbies;
       // this.estudios = estudios;
    }

    

    
    
    
    

   
    
    
}
