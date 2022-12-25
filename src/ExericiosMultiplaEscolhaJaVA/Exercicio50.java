package ExericiosMultiplaEscolhaJaVA;

public class Exercicio50 {

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;

        try {
            verify(6, 8);
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }

    public static void verify(int numero1, int numero2) throws Exception {
        if (numero1 > numero2) {
            System.out.println("Número1 é maior!");
        } else {
            throw new Exception();
        }
    }


}
