package br.edu.fatecfranca.exe3;

public class Radio extends Produto{
    private Float estacao;
    private String banda;

    public Radio() {
        super();
    }

    public Radio(int numSerial, int volume, Float estacao, String banda) {
        super(numSerial, volume);
        this.estacao = estacao;
        this.banda = banda;
    }

    public void trocaEstacao(Float estacao) {
        this.estacao = estacao;
        System.out.println("Agora sua estação é: " + estacao);
    }

    public void trocaBanda(String banda) {
        this.banda = banda;
        System.out.println("Agora sua banda é: " + banda);
    }

    public void escutar() {
        System.out.println("Você está escutando na: " + estacao + banda);
    }

    @Override
    public String toString() {
        return super.toString() + "Radio{" +
                "banda='" + banda + '\'' +
                ", estacao=" + estacao +
                '}';
    }
}
