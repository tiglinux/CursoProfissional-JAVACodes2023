package ArraysCollections;


public class HashCodesEquals {
    public static void main(String[] args) {
        Teste t1 = new Teste();
        t1.nome = "Tiago";
        t1.email = "tiago.programador@hotmail.com";

        Teste t2 = new Teste();
        t2.nome = "Tiago";
        t2.email = "tiago.programador@hotmail.com";

        //Iremos verificar com o equals se um objeto é igual ao outro (true or false)
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t1));


    }
}
