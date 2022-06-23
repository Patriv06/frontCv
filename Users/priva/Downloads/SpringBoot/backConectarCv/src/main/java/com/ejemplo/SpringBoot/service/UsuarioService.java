
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Usuario;
import com.ejemplo.SpringBoot.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
       @Autowired
    public UsuarioRepository usRepo;


    @Override
    public List<Usuario> verUsuario() {
      return usRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario us) {
        usRepo.save(us);
    }

    @Override
    public void borrarUsuario(Long id) {
         usRepo.deleteById(id);
    }

 //   @Override
 //   public Usuario buscarUsuario(Long id) {
 //          return usRepo.findById(id).orElse(null);
 //   }

    @Override
    public void modificarUsuario(Usuario usu) {
        usRepo.save(usu);

    }

    @Override
    public Usuario buscarUsuario(Usuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
