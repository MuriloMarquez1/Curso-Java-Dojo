package br.com.tqi.javacore.introducaoClasses.test;


import br.com.tqi.javacore.introducaoClasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Fusca";
        carro.placa = "PVF-0782";
        carro.velocidadeMaxima = 120f;

        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
        System.out.println(carro.modelo);

    }
}
