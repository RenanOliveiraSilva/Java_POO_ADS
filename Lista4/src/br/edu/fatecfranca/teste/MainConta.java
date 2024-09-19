package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe5.Conta;

public class MainConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("Renan", 3000, 2500, 5000, 123456);
        System.out.println(c1);

        //Testando limite
        c1.setLimite(3500);
        System.out.println(c1);

        //Testando metodo Retirar
        System.out.println(c1.retira(5500));
        c1.saldo();
        System.out.println(c1.retira(1000));
        c1.saldo();

        //Realizando Depósitos
        c1.deposito(1500);
        c1.saldo();
    }
}
