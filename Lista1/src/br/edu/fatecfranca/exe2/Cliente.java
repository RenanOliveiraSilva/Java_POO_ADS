package br.edu.fatecfranca.exe2;

public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public float saldo;

    //Construtor vazio
    public Cliente() {

    }

    public Cliente(int nroConta, int nroAgencia, String nome, float saldo) {
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nroConta=" + nroConta +
                ", nroAgencia=" + nroAgencia +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void depositar(float x) {
        this.saldo += x;

    }

    public void sacar(float x) {
        if(this.saldo - x >= 0) {
            this.saldo -= x;

        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
