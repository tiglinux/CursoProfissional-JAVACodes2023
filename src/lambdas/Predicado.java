package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro =             //Predicado lógico que avalia se o produto for maior que 750 é caro.
                produto -> (produto.preco *(1- produto.desconto)) >= 750;

        Produto produto = new Produto("Notebook",3900.30,0.85);

        if(isCaro.test(produto) == true){
            System.out.printf("O produto : %s ,  é caro!",produto.getNome());
        }else if(isCaro.test(produto) == false){
            System.out.printf("O produto : %s , não é caro!",produto.getNome());
        }
    }
}
