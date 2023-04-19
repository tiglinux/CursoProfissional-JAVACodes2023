package lambdas;


import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;


/**
 * Desafio BinaryOperator para calcular um produto com desconto, imposto municipal e seu frete usando InterfaceFuncional
 * @author Tiago Ribeiro Santos
 * Date : 12/04/2023
 * Github: www.github.com/tiglinux
 */
public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad",3235.89,0.13);
        BinaryOperator<Double> precoReal =
                (n1,n2) -> (n1 - (n1* n2));
        System.out.println("Preço com desconto:R$"+precoReal.apply(p.preco,p.desconto));

        Function<Double,Double> impostoMunicipal =
                n1 -> n1 >= 2500 ? (n1-(n1 * 0.085)) : n1 ;
        System.out.println("Imposto Municipal : R$"+ impostoMunicipal.apply(p.preco));

        UnaryOperator<Double> frete =
                (n1) -> n1 >= 3000 ? (n1 - 100) : (n1 - 50);
        System.out.println("Frete calculado : R$"+frete.apply(p.preco));

        Function<Double,String> arrendondar =
                (n1) ->String.format("%.2f",n1);
        System.out.println("Arrendondado:"+arrendondar.apply(p.preco));

        Function<Double,String> formatar =
                preco -> ("R$" + preco).replace(".",",");
        System.out.println("Formatado:"+formatar.apply(p.preco));

    }
}
