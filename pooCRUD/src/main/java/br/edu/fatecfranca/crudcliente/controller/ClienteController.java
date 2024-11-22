package br.edu.fatecfranca.crudcliente.controller;

import br.edu.fatecfranca.crudcliente.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final Map<Long, Cliente> bancoDeDados = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes() {
        return ResponseEntity.ok(new ArrayList<>(bancoDeDados.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarCliente(@PathVariable Long id) {
        Cliente cliente = bancoDeDados.get(id);
        if (cliente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Cliente não encontrado.");
        }
        return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public ResponseEntity<Cliente> adicionarCliente(@RequestBody Cliente novoCliente) {
        Long id = idGenerator.getAndIncrement();
        novoCliente.setId(id);
        bancoDeDados.put(id, novoCliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarCliente(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
        Cliente clienteExistente = bancoDeDados.get(id);
        if (clienteExistente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Cliente não encontrado.");
        }
        clienteAtualizado.setId(id);
        bancoDeDados.put(id, clienteAtualizado);
        return ResponseEntity.ok(clienteAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removerCliente(@PathVariable Long id) {
        Cliente clienteRemovido = bancoDeDados.remove(id);
        if (clienteRemovido == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Cliente não encontrado.");
        }
        return ResponseEntity.ok("Cliente removido com sucesso.");
    }
}