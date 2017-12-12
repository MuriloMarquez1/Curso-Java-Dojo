package br.com.tqi.javacore.herança.test;

import br.com.tqi.javacore.herança.classes.*;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Zuru");
        p.setNome("Gina");
        p.setCpf("09844587603");

        Endereço end = new Endereço();
        end.setRua("Rua x");
        end.setBairro("Bairro Y");

        p.setEndereco(end);
        p.imprime();
        System.out.println("-----------------------------------");

        Funcionario f = new Funcionario("Xablaus");
        f.setNome("MURILO");
        f.setCpf("098445888888");
        f.setEndereco(end);
        f.setSalario(1500);
        f.imprime();




    }
}
