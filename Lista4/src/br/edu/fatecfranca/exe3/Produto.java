package br.edu.fatecfranca.exe3;

public class Produto {
    protected int numSerial;
    protected int volume;
    protected String descricao;

    public Produto() {
        this.descricao = "Não Testado";
    }

    public Produto(int numSerial, int volume) {
        this.numSerial = numSerial;
        this.volume = volume;
        this.descricao = "Não Testado";
    }

    public int getNumSerial() {
        return numSerial;
    }

    public int getVolume() {
        return volume;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNumSerial(int numSerial) {
        this.numSerial = numSerial;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void testaUnidade() {
        if(this.descricao.equals("Não Testado")) {
            int numAleatorio = (int)(Math.random() * 10);
            if(numAleatorio != 0) {
                this.descricao = "Aprovado";
            } else {
                this.descricao = "Reprovado";
            }
        } else {
            this.descricao = "Esse produto já foi testado";
        }

    }

    @Override
    public String toString() {
        return "Produto{" +
                "numSerial=" + numSerial +
                ", volume=" + volume +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
