package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";    //lamba expression


        Function<String, String> oResultadoE =
                valor -> "O resultado é :" + valor;

        Function<String,String> empolgado =
                valor -> valor + "!!!";

        Function<String,String> duvida =
                valor -> valor + "??";

        String resultadoFinal = parOuImpar
                        .andThen(oResultadoE)
                        .andThen(empolgado)
                        .apply(32);      //O apply retorna o resultado da função
        System.out.println(resultadoFinal);


        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(33);

        System.out.println(resultadoFinal2);

    }
}
