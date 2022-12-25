package ArraysCollections.Colecoes;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome){
        this.nome = nome;
    }


    public String toString() {
        return "Meu nome é :"+ this.nome+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
