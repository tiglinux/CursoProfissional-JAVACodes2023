package oop.encapsulamento;

public class Pessoa {
    private int idade;

    public Pessoa(int idade){
        this.idade = idade;
    }

    public int lerIdade(){                              //método getter
        return idade;
    }

    public void alterarIdade(int novaIdade){           //método setter
        this.idade = novaIdade;
    }
}
