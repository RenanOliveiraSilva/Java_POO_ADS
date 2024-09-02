package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe02.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno("123456", 20, "Ciclano", 9f, 7f);
        Aluno obj2 = new Aluno();
        obj1.notaFinal();
        obj1.dadosAluno();

    }
}
