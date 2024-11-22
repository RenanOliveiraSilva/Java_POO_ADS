package br.edu.fatecfranca.apibd.dto;

import lombok.Data;

@Data // Gera automaticamente os getters e setters :)
public class UsuarioDTO {
    private Long id;
    private String name;
    private String username;
    private String password;
}
