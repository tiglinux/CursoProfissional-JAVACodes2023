package oop.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome;
    List<Aluno> alunos = new ArrayList<>();

    Curso(String nome){
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){               //Aqui passa um objeto do tipo Aluno como parâmetro
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
