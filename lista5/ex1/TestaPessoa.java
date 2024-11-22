package br.edu.fatecfranca.lista5.ex1;

import br.edu.fatecfranca.lista5.ex1.classes.Pessoa;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(19,"Lyvia", "33.987.589-2", "753.698.214-82");
        p1.trabalha();
        p1.getRG();
        p1.come();
        p1.getCPF();
        p1.respira();
        p1.vota();
        p1.ensina();
        p1.pagarIR();
    }
}
