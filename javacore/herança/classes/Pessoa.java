package br.com.tqi.javacore.herança.classes;

public class Pessoa{
    protected String nome;
    protected String cpf;
    protected Endereço endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;

    }
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if(this.endereco != null)
            System.out.println("Endereço: " + this.endereco.getRua() + ". " + this.endereco.getBairro());
        else
            System.out.println("Pessoa sem endereço cadastrado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }
}
