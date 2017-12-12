package br.com.tqi.javacore.modificadorestatico.test;

import br.com.tqi.javacore.modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro("BMW", 280);
        Carro c2 = new Carro("gol", 300);
        Carro c3 = new Carro("agile", 250);

        c.imprime();
        c2.imprime();
        c3.imprime();
        //Por ser static, muda todos os objetos.
        Carro.setVelocidadeLimite(200);
        c.imprime();
        c2.imprime();
        c3.imprime();
    }
}
