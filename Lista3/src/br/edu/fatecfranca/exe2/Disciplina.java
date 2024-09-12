package br.edu.fatecfranca.exe2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String name, sigla;
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private Professor professor;

    public Disciplina(int id, String name, String sigla, Professor professor) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
        this.professor = professor;
    }

    public Disciplina(int id, String name, String sigla, Professor professor, List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sigla='" + sigla + '\'' +
                ", alunos=" + alunos +
                ", professor=" + professor +
                '}';
    }
}