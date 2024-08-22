package br.edu.fatecfranca.exe4;

public class Rio {
    public String nome;
    public Float nivel;
    public Boolean poluido;

    //Construtor vazio
    public Rio() {}

    //Construtor
    public Rio(String nome, Float nivel, Boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    //Metodo Chover
    public void chover(float x) {
        this.nivel += x;
    }

    //Metodo ensolarar
    public void ensolarar(float x) {
        this.nivel -= x;
    }

    //Metodo limpar
    public void limpar() {
        this.poluido = false;
    }

    //Metodo sujar
    public void sujar() {
        this.poluido = true;
    }

    @Override
    public String toString() {
        return "Rio{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", poluido=" + poluido +
                '}';
    }
}
