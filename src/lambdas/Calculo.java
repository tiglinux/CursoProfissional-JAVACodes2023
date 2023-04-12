package lambdas;

@FunctionalInterface                //Permite criar apenas um único método.
public interface Calculo {
    double executar(double a, double b);

    default String legal(){
        return "Legal";
    }

    static String muitoLegal(){
        return "Muito legal";
    }


}
