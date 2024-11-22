package br.edu.fatecfranca.apibd.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // Gera automaticamente os getters e setters :)
@Entity
@Table(name="tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Definindo o atributo id como auto increment (identity)
    private Long id;
    private String name;
    private String username;
    private String password;
}


