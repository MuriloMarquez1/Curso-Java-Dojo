package br.com.tqi.javacore.interfaces.test;

import br.com.tqi.javacore.interfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
