package br.edu.fatecfranca.exe4;

public class Papel extends Coisa {
    @Override
    public int vence(Coisa outra) {
        if (outra instanceof Pedra) {
            return 1;  // Papel vence Pedra
        } else if (outra instanceof Tesoura) {
            return -1; // Papel perde para Tesoura
        } else {
            return 0;  // Empate
        }
    }

    @Override
    public String getNome() {
        return "Papel";
    }
}
