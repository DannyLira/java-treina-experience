package projetotreinaexperience.DannyLira.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import projetotreinaexperience.DannyLira.model.TipoUsuario;
import projetotreinaexperience.DannyLira.repository.TipoUsuarioRepository;


public class TipoUsuarioService {
    @Autowired
    private TipoUsuarioRepository usuarioRepository;

    public List<TipoUsuario> findAll(){
        return usuarioRepository.findAll();
    }

    public TipoUsuario save(TipoUsuario tipoUsuario){
        return usuarioRepository.save(tipoUsuario);
    }
    
    public TipoUsuario UpDate(long id,TipoUsuario tipoUsuario){ 
        tipoUsuario.setIdTipoUsuario(id);
        return usuarioRepository.save(tipoUsuario);
    }

    public Optional<TipoUsuario> findById(long id){
        return usuarioRepository.findById(id);
    }

    public void delete(long id){
        usuarioRepository.deleteById(id);
   }
    
}
