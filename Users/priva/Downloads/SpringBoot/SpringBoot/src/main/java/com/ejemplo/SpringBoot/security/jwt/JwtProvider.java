
package com.ejemplo.SpringBoot.security.jwt;


import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.time.ZonedDateTime;
import java.util.Date;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import com.ejemplo.SpringBoot.model.usuarioPrincipal;

@Component
public class JwtProvider {
    private final static Logger logger= (Logger) (org.jboss.logging.Logger) LoggerFactory.getLogger(JwtProvider.class);
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private String expiration;
    
    public String generateToken(Authentication authentication){
        usuarioPrincipal usPrincipal = (usuarioPrincipal) authentication.getPrincipal();
        return Jwts.builder().setSubject(usPrincipal.getUsername())
                .setIssuedAt(new Date())
                 .setExpiration(Date.from(ZonedDateTime.now().plusMinutes(45).toInstant()))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
    public String getNombreUsuarioFromToken(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }
    public boolean validateToken(String token){
       try {
           Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
           return true;
       
    }catch(MalformedJwtException e){
        logger.error("token mal formado");
    }catch(UnsupportedJwtException e){
        logger.error("token no soportado");
    }catch(ExpiredJwtException e){
        logger.error("token expirado");
    }catch(IllegalArgumentException e){
        logger.error("token vacío");
    }catch(SignatureException e){
        logger.error("fallo con la firma");
    }
    return false;
    }
}