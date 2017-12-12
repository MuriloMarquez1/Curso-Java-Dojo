package br.com.tqi.javacore.exercicioAssociacao.test;

import br.com.tqi.javacore.exercicioAssociacao.classes.Aluno;
import br.com.tqi.javacore.exercicioAssociacao.classes.Local;
import br.com.tqi.javacore.exercicioAssociacao.classes.Professor;
import br.com.tqi.javacore.exercicioAssociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("William Suane", 27);
        Aluno aluno2 = new Aluno("Darth Vader", 32);
        Seminario seminario = new Seminario("Como ficar rico");
        Professor professor = new Professor("Yoda", "Jedi");
        Local local = new Local("Azeroth", "Ogrimmar");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno, aluno2});
        professor.setSeminario(new Seminario[]{seminario});

        professor.print();
        seminario.print();
        aluno.print();
    }
}
