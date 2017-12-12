package br.com.tqi.javacore.introducaoClasses.test.Professor;

import br.com.tqi.javacore.introducaoClasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.cpf = "09844587603";
        professor.matricula = "numeromatricula";
        professor.nome = "Murilo";
        professor.rg = "numeroRG";

        System.out.println(professor.matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.nome);
        System.out.println(professor.rg);
    }
}
