package br.edu.fatecfranca.exe1;

public class Aluno {
    public int numeroAluno, idade;
    public String nome;
    public float p1, p2;

    public Aluno() {}

    //Contrutor
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    public String passou() {
        return this.notaFinal() >= 6 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Aluno " +
                "nroAluno=" + numeroAluno +
                ", idade=" + idade +
                ", notaFinal=" + notaFinal() +
                ", passou=" + passou();
    }

}
