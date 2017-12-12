package br.com.tqi.javacore.exercicioAssociacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("----------------Relatorio do professor: --------------------");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminario != null && seminario.length != 0) {
            System.out.print("Seminarios participantes: ");
            for (Seminario sem : seminario) {
                System.out.println(sem.getTitulo() + " ");
            }
        }else
            System.out.println("Não participa de nenhum seminario ainda!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEspecialidade() {

        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
