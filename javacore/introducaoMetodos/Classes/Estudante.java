package br.com.tqi.javacore.introducaoMetodos.Classes;

public class Estudante {
    private String nome;
    private int idade;
    private String matricula;
    private double[] notas;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Idade: " + this.idade);
    }

    public void calculaAprovado() {
        if (this.notas == null) {
            System.out.printf("Aluno sem notas.");
            return;
        }
        double somaNotas = 0;
        for (double nota : this.notas) {
            somaNotas += nota;
        }
        if (somaNotas / this.notas.length > 6) {
            System.out.println("Media final: " + somaNotas / this.notas.length + " Aluno aprovado!!");
        } else {
            System.out.println("Media final: " + somaNotas / this.notas.length + " Aluno reprovado");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }
}
