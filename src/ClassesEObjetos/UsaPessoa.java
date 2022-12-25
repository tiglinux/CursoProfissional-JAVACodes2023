package ClassesEObjetos;

public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();           //Objeto do tipo Pessoa
        pessoa.setNome("Tiago");                //Passando nome através do método set();
        System.out.println(pessoa.getNome());   //Mostrando nome através do método get();

    }
}
