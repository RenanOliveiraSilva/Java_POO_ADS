package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe1.Forum;
import br.edu.fatecfranca.exe1.Person;

public class MainAt1 {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Renan", "Renan456");
        Person p2 = new Person(2, "Lyvia", "Lyvia123");

        Forum forum = new Forum(10, "Mensagens", "www.teste.com");

        forum.addMessages(1000, "Olá Lyvia, boa tarde!", p1);
        forum.addMessages(1001, "Boa tarde Renan.", p2);

        System.out.println(forum);
    }
}
