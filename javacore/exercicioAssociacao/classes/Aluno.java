package br.com.tqi.javacore.exercicioAssociacao.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    public void print() {
        System.out.println("----------------Relatorio do alunos: --------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminario inscrito: " + this.seminario.getTitulo());
        }else
            System.out.println("Aluno nao esta inscrito em nenhum seminario");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
