
package com.ejemplo.SpringBoot.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.ejemplo.SpringBoot.model.usuario;
import com.ejemplo.SpringBoot.model.usuarioPrincipal;
import com.ejemplo.SpringBoot.service.UsuarioService;
import org.springframework.context.annotation.Bean;

@Service

public class UserDatailServiceImpl implements UserDetailsService {
    @Autowired
    
    UsuarioService usuarioService;
    @Override
    @Bean
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        usuario Usu = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return usuarioPrincipal.build(Usu);
    }
    
}
