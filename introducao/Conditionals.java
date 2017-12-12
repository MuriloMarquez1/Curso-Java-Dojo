package br.com.tqi.introducao;

public class Conditionals {
    public static void testeIf(double salario) {
        if (salario < 1000) {
            System.out.println(salario * 5 / 100);
        } else if (salario >= 1000 && salario < 2000) {
            System.out.println(salario * 10 / 100);
        } else if (salario >= 2000 && salario < 4000) {
            System.out.println(salario * 15 / 100);
        } else {
            System.out.println(salario * 20 / 100);
        }
    }

    public static void main(String[] args) {
        Conditionals.testeIf(2578);
    }
}
