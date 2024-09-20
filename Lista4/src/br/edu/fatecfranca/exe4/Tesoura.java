package br.edu.fatecfranca.exe4;

public class Tesoura extends Coisa {
    @Override
    public int vence(Coisa outra) {
        if (outra instanceof Papel) {
            return 1;  // Tesoura vence Papel
        } else if (outra instanceof Pedra) {
            return -1; // Tesoura perde para Pedra
        } else {
            return 0;  // Empate
        }
    }

    @Override
    public String getNome() {
        return "Tesoura";
    }
}
