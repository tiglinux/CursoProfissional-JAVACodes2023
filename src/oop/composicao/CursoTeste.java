package oop.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);          //Objeto curso1 passa objeto do tipo Aluno como parâmetro
        curso1.adicionarAluno(aluno2);          //Objeto curso1 passa objeto do tipo Aluno como parâmetro

        curso2.adicionarAluno(aluno1);          //Objeto curso2 passa objeto do tipo Aluno como parâmetro
        curso2.adicionarAluno(aluno3);          //Objeto curso2 passa objeto do tipo Aluno como parâmetro

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso1...");
            System.out.println("E o meu nome é :"+aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome );
            System.out.println(cursoEncontrado.alunos);
        }


    }
}
