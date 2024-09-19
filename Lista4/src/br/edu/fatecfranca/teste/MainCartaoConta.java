package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe5.Conta;
import br.edu.fatecfranca.exe7.Cartao;

public class MainCartaoConta {
    public static void main(String[] args) {
        Conta conta = new Conta("Renan Oliveira", 2000.0f, 1000, 1000.0f, 1234);
        Cartao cartao = new Cartao(conta, "1234");

        System.out.println(cartao);

        //Testando a Retirada
        cartao.retirada(1000, "1234");
        System.out.println(cartao);

        cartao.retirada(1000, "12345");
        System.out.println(cartao);

        //Testando visibilidade do Saldo
        cartao.saldo("1234");
        cartao.saldo("12345");

        //Testando modificação da Senha
        cartao.modificaSenha("1234", "12345");
        System.out.println(cartao);
    }
}
