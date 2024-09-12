package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe2.Aluno;
import br.edu.fatecfranca.exe2.Curso;
import br.edu.fatecfranca.exe2.Professor;

public class MainAt2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Renan", "Renan123");
        Aluno a2 = new Aluno(2, "Lyvia", "Lyvia123");
        Aluno a3 = new Aluno(3, "Lucas", "Lucas123");
        Professor prof = new Professor(5, "Alexandre", "gomes123");

        Curso curso1 = new Curso(50,"ADS", "Técnica");
        curso1.addDisciplina(10,"Estrutura de Dados","ED01", prof);

        curso1.addAlunoDisciplina(10, a1);
        curso1.addAlunoDisciplina(10, a2);
        curso1.addAlunoDisciplina(10, a3);

        System.out.println(curso1.toString());
    }

}
