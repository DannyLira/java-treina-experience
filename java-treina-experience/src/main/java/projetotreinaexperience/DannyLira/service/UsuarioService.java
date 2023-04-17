package projetotreinaexperience.DannyLira.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetotreinaexperience.DannyLira.model.Usuario;
import projetotreinaexperience.DannyLira.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    
    public Usuario UpDate(long id, Usuario usuario){ 
        usuario.setIdUsuario(id);
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> findById(long id){
        return usuarioRepository.findById(id);
    }

    public void delete(long id){
        usuarioRepository.deleteById(id);
   }
    
}
