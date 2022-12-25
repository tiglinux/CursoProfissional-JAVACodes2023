package ClassesEObjetos;

import java.util.Scanner;

public class OrientacaoObjetos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomes;
        String rg;
        int idade;

        System.out.println("Digite seu nome: ");
        nomes = leitura.next();

        System.out.println("Digite seu rg: ");
        rg = leitura.next();

        System.out.println("Digite sua idade : ");
        idade = leitura.nextInt();

        System.out.println("Nome:"+nomes);
        System.out.println("RG:"+rg);
        System.out.println("Idade:"+idade);

    }
}
