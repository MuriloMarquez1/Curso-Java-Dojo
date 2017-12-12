package br.com.tqi.javacore.blocodeinicializacao.test;

import br.com.tqi.javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTes {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("\nExibindo quantidade de parcelas possiveis...");
        for(int parcela : c.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
