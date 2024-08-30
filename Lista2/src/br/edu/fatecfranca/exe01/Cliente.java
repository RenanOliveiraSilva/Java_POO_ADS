package br.edu.fatecfranca.exe01;

public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;

    public Cliente() {
        this.nroConta = "Não definido";
        this.nome = "Não definido";
        this.saldo = 0;
        this.nroAgencia = "Não definido";
    }

    public Cliente(String nroConta, String nome, float saldo, String nroAgencia) {
        this.setNroConta(nroConta);
        this.setNome(nome);
        this.setSaldo(saldo);
        this.setNroAgencia(nroAgencia);
    }

    public void depositar(float x) {
        this.setSaldo(this.saldo + x);
    }

    public void sacar(float x) {
        this.setSaldo(this.saldo - x);
    }

    public void setNroConta(String nroConta) {
        if (nroConta.length() == 8) {
            if (nroConta.charAt(6) == '-') {
                this.nroConta = nroConta;

            } else System.out.println("Traço incorrreto");

        } else System.out.println("Tamanho diferente de 8");
    }

    public void setNroAgencia(String nroAgencia) {
        if (nroAgencia.length() == 6) {
            if (nroAgencia.charAt(4) == '-') {
                this.nroAgencia = nroAgencia;

            } else System.out.println("Traço incorrreto");

        } else System.out.println("Tamanho diferente de 8");
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;

        } else {
            this.nome = "";
            System.out.println("Tamanho maior que 30 não é possível");
        }
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;

        } else System.out.println("Saldo incorreto");
    }

    public String getNroConta() {
        return nroConta;
    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nroConta='" + nroConta + '\'' +
                ", nroAgencia='" + nroAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
