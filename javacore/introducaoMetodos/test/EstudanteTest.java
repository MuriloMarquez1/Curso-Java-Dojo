package br.com.tqi.javacore.introducaoMetodos.test;

import br.com.tqi.javacore.introducaoMetodos.Classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome("Murilo Marquez");
        estudante.setIdade(23);
        estudante.setMatricula("11611BSI242");
        estudante.setNotas(new double[]{10, 5, 7});


        estudante.imprimeDados();
        estudante.calculaAprovado();

    }
}
