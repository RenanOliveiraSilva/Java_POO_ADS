package br.edu.fatecfranca.exe4;

public class Pedra extends Coisa {
    @Override
    public int vence(Coisa outra) {
        if (outra instanceof Tesoura) {
            return 1;  // Pedra vence Tesoura
        } else if (outra instanceof Papel) {
            return -1; // Pedra perde para Papel
        } else {
            return 0;  // Empate
        }
    }

    @Override
    public String getNome() {
        return "Pedra";
    }
}
