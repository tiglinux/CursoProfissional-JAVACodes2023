package ArraysCollections;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 3.5;
        notasAlunoA[1] = 6.8;
        notasAlunoA[2] = 8.0;

        for (double notaAlunoA : notasAlunoA) {
            System.out.printf("A notas do aluno são : %5.2f", (notaAlunoA));
            System.out.println("");
        }

        //Convertendo array para String(para ser impressa)
        System.out.println(Arrays.toString(notasAlunoA));

        //Criando Array (Forma 2)
        double[] notasAlunoB = {4, 6, 10, 2.3};

        for(int i=0; i < notasAlunoB.length; i+=1){
            System.out.println(notasAlunoB[i]);
        }
    }
}
