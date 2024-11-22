package br.edu.fatecfranca.lista5.ex3.classes;

public class Gato {
    public String nome;

    public Gato(String nome) {
        this.nome = nome;
    }

    public Gato() {}

    // Método específico para o Gato
    public void miar() {
        System.out.println(this.nome + " está miando: Miau!");
    }
}
