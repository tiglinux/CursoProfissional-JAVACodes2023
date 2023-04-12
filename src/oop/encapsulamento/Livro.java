package oop.encapsulamento;

public class Livro implements LivroModel {
    private String nome;
    private int paginas;

    Livro(String nome){
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String mostrarNomeLivro(String nomeLivro) {
        this.nome = nomeLivro;
        return this.nome;
    }
}
