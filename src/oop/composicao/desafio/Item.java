package oop.composicao.desafio;

public class Item {
    final Produto produto;
    final int qtd;

    Item(Produto produto , int qtd){
        this.produto = produto;
        this.qtd = qtd;
    }
}
