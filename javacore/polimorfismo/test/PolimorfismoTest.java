package br.com.tqi.javacore.polimorfismo.test;

import br.com.tqi.javacore.polimorfismo.classes.Funcionario;
import br.com.tqi.javacore.polimorfismo.classes.Gerente;
import br.com.tqi.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.tqi.javacore.polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Xubislubis", 5000, 2000);
        Vendedor v = new Vendedor("Xablausio", 2000, 20000);

        RelatorioPagamento relatorios = new RelatorioPagamento();
        relatorios.relatorioPagamentoGenerico(g);
        System.out.println(" ----------------------------------------------------------- ");
        relatorios.relatorioPagamentoGenerico(v);

    }


}
