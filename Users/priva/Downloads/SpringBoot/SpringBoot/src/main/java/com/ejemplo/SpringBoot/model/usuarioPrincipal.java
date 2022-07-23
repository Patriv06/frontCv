
package com.ejemplo.SpringBoot.model;

import com.ejemplo.SpringBoot.model.usuario;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


/**
 *
 * @author priva
 */
public class usuarioPrincipal implements UserDetails {
    private String nombre;
     private String nombreUsuario;
     private String email;
     private String password;
    private Collection <? extends GrantedAuthority> authorities;

    /**
     *
     * @param nombre
     * @param nombreUsuario
     * @param email
     * @param password
     * @param authorities
     */
    public usuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    
    /**
     *
     * @param us
     * @return
     */
    public static usuarioPrincipal build(usuario us){
       List<GrantedAuthority> authorities =
              us.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
  return new usuarioPrincipal(us.getNombre(), us.getNombreUsuario(),us.getEmail(),us.getPassword(), authorities );
    }

    /**
     *
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    /**
     *
     * @return
     */
    @Override
    public String getPassword() {
       return password;
    }

    /**
     *
     * @return
     */
    @Override
    public String getUsername() {
       return nombreUsuario;    
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
       return true  ; 
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEnabled() {
        return true; 
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }
    
}
