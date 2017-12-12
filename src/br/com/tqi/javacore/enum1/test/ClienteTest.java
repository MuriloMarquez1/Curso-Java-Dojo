package br.com.tqi.javacore.enum1.test;

import br.com.tqi.javacore.enum1.classes.Cliente;
import br.com.tqi.javacore.enum1.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Murilo", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(cliente);
    }
}
