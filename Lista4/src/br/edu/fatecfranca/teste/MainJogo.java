package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe4.Coisa;
import br.edu.fatecfranca.exe4.Papel;
import br.edu.fatecfranca.exe4.Pedra;
import br.edu.fatecfranca.exe4.Tesoura;

import java.util.Random;

public class MainJogo {
    public static void main(String[] args) {
        // Criação dos objetos c1, c2 e c3
        Coisa c1 = new Pedra();
        Coisa c2 = new Papel();
        Coisa c3 = new Tesoura();

        // Array contendo as opções
        Coisa[] opcoes = { c1, c2, c3 };

        // Gerador aleatório
        Random random = new Random();

        // Loop contínuo para o jogo
        while (true) {
            // Escolhe dois objetos aleatoriamente para a partida
            Coisa jogador1 = opcoes[random.nextInt(opcoes.length)];
            Coisa jogador2 = opcoes[random.nextInt(opcoes.length)];

            // Exibe as escolhas dos jogadores
            System.out.println("\nJogador 1 escolheu: " + jogador1.getNome());
            System.out.println("Jogador 2 escolheu: " + jogador2.getNome());

            // Variável para armazenar o resultado
            int resultado = jogador1.vence(jogador2);

            // Verifica o resultado
            if (resultado == 0) {
                System.out.println("Empate!");
            } else if (resultado == 1) {
                System.out.println("Jogador 1 vence!");
            } else {
                System.out.println("Jogador 2 vence!");
            }

            // Pausa de 2 segundos entre os jogos
            try {
                Thread.sleep(2000);  // 2000 milissegundos = 2 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
