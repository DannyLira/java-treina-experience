package projetotreinaexperience.DannyLira.model;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity  (name = "TipoUsuario")
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTipoUsuario;

    private String nomeTipoUsuario;

    public List<TipoUsuario> findAll() {
        return null;
    }

    public Optional<TipoUsuario> findById(long id) {
        return null;
    }

    public TipoUsuario save(TipoUsuario tipoUsuario) {
        return null;
    }

    public TipoUsuario upDate(long id, TipoUsuario tipoUsuario) {
        return null;
    }

    public static void delete(long id) {
    }

    /**
     * @param usuario 
     */
    @Autowired
    public void Usuario (Usuario usuario) {
     usuario.tipoUsuario = this;
    usuario.tipoUsuario = this;   
    }

    
}
