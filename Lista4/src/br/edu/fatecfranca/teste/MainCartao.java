package br.edu.fatecfranca.teste;
import br.edu.fatecfranca.exe2.Aniversario;
import br.edu.fatecfranca.exe2.CartaoWeb;
import br.edu.fatecfranca.exe2.DiaDosNamorados;
import br.edu.fatecfranca.exe2.Natal;

import java.util.ArrayList;
import java.util.List;

public class MainCartao {
    public static void main(String[] args) {
        List<CartaoWeb> lista = new ArrayList<>();
        lista.add(new DiaDosNamorados("Renan"));
        lista.add(new DiaDosNamorados("Lyvia"));
        lista.add(new Aniversario("Lucas"));
        lista.add(new Natal("Marina"));

        for(CartaoWeb cartao : lista){
            cartao.showMessage();
        }
    }
}
