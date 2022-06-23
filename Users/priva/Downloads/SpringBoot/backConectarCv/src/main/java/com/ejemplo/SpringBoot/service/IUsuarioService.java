
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    public List<Usuario> verUsuario();
    
    public void crearUsuario(Usuario us);
    
    public void borrarUsuario(Long id);
    
    public Usuario buscarUsuario(Usuario usu);
    
    public void modificarUsuario(Usuario usu);
    
}
