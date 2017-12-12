package br.com.tqi.introducao;

public class ChecaPrimo {
    public static void main(String[] args) {
        int[] listaPrimos = new int[]{1, 2, 5, 7, 13, 15, 16, 18, 19, 21};
        for (int i = 0; i < listaPrimos.length; i++) {
            System.out.println("O número:" + listaPrimos[i]);
            primo(listaPrimos[i]);
        }
    }

    public static void primo(int numero) {

        if (numero == 1 || numero == 2 || numero == 4) {
            System.out.println("Não é primo!!");
        } else if (numero == 3 || numero == 5) {
            System.out.println("É primo!!");
        } else{
            for (int i = 2; i < numero / 2; i++) {
                if (numero % i == 0) {
                    System.out.println("Não é primo!!");
                    break;
                } else {
                    System.out.println("É primo!!");
                    break;
                }
            }
        }

    }
}
