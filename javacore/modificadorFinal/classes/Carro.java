package br.com.tqi.javacore.modificadorFinal.classes;
//FINAL NAS CLASSES = NAO PODE SER HERDADO DE NENHUMA OUTRA, FINAL EM METODO = NAO PODE SER SOBRESCRITO. FINAL EM ATRIBUTO = NAO PODE SER MUDADO.
public class Carro {
    public static final double VELOCIDADE_FINAL = 250;
    private final Comprador COMPRADOR = new Comprador();
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }

}
