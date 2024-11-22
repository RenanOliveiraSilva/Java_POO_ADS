package br.edu.fatecfranca.apibd.service;

import br.edu.fatecfranca.apibd.dto.ProdutoDTO;
import br.edu.fatecfranca.apibd.model.Produto;
import br.edu.fatecfranca.apibd.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(ProdutoDTO produto) {
        Produto newProduto = new Produto();
        newProduto.setName(produto.getName());
        newProduto.setDescription(produto.getDescription());
        newProduto.setPrice(produto.getPrice());
        return produtoRepository.save(newProduto);
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

    public void update(Long id, ProdutoDTO produto) {
        if(produtoRepository.findById(id).isPresent()) {
            Produto editedProduto = new Produto();
            editedProduto.setId(id);
            editedProduto.setName(produto.getName());
            editedProduto.setDescription(produto.getDescription());
            editedProduto.setPrice(produto.getPrice());
            produtoRepository.save(editedProduto);
        } else {
            throw new IllegalArgumentException("Produto não encontrado");
        }
    }

    public void delete(Long id) {
        if(produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Produto não encontrado");
        }
    }

}
