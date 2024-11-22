package br.edu.fatecfranca.apibd.service;

import br.edu.fatecfranca.apibd.dto.UsuarioDTO;
import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Classe responsável pela comunicação direta com o banco (Realiza o CRUD)
@Service
public class UsuarioService {

    // Injeção de dependência
    @Autowired // Permite utilizar os métodos da classe sem instânciá-la (Semelhante ao STATIC)
    private UsuarioRepository usuarioRepository;

    // Salvar um usuário --> CREATE
    public Usuario save(UsuarioDTO usuario) { // Quando estamos lidando com dados que vieram de um usuário, precisamos usar o DTO.
        Usuario novoUsuario = new Usuario();
        novoUsuario.setUsername(usuario.getUsername());
        novoUsuario.setPassword(usuario.getPassword());
        novoUsuario.setName(usuario.getName());
        return usuarioRepository.save(novoUsuario);
    }

    // SELECT * --> READ
    public List<Usuario> listAll() {
        return usuarioRepository.findAll();
    }

    // Busca por ID --> READ
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    // Atualizando --> UPDATE
    public void update(Long id, UsuarioDTO usuario) {
        if (usuarioRepository.findById(id).isPresent()) {
            Usuario novoUsuario = new Usuario();
            novoUsuario.setName(usuario.getName());
            novoUsuario.setPassword(usuario.getPassword());
            novoUsuario.setUsername(usuario.getUsername());
            usuarioRepository.save(novoUsuario); // Save também serve para atualizar, DESDE QUE ele tenha a chave primária (Nesse caso, ID)
        } else {
            throw new IllegalArgumentException("Usuário não encontrado");
        }
    }

    // Exclusão --> DELETE
    public void delete(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Usuário não encontrado!");
        }
    }
}

