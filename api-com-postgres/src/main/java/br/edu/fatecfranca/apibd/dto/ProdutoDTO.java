package br.edu.fatecfranca.apibd.dto;

import lombok.Data;

@Data
public class ProdutoDTO {
    private Long id;
    private String name;
    private String description;
    private float price;
}
