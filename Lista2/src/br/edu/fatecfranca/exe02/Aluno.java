package br.edu.fatecfranca.exe02;

public class Aluno {
    private int idade;
    private String nome, numeroAluno;
    private Float p1, p2;

    //Contrutor vazio
    public Aluno() {
        this.numeroAluno = "Não definido";
        this.idade = 0;
        this.nome = "Não definido";
        this.p1 = 0.0f;
        this.p2 = 0.0f;
    }

    //Construtor
    public Aluno(String numeroAluno, int idade, String nome, Float p1, Float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }

    //Setters
    public void setNumeroAluno(String numeroAluno) {
        if (numeroAluno.length() == 6) {
            this.numeroAluno = numeroAluno;

        } else System.out.println("Número do aluno com tamanho incorreto");

    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;

        } else System.out.println("Idade do aluno não pode ser negativa");

    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;

        } else System.out.println("Nome do aluno não pode ser maior que 30");
    }

    public void setP1(Float p1) {
        if (p1 > 0) {
            this.p1 = p1;
        } else System.out.println("A nota do aluno não pode ser negativa");
    }

    public void setP2(Float p2) {
        if (p2 > 0) {
            this.p2 = p2;
        } else System.out.println("A nota do aluno não pode ser negativa");
    }

    //Getters
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroAluno() {
        return numeroAluno;
    }

    public Float getP1() {
        return p1;
    }

    public Float getP2() {
        return p2;
    }

    //Métodos
    public void notaFinal() {
        float mediaFinal = (getP1() + getP2()) / 2;
        System.out.println("O aluno obteve média final igual a: " + mediaFinal);
    }

    public void dadosAluno() {
        System.out.println("Aluno{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", numeroAluno='" + numeroAluno + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}');
    }

}
