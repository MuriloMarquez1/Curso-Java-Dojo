package br.com.tqi.javacore.introducaoMetodos.test;

import br.com.tqi.javacore.introducaoMetodos.Classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDosNumeros();
        calc.multiplicaDoisNumeros(5, 5);
        System.out.println(calc.divideDoisNumeros(20, 2));

        int[] numeros = {1,2,3,4,5};

        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5,6);
    }
}
