package ArraysCollections.Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>(); //Criando uma lista.

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3));   //acessar pelo indíce

        lista.remove(1);              //Remove o Carlos.
        lista.remove(new Usuario("Manu"));

        System.out.println("Tem:" + lista.contains(new Usuario("Lia")));     //Aqui verifica se contém esse objeto.
        System.out.println("Tem:" + lista.contains(u1));     //Aqui verifica se contém esse objeto.

        for(Usuario u : lista){
            System.out.println(u.toString());
        }


        ArrayList <String> novaLista= new ArrayList<>();
        novaLista.add("Tiago");
        novaLista.add("10");
        novaLista.add("40");

        for(Object n : novaLista){
            System.out.println(n.toString());
        }

        if(novaLista.contains("60")){
            System.out.println("achei 0 60");
        }else if(!(novaLista.contains("60"))){
            System.out.println("Não achei o 60");
        }

        System.out.printf("A posição 3 é o valor : %s",novaLista.get(2));
    }
}
