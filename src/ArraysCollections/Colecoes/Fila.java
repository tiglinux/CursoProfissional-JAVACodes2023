package ArraysCollections.Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();            //Fila - FIFO (Primeiro a entrar , primeiro a sair).

        //offer e add -> adicionam elementos na fila
        //Diferença é o comportamento quando a fila está cheia.
        fila.add("Ana");      //retorna false.
        fila.offer("Bia"); //Lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        //Peek e Element -> obter o próximo elementos da fila ( sem remover)
        //Diferença é o comportamento ocorre
        //quando a fila está vazia!
        System.out.println(fila.peek());        //Mostra o primeiro elemento.retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element());        //Lança uma execeção.
        System.out.println(fila.element());


        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());


        //fila.clear();           //Limpa fila.
        //fila.size();
        //fila.isEmpty();
        //fila.contains(...);

    }
}
