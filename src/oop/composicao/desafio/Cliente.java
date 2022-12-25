package oop.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras  = new ArrayList<Compra>();        //Lista de compras de um objeto Compra

    Cliente(String nome){                                   //Criando um construtor com nome como parâmetro
        this.nome = nome;
    }


    void adicionarCompra(Compra compra){                  //Método para passar uma lista de compras como parâmetro
        this.compras.add(compra);                        //Aqui adiciona na Lista uma compra por vez com o comando add();
    }
    double oberValorTotal(){
        double total = 0;

        for(Compra compra : compras){
            total = total + compra.obterValorTotal();
        }

        return total;
    }
}
