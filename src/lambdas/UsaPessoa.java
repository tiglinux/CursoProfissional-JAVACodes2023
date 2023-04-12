package lambdas;

public class UsaPessoa {
    public static void main(String [] args){
        Pessoa p;

        int i;
        p = (idade) -> 30; //Lamba expression
        System.out.printf("Sua idade é : %d anos",p.getIdade(30));



    }
}
