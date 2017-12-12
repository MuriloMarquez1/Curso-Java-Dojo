package br.com.tqi.javacore.sobrescritaOverride.test;

import br.com.tqi.javacore.sobrescritaOverride.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Murilo");
        pessoa.setIdade(23);

        System.out.println(pessoa);
    }
}
