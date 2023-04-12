package lambdas;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo calculo = new Somar();
        Calculo multiplicacao = new Multiplicar();

        System.out.println(calculo.executar(2,3));
        System.out.println(multiplicacao.executar(2,3));
    }
}
