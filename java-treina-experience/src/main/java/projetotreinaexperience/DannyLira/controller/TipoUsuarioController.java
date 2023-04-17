package projetotreinaexperience.DannyLira.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetotreinaexperience.DannyLira.model.TipoUsuario;

@RestController
@RequestMapping ("/TipoUsuario")
public class TipoUsuarioController {
    @Autowired
    private TipoUsuario tipoUsuario;

    @GetMapping 
    public List<TipoUsuario> findAll() {
        return tipoUsuario.findAll();
   
    }
    
    @GetMapping("/{id}") 
    public Optional<TipoUsuario> getById(@PathVariable long id){
        return tipoUsuario.findById(id);
    }


    @PostMapping (value = "/TipoUsuario") 
    public TipoUsuario save(@RequestBody TipoUsuario TipoUsuario){
        return tipoUsuario.save(TipoUsuario);
    }
    

    @PutMapping("/{id}") 
    public TipoUsuario upDate(@PathVariable long id, @RequestBody TipoUsuario TipoUsuario){
      return tipoUsuario.upDate(id, TipoUsuario);
    }
    @DeleteMapping("/{id}") 
    public void delete(@PathVariable long id){
        TipoUsuario.delete(id);

    }
    
}
