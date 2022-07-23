
package com.ejemplo.SpringBoot.security;

import org.springframework.http.HttpStatus;


public class Mensaje {
    private String mensaje;
    public Mensaje (String mensaje){
        this.mensaje = mensaje;
    }

    public Mensaje(String usuario_guardado, HttpStatus httpStatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    public String getMensaje(){
        return mensaje;
    }
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    
}
