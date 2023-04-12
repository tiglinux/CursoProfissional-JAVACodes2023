package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo soma = (x,y) ->{        //lambda expression. função anônima
            return x + y;
        };


        Calculo multiplicar = (x,y) -> x * y;           //lambda expression multiplicar

        System.out.println(soma.executar(2,3));
        System.out.println(multiplicar.executar(10,2));
        System.out.println(multiplicar.legal());
        System.out.println(Calculo.muitoLegal());

    }
}
