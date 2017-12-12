package br.com.tqi.javacore.enum1.classes;

public class Cliente {
    public enum TipoPagamento{
        AVISTA, APRAZO;
    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipopagamento;

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipopagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipopagamento = tipopagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNome() +
                ", tipopagamento=" + tipopagamento +
                ", numero =" + tipoCliente.getTipo() +
                '}';
    }

    public TipoPagamento getTipopagamento() {
        return tipopagamento;
    }

    public void setTipopagamento(TipoPagamento tipopagamento) {
        this.tipopagamento = tipopagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}