package br.edu.fatecfranca.exe0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private int id;
    private Date data;
    private String destino;
    private String formaPagto;
    private float precoTotal;
    //Composição
    private List<CarItem> carItens;

    public ShoppingCart() {
        this.carItens = new ArrayList<CarItem>(); // aloca espaço para o vetor

    }

    public ShoppingCart(int id, Date data, String destino, String formaPagto, float precoTotal) {
        this.id = id;
        this.data = data;
        this.destino = destino;
        this.formaPagto = formaPagto;
        this.precoTotal = precoTotal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getDestino() {
        return destino;
    }

    public String getFormaPagto() {
        return formaPagto;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }

    //adiciona um item do carrinho no carrinho de compra
    public void addCarItem(Product product, int quantity, int id) {
        this.carItens.add(new CarItem(id, quantity, product));
    }

    public void calculateTotalPrice() {
        float soma = 0;
        for (CarItem carItem : carItens) {
            soma += carItem.getQuantity() * carItem.getProduct().getPrice();
        }
        this.precoTotal = soma;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", data=" + data +
                ", destino='" + destino + '\'' +
                ", formaPagto='" + formaPagto + '\'' +
                ", precoTotal=" + precoTotal +
                ", carItens=" + carItens +
                '}';
    }
}
