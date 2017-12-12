package br.com.tqi.introducao;

public class ConditionalsFor {
    public static void imprimirPares(int valor){
        for(int i = 0; i<= valor; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        ConditionalsFor.imprimirPares(100000);
    } 
}
