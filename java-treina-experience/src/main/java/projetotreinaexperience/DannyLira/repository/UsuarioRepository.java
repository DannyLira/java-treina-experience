package projetotreinaexperience.DannyLira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetotreinaexperience.DannyLira.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    
}
