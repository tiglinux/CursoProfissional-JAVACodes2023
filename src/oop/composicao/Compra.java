package oop.composicao;

import java.util.ArrayList;

public class Compra {
    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void addItem(String nome,int quantidade , double preco){
        this.addItem(new Item( nome,quantidade,preco));
    }
    void addItem(Item item){
        itens.add(item);
        item.compra = this;
    }

    double getTotalValue(){
        double total = 0;

        for(Item item: itens){
            total+= item.quantidade * item.preco;
        }

        return total;
    }
}
