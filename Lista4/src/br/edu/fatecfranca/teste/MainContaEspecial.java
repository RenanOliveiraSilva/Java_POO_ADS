package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe6.ContaEspecial;

public class MainContaEspecial {
    public static void main(String[] args) {
        ContaEspecial c1 = new ContaEspecial("Renan", 3000, 2500, 5000, 123456);
        System.out.println(c1);

        //Testando limite
        c1.setLimite(9000);
        System.out.println(c1);
        c1.setLimite(9001); //Limite Inválido

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
