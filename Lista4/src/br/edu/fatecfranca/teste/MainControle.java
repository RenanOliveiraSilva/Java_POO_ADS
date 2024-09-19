package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe3.Produto;
import br.edu.fatecfranca.exe3.Radio;
import br.edu.fatecfranca.exe3.TV;

public class MainControle {
    public static void main(String[] args) {
        Produto p1 = new Radio(1, 5, 94.9F, "FM");

        //Testando o Produto (Radio)
        System.out.println(p1);
        p1.testaUnidade();
        System.out.println(p1);

        //Modificando valores (Radio)
        ((Radio) p1).trocaEstacao(85.9f);
        ((Radio) p1).trocaBanda("AM");
        System.out.println(p1);

        //Alterando para o outro Produto(TV)
        System.out.println("Troca de produto --------------- ");
        p1 = new TV(2, 10, 12);

        //Testando o Produto (TV)
        System.out.println(p1);
        p1.testaUnidade();
        System.out.println(p1);

        //Modificando valores (Radio)
        ((TV) p1).trocaCanal(10);
        System.out.println(p1);

    }
}
