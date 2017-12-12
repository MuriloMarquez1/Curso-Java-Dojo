package br.com.tqi.javacore.exercicioAssociacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void print() {
        System.out.println("----------------Relatorio do seminário: --------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor palestrante: " + this.professor.getNome());
        if (this.local != null)
            System.out.println("Local: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
        else
            System.out.println("Nenhum local cadastrado para esse seminario.");
        if(this.alunos != null && this.alunos.length != 0) {
            System.out.print("Alunos participantes: ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome() + " ");
            }
        }else
            System.out.println("Nenhum aluno participante desse seminario");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
