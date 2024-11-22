package br.edu.fatecfranca.lista5.ex1.classes;

public class Animal {
    public int idade;

    public Animal(){}

    public Animal(int idade){
        this.idade = idade;
    }

    public void come(){
        System.out.println("Estou comendo...");
    }

    public void respira(){
        System.out.println("Estou respirando...");
    }
}
