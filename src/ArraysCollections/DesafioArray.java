package ArraysCollections;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int qtdNotas = 0;
        double somaNotas = 0;

        System.out.println("Quantas notas você quer informar?: ");
        qtdNotas = leitura.nextInt();

        double[] arrayNotas = new double[qtdNotas];

        for (int i = 0; i < arrayNotas.length; i += 1) {
            System.out.printf("Digite a %d nota:", i + 1);
            arrayNotas[i] = leitura.nextDouble();
            System.out.println("");

            somaNotas+= arrayNotas[i];
        }

        System.out.println("A soma total é : "+somaNotas);
        leitura.close();
    }
}
