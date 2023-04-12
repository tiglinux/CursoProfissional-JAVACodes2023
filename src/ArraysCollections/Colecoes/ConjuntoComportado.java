package ArraysCollections.Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set <String> listaAprovados = new HashSet<>();           //Lista String
        SortedSet<String> listaAprovados = new TreeSet<>();        //Lista por ordemAlfabética
        listaAprovados.add("Ana");
        listaAprovados.add("Tiago");
        listaAprovados.add("Joana");
        listaAprovados.add("Carlos");

        for(String candidato : listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();        //Set criando Um conjunto Hashset
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        //nums.get();         //Nao é possivel acessar pelo índice.

        for(int n : nums){          //Foreach
            System.out.println(n);
        }


        SortedSet<Integer> numSorteados = new TreeSet<Integer>();       //Organiza o número por ordem alfabética
        numSorteados.add(30);
        numSorteados.add(10);
        numSorteados.add(20);

        for(int num : numSorteados){
            System.out.println(num);
        }

    }
}
