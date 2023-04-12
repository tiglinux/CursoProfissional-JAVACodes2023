package ArraysCollections.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main (String [] args){
        HashSet conjunto =  new HashSet();          //Hashset um Conjunto. HASHSET não aceita valores repetidos.

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');


        //Exibindo quantidade de elementos do conjunto.
        System.out.printf("O tamanho do conjunto é : %d \n" ,(conjunto.size()));        // size(); mostra o  tamanho

        conjunto.add("Teste");          //Aqui eu tento adicionar os mesmos valores repetidos no Hashset
        conjunto.add('x');

        //E ele retorna a mesma quantidade porque não aceita valores repetidos.
        System.out.println("O Tamanho do conjunto é : "+ conjunto.size());

        //O resultado será verdadeiro porque o "Teste" existe dentro do Hashset
        System.out.println(conjunto.remove("Teste"));

        //Verifica se contém o elemento proposto.
        System.out.println(conjunto.contains("x"));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //Fazendo união entre os conjuntos. nums e conjunto.
        conjunto.addAll(nums);
        System.out.println(conjunto);

        //Fazendo intersecção
        conjunto.retainAll(nums);
        System.out.println(conjunto);
    }
}
