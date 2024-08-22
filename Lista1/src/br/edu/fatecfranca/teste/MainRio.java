package br.edu.fatecfranca.teste;
import br.edu.fatecfranca.exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio obj1 = new Rio("Sena", 20.5F, true);

        obj1.chover(9.5f);
        obj1.ensolarar(5f);
        obj1.limpar();

        System.out.println(obj1);

    }
}
