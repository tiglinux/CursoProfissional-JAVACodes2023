package ArraysCollections;

public class Matriz {
    public static void main(String[] args) {
        double [][] matriz = new double[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 1;

        for(int a = 0; a < matriz.length; a+=1){
            for(int b = 0; b < matriz[a].length; b+=1){
                System.out.println(matriz[b]);
            }
        }

        String [][] nomes = new String[2][2];
        nomes[0][0]="Oi";
        nomes[0][1]="Olá";
        nomes[1][0]="Lucas";
        nomes[1][1]="João";

        for(int i =0; i < 2; i+=1){
            for(int x = 0; x < 2;x+=1){
                System.out.println(nomes[i][x]);
            }
        }




    }
}
