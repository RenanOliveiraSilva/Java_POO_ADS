package br.edu.fatecfranca.exe3;

public class TV extends Produto {
    private int canal;

    public TV() {
        super();
    }

    public TV(int numSerial, int volume, int canal) {
        super(numSerial, volume);
        this.canal = canal;
    }

    public void assitir() {
        System.out.println("Você está assistindo o canal: " + canal);
    }

    public void trocaCanal(int canal) {
        this.canal = canal;
        System.out.println("Você trocou para o canal: " + canal);
    }

    @Override
    public String toString() {
        return super.toString() + "TV{" +
                "canal=" + canal +
                '}';
    }
}
