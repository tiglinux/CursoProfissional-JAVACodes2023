package oop.encapsulamento;

public class UsaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("PHP para Iniciantes");
        livro1.setPaginas(300);
        System.out.printf("O nome do livro é : %s",livro1.getNome());
        System.out.println();
        System.out.println("A quantidade de páginas é : "+livro1.getPaginas());
    }
}
