package br.com.tqi.javacore.modificadorestatico.test;


import br.com.tqi.javacore.modificadorestatico.classes.Cliente;

public class ClienteTes {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("\nExibindo quantidade de parcelas possiveis...");
//        for(int parcela : c.getParcelas()){
//            System.out.print(parcela + " ");
//        }
        System.out.println("tamanho" + Cliente.getParcelas().length);
    }
}
