package br.com.tqi.introducao;

public class Array {
    public static void main(String[] args) {
        double[] arrayInt = new double[10];

        for(int i = 0; i < arrayInt.length; i++){
            arrayInt[i] =  Math.pow(2, i);
            System.out.println(arrayInt[i]);
        }

    }
}
