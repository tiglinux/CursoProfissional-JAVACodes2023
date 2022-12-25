package oop.heranca;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private boolean impresso;

    public Livro(){
        this.valor = 30.5;
        this.isbn ="000-00-00000-00-0";
        this.impresso = true;
    }

    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.3){
            return false;
        }
        this.valor = this.valor * porcentagem;
        return  true;
    }
}
