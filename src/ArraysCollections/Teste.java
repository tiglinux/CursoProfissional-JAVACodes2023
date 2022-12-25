package ArraysCollections;

public class Teste {
    String nome;
    String email;

    public boolean equals(Object objeto) {

        if (objeto instanceof Teste) {
            Teste testeOutro = (Teste) objeto;                      //Casting para Objeto ()

            boolean nomeIgual = testeOutro.nome.equals(this.nome);
            boolean emailIgual = testeOutro.email.equals(this.email);

            return nomeIgual && emailIgual;

        } else {
            return false;
        }

    }
    //Aqui permite avaliar o hashcode de um nome (Length)
    public int hashCode() {
        return this.nome.length();
    }
}
