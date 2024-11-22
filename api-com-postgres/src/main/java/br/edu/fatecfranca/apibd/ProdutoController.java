package br.edu.fatecfranca.apibd;

import br.edu.fatecfranca.apibd.dto.ProdutoDTO;
import br.edu.fatecfranca.apibd.model.Produto;
import br.edu.fatecfranca.apibd.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    private ResponseEntity<List<Produto>> findAll() {
        return new ResponseEntity<>(produtoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> findById(@PathVariable long id) {
        Optional<Produto> produto = produtoService.findById(id);
        return (produto.isPresent()) ?
            new ResponseEntity<>(produto.get(), HttpStatus.OK)
            :
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    private ResponseEntity<?> save(@RequestBody Produto produto) {
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setName(produto.getName());
        produtoDTO.setDescription(produto.getDescription());
        produtoDTO.setPrice(produto.getPrice());
        produtoService.save(produtoDTO);
        return new ResponseEntity<>(produtoDTO, HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    private ResponseEntity<?> update(@PathVariable long id, @RequestBody Produto produto) {
        try {
            ProdutoDTO produtoDTO = new ProdutoDTO();
            produtoDTO.setName(produto.getName());
            produtoDTO.setDescription(produto.getDescription());
            produtoDTO.setPrice(produto.getPrice());
            produtoService.update(id, produtoDTO);
            return new ResponseEntity<>(produtoDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete(@PathVariable long id) {
        try {
            produtoService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
