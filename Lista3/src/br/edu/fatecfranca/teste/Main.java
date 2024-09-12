package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe0.Product;
import br.edu.fatecfranca.exe0.ShoppingCart;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Bola de Basquete", 400);
        Product prod2 = new Product(1, "Bola de Futebol", 300);
        Product prod3 = new Product(1, "Bola de Volei", 200);

        ShoppingCart cart1 = new ShoppingCart(100, new Date(), "Franca", "Pix", 0);
        cart1.addCarItem(prod1, 2, 10);
        cart1.addCarItem(prod2, 5, 12);
        cart1.calculateTotalPrice();
        System.out.println(cart1);
    }
}

// Agregação(independencia) = diamante em branco
// Composição(dependencia) = diamante preenchido