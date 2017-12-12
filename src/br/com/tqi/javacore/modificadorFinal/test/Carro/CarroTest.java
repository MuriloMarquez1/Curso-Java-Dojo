package br.com.tqi.javacore.modificadorFinal.test.Carro;

import br.com.tqi.javacore.modificadorFinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getCOMPRADOR());
        c.getCOMPRADOR().setNome("Murilo");
        System.out.println(c.getCOMPRADOR());
    }
}
