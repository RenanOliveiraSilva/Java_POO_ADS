package br.edu.fatecfranca.exe2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String name;
    private String area;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Curso(int id, String name, String area) {
        this.id = id;
        this.name = name;
        this.area = area;
    }

    Curso(){}

    // Adicionar Disciplina
    public void addDisciplina(int id, String name, String sigla, Professor professor) {
        this.disciplinas.add(new Disciplina(id, name, sigla, professor));
    }

    // Adicionar Aluno na disciplina
    public void addAlunoDisciplina(int idDisciplina, Aluno aluno) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getId() == idDisciplina) {
                disciplina.addAluno(aluno);
                return;
            }
        }
        System.out.println("A disiplina de ID " + idDisciplina + " não existe.");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
