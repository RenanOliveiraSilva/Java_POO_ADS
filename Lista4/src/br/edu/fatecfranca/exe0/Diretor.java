package br.edu.fatecfranca.exe0;

public class Diretor extends Funcionario{
    private Float acoesEmpresa;

    public Diretor() {
        super();
        this.acoesEmpresa = 0f;
    }

    public Diretor(String nome, String endereco, String cpf, float salario, Float acoesEmpresa) {
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public Float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(Float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return super.toString() + "Diretor{" + "acoesEmpresa=" + acoesEmpresa + '}';
    }

    @Override
    public float calculaSalario() {
        return this.salario + (this.acoesEmpresa * 2) / 12;
    }
}
