
package com.ejemplo.SpringBoot.controller;




import com.ejemplo.SpringBoot.model.Estudios;
import com.ejemplo.SpringBoot.model.Hobbies;
import com.ejemplo.SpringBoot.model.Idioma;
import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.model.Trabajos;

import com.ejemplo.SpringBoot.service.IEstudiosService;





import com.ejemplo.SpringBoot.service.IHobbiesService;
import com.ejemplo.SpringBoot.service.IIdiomaService;
import com.ejemplo.SpringBoot.service.IPersonaService;
import com.ejemplo.SpringBoot.service.ITrabajosService;






import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    
    private IPersonaService persoServ;
 //   List <Persona> listaPersonas =new ArrayList();
    
    
  //  @GetMapping ("/hola/{nombre}/{apellido}/{edad}")
 //   public String decirHola(@PathVariable String nombre,
  //                          @PathVariable String apellido,    
 //                           @PathVariable int edad){
  //      return ("Hola Mundo " + nombre + " " + apellido + " " + edad);
  //  }
    
  //  @GetMapping ("/chau")
  //  public String decirChau(@RequestParam String nombre,
    //                        @RequestParam String apellido,
    //                        @RequestParam int edad){
    //    return ("Chau mundo " + nombre + " " + apellido + " " + edad );
  //  }
    //Persona
    @PostMapping ("/new/persona")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void agregarPersona(@RequestBody Persona pers){
     //   listaPersonas.add(pers);
     persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Persona> verPersonas(){
     //   return listaPersonas;
     return persoServ.verPersona();
    }
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("/modif/persona")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void modificarPersona(@RequestBody Persona per){
        persoServ.modificarPersona(per);    }
    
    //Hobbies
    @Autowired
    private IHobbiesService hobbiServ;
    @PostMapping ("/new/hobbies")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void agregarHobbies(@RequestBody Hobbies hobb){
    
     hobbiServ.crearHobbies(hobb);
    }
    
    @GetMapping ("/ver/hobbies")
    @ResponseBody
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Hobbies> verH(){
     
     return hobbiServ.verHobbies();
    }
    @DeleteMapping ("/delete/hobbies/{id}")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void borrarHobbie(@PathVariable Long id){
        hobbiServ.borrarHobbies(id);
    }
    @PutMapping("/modif/hobbies")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void modificarHobbie(@RequestBody Hobbies hobb){
        hobbiServ.modificarHobbiues(hobb);    }
    
     //Estudios
    @Autowired
    private IEstudiosService estServ;
    @PostMapping ("/new/estudios")
    
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void agregarEstudios(@RequestBody Estudios est){
    
     estServ.crearEstudios(est);
    }
    
    @GetMapping ("/ver/estudios")
    @ResponseBody
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Estudios> verE(){
     
     return estServ.verEtudiosOrdenados();
    }
    @DeleteMapping ("/delete/estudios/{id}")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void borrarEstudio(@PathVariable Long id){
        estServ.borrarEstudios(id);
    }
    @PutMapping("/modif/estudios")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void modificarEstudio(@RequestBody Estudios estud){
        estServ.modificarEstudios(estud);    }
    
     //Idioma
    @Autowired
    private IIdiomaService idmServ;
    @PostMapping ("/new/idioma")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void agregarIdioma(@RequestBody Idioma idm){
    
     idmServ.crearIdiomas(idm);
    }
    
    @GetMapping ("/ver/idioma")
    @ResponseBody
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Idioma> verI(){
     
     return idmServ.verIdiomas();
    }
    @DeleteMapping ("/delete/idioma/{id}")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void borrarIdioma(@PathVariable Long id){
        idmServ.borrarIdiomas(id);
    }
    @PutMapping("/modif/idioma")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void modificarIdioma(@RequestBody Idioma idio){
       idmServ.crearIdiomas(idio);  }
    
    //Trabajos
    @Autowired
    private ITrabajosService trabServ;
    @PostMapping ("/new/trabajo")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void agregarTrabajos(@RequestBody Trabajos trab){
    
     trabServ.crearTrabajos(trab);
    }
    
    @GetMapping ("/ver/trabajo")
    @ResponseBody
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Trabajos> vert(){
     
     return trabServ.verTrabajosOrdenados();
    }
    @DeleteMapping ("/delete/trabajo/{id}")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void borrarTrabajo(@PathVariable Long id){
        trabServ.borrarTrabajos(id);
    }
    @PutMapping("/modif/trabajo")
    @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void modificarTrabajo(@RequestBody Trabajos trabj){
       trabServ.crearTrabajos(trabj); }

   
    
 
}
