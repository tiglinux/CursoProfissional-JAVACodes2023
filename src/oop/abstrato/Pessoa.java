package oop.abstrato;

public abstract class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    abstract String mostrarNome(String nome);

}
