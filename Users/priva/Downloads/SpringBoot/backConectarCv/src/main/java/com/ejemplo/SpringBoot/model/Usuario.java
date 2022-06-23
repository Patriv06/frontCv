
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Usuario implements Serializable{
     @Id
     private String email;
     private String password;

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Usuario() {
    }
     
     
}
