package br.com.tqi.introducao;

public class ExercicioArray2 {
    public static void main(String[] args) {
        double[] vetorA = new double[] {0,1,2,3,4,5,6,7,8,9};
        double[] vetorB = new double[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = fatorial(vetorA[i]);
            System.out.println(vetorB[i]);
        }
    }

    public static double fatorial(double valor) {
        double resultado = 1;
        if (valor == 0 || valor == 1){
            return 1;
        }
        else {
            while (valor > 1) {
                resultado = resultado * valor;
                valor--;
            }
        }
        return resultado;
    }

}
