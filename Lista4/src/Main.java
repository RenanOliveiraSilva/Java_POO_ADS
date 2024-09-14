import br.edu.fatecfranca.exe0.Assistente;
import br.edu.fatecfranca.exe0.Diretor;
import br.edu.fatecfranca.exe0.Funcionario;
import br.edu.fatecfranca.exe0.Gerente;

import java.util.ArrayList;

public class Main {

    public static void mostra(Funcionario func) {
        System.out.println(func.toString());
    }

    public static void main(String[] args) {

       Assistente assistente1 = new Assistente("Matheus", "Franca",
               "123.456.789-3", 3000, 4);
        mostra(assistente1);

        Gerente gerente1 = new Gerente("Pedro", "Riberão", "456.321", 5000f, 2000f);
        mostra(gerente1);

        Diretor diretor1 = new Diretor("Paulo", "Batatais", "980.345", 8000f, 1000f);
        mostra(diretor1);

        ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(assistente1);
        lista.add(gerente1);
        lista.add(diretor1);

    }
}