package br.edu.fatecfranca.exe3;

public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    //Construtor

    public Produto() {
    }

    public Produto( int id, float preco, String descricao, int qtde) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.qtde = qtde;

    }

    public void comprar(int x) {
        this.qtde+= x;
    }

    public void vender(int x) {
        if(this.qtde - x >= 0) {
            this.qtde = this.qtde-x;
        } else {
            System.out.println("Sem estoque");
        }
    }

    public void subir(int x) {
        this.preco = this.preco+x;
    }

    public void descer(int x) {
        this.preco = this.preco-x;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", qtde=" + qtde +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
