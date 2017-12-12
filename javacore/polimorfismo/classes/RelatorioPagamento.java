package br.com.tqi.javacore.polimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Relatório de pagamento funcionario:");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario " + funcionario.getSalario());
        if(funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação nos lucros: " + g.getParticipacaoNoLucro());
        }
        if(funcionario instanceof Vendedor){
            System.out.println("Total vendas: " + ((Vendedor) funcionario).getTotalVendas());
        }
    }

}
