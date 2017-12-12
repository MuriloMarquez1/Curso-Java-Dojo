package br.com.tqi.javacore.modificadorestatico.classes;

public class Cliente {
    private static int[] parcelas;
    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco");
        for(int i=1; i <=100; i++){
            parcelas[i-1] = i;
        }
    }
    public Cliente(){
    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
}
