package projetotreinaexperience.DannyLira.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor//cria contrutor sem argumentos
@Entity(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;
    private String nome;
    private String sobrenome;
    @Column (unique = true)
    private String email;
    private LocalDate dataNascimento;
    private String senha;
    @ManyToOne TipoUsuario tipoUsuario;


   
    public List<Usuario> findAll() {
        return null;
    }

    public Optional<Usuario> findById(long id) {
        return null;
    }

    public Usuario save(Usuario usuario) {
        return null;
    }

    public Usuario UpDate(long id, Usuario usuario) {
        return null;
    }

    public void delete(long id) {
    }
    
}
