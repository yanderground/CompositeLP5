package org.example;


public class Produto extends Conteudo {

    private double preco;

    public Produto(String descricao, double preco) {
        super(descricao);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getConteudo() {
        return "Produto: " + this.getDescricao() + " - preço: R$" + this.preco + "\n";
    }
}

