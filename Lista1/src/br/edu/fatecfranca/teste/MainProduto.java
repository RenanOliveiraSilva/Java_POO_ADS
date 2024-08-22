package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto(1, 20, "Nutela", 14);

        obj1.comprar(10);
        obj1.vender(8);

        System.out.println(obj1);
    }
}
