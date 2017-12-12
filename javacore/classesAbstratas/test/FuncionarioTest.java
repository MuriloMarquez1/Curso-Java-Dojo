package br.com.tqi.javacore.classesAbstratas.test;

import br.com.tqi.javacore.classesAbstratas.classes.Funcionario;
import br.com.tqi.javacore.classesAbstratas.classes.Gerente;
import br.com.tqi.javacore.classesAbstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("ANA", "20131b", 1500);
        g.calculaSalario();
        System.out.println(g);

        Vendedor v = new Vendedor("CAMILA", "1230912C", 1500, 5000);
        v.calculaSalario();
        System.out.println(v);
    }
}
