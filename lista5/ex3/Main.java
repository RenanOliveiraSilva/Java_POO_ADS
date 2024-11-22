package br.edu.fatecfranca.lista5.ex3;

import br.edu.fatecfranca.lista5.ex3.classes.Gato;
import br.edu.fatecfranca.lista5.ex3.classes.GatoAdapter;
import br.edu.fatecfranca.lista5.ex3.interfaces.Animal;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Frajola");
        Gato gato2 = new Gato("Tom");

        Animal gatoAdaptado1 = new GatoAdapter(gato1);
        Animal gatoAdaptado2 = new GatoAdapter(gato2);

        gatoAdaptado1.fazerSom(); // Chama o método miar do Gato
        gatoAdaptado2.fazerSom(); // Chama o método miar do Gato

        System.out.println();
    }
}
