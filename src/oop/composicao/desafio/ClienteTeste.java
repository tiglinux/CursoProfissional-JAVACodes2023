package oop.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {


        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta",9.67,100);
        compra1.adicionarItem(new Produto("Notebook",1897.88),2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno",10,10);
        compra2.adicionarItem(new Produto("Impressora",998.90),1);

        Cliente cliente1 = new Cliente("Maria Julia Moraes");
        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        System.out.println(cliente1.oberValorTotal());

    }
}
