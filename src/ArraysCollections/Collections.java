package ArraysCollections;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<String>();
        produtos.add("Feijão");
        produtos.add("Vassoura");
        produtos.add("Biscoito");
        produtos.add("Leite");


        produtos.set(2,"Carne");
        produtos.set(0,"Café");

        if(produtos.contains("Carne")){
            System.out.println(produtos);
        }else{
            System.out.println("Inválido");
        }
    }
}
