package lambdas;

import ArraysCollections.Array;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional..");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01");
        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!");
        });

        System.out.println("\nMethod Reference..");         //Referenciando um método
        aprovados.forEach(System.out::println);


        System.out.println("\nLambda #02");
        aprovados.forEach((nome) -> {
           meuImprimir(nome);
        });

        System.out.println("\nMethod Reference..92");         //Referenciando um método
        aprovados.forEach(Foreach::meuImprimir);



        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.forEach((n) -> System.out.println(n));
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi meu nome é " + nome);
    }
}
