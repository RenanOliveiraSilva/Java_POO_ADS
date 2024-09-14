package br.edu.fatecfranca.exe0;

public class Gerente extends Funcionario{

    private Float bonus;

    public Gerente(String nome, String endereco, String cpf, float salario, Float bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    public Float getBonus() {
        return bonus;
    }

    @Override //Anulando classe pai
    public String toString() {
        return super.toString() + "\nBonus: " + bonus;
    }

    @Override
    public float calculaSalario() {
        return this.salario + this.bonus;
    }


}
