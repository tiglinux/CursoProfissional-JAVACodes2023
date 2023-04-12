package ArraysCollections.Colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        boolean resultado2 = usuarios.contains(new Usuario("Tiago"));
        System.out.println(resultado);

        if(resultado2 == false){
            for(int i = 0; i < 3; i++){
                System.out.println("Não existe um usuário chamado: Tiago! , já te disse 3 vezes!!!");
            }
        }else{
            System.out.println("Existe sim um user chamado : Tiago!");
        }
    }
}
