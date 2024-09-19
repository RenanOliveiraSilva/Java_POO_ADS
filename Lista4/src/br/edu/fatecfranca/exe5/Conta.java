package br.edu.fatecfranca.exe5;

public class Conta {
    protected String nomeCliente;
    protected double salario, limite, saldo;
    protected int numConta;

    public Conta(String nomeCliente, double salario, double limite, double saldo, int numConta) {
        this.nomeCliente = nomeCliente;
        this.salario = salario;
        setLimite(limite);
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public void setLimite(double limite) {
        if(limite <= salario) {
            this.limite = limite;

        } else {
            System.out.println("Limite Inválido");
        }
    }

    public void deposito(float x) {
        this.saldo += x;
    }

    public boolean retira(float x) {
        if(x <= saldo) {
            this.saldo -= x;
            return true;

        } else {
            return false;
        }
    }

    public void saldo() {
        System.out.println("Saldo: " + saldo);
    }
    @Override
    public String toString() {
        return "Conta{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", salario=" + salario +
                ", limite=" + limite +
                ", saldo=" + saldo +
                ", numConta=" + numConta +
                '}';
    }
}