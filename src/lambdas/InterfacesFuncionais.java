package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfacesFuncionais {

    private static Consumer<Integer> showInteger = (x) -> System.out.println("O valor de x é :"+x); //A interface Consumer é usada quando não precisa retornar nenhum valor.
    private static Predicate<Integer> isPar = (x) -> x % 2 == 0;
    private static Function<Integer,Integer> multiplyByTwoFunction = (x) -> x * 2;

    public static void main(String[] args) {
        Integer num = 2;

        showInteger.accept(num);
        System.out.println(isPar.test(num));
        System.out.println(multiplyByTwoFunction.apply(2));

    }
}
