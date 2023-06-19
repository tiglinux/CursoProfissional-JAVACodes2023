package streamsapi;

import java.util.*;

public class Stream {
    public static void main(String[] args) {
        //Java5
        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        for (Iterator<Integer> numero = lista.iterator(); numero.hasNext();) {
            Integer integer = numero.next();
            System.out.println(integer);
        }

        //Java 8
        List<Integer> lista2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for(Integer x : lista2){
            System.out.println(x);
        }

        List<Integer> lista3 = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
        lista3.stream()
                .skip(2) // ignora os dois primeiros números
                .limit(9) // limita a 9 números
                .distinct() // ignora números iguais
                .forEach(System.out::print);


        List<Integer> lista4 = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
        Optional<Integer> maiorNumero = lista.stream()
                .map(e -> e * 2) // multiplica cada item por 2
                .max(Comparator.naturalOrder()); // pega o maior item pela ordem natural
        System.out.println(maiorNumero.get());
    }
}
