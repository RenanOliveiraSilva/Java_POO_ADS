package br.edu.fatecfranca.apibd;

import br.edu.fatecfranca.apibd.dto.UsuarioDTO;
import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    private ResponseEntity<List<Usuario>> listarTodos() {
        return new ResponseEntity<>(usuarioService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> buscaPorId(@PathVariable Long id) {
        Optional<Usuario> query = usuarioService.findById(id);
        return query.isPresent() ?
            new ResponseEntity<>(query.get(), HttpStatus.OK)
            :
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/")
    private ResponseEntity<?> buscaPorIdRequestParam(@RequestParam Long id) {
        Optional<Usuario> query = usuarioService.findById(id);
        return new ResponseEntity<>(query, HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<?> salvar(@RequestBody Usuario usuario){
        UsuarioDTO usuarioDto = new UsuarioDTO();
        usuarioDto.setName(usuario.getName());
        usuarioDto.setUsername(usuario.getUsername());
        usuarioDto.setPassword(usuario.getPassword());
        usuarioService.save(usuarioDto);
        return new ResponseEntity<>(usuarioDto, HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    private ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody Usuario usuario){
        try {
            UsuarioDTO usuarioDto = new UsuarioDTO();
            usuarioDto.setName(usuario.getName());
            usuarioDto.setUsername(usuario.getUsername());
            usuarioDto.setPassword(usuario.getPassword());
            usuarioService.update(id, usuarioDto);
            return new ResponseEntity<>(usuarioDto, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> deletar(@PathVariable Long id) {
        try {
            usuarioService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
