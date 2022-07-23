
package com.ejemplo.SpringBoot.security.jwt;

import com.ejemplo.SpringBoot.security.jwt.JwtProvider;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;
import com.ejemplo.SpringBoot.security.service.UserDatailServiceImpl;



public class JwtTokenFilter extends OncePerRequestFilter{
 private final static Logger logger= (Logger) (org.jboss.logging.Logger) LoggerFactory.getLogger(JwtTokenFilter.class);
   @Autowired
   JwtProvider jwtprovider;
   @Autowired
   UserDatailServiceImpl userDetailsService;

 @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res , FilterChain filterChain) throws ServletException, IOException {
    try {
        String token = getToken(req);
        if (token != null && jwtprovider.validateToken(token)){
            String nombreUsuario = jwtprovider.getNombreUsuarioFromToken(token);
            UserDetails userDetails = userDetailsService.loadUserByUsername(nombreUsuario);
            UsernamePasswordAuthenticationToken  auth = 
                    new UsernamePasswordAuthenticationToken(userDetails,null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().getAuthentication();
       
    }
    }
        catch (Exception e){
                 logger.error("falló en el método doFilter");
                }
    filterChain.doFilter(req, res);
    }
   
    
    private String getToken(HttpServletRequest request){
        String header = request.getHeader("Authorization");
        if (header != null && header.startsWith("Bearer")){
            return header.replace("Bearer", "");}
        else{
       return null;}
    }
}
