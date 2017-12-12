package br.com.tqi.javacore.construtores.test;

import br.com.tqi.javacore.construtores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("121212", "Murilo", new double[]{5,7,9}, "13/05/2222");
        estudante.imprime();

    }
}
