package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe2.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(123, 654, "Renan", 1000);
        obj1.depositar(4000);
        obj1.sacar(1500);
        obj1.sacar(500);
        obj1.sacar(2000);
        System.out.println(obj1);

    }
}
