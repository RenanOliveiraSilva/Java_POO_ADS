package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe01.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente("123456-8", "Fulano", 2500, "1234-6");

        obj1.depositar(1000);
        obj1.sacar(1500);
        System.out.println(obj1);
    }
}
