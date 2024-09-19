package br.edu.fatecfranca.exe7;

import br.edu.fatecfranca.exe5.Conta;

public class Cartao {
    private Conta conta;
    private String senha;

    public Cartao() {
    }

    public Cartao(Conta conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public boolean retirada(float x, String senha) {
        if(senha.equals(this.senha)) {
            conta.retira(x);
            return true;

        } else {
            System.out.println("Senha Incorreta");
            return false;
        }
    }

    public boolean saldo(String senha) {
        if(senha.equals(this.senha)) {
            conta.saldo();
            return true;

        } else {
            System.out.println("Senha Incorreta");
            return false;
        }
    }

    public boolean modificaSenha(String senha, String senhaNova) {
        if(senha.equals(this.senha)) {
            this.senha = senhaNova;
            return true;

        } else {
            System.out.println("Senha Incorreta");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "conta=" + conta +
                ", senha='" + senha + '\'' +
                '}';
    }
}
