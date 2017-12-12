package br.com.tqi.javacore.sobrecargaMetodos.test;

import br.com.tqi.javacore.sobrecargaMetodos.Classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("William");

        funcionario.init("Chica da Silva", "098.445.876-03", 4500, "1116558mg");

        funcionario.imprime();
    }
}
