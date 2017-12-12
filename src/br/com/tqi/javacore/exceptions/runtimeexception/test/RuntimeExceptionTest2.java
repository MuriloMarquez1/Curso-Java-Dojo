package br.com.tqi.javacore.exceptions.runtimeexception.test;

public class RuntimeExceptionTest2 {
    public static void main(String[] args) {
        divisao(10,0);
    }
    public static void divisao(int num1, int num2){
       if(num2 == 0){
           throw new IllegalArgumentException("Passe um valor diferente de 0 para divisão");
       }
        System.out.println(num1/num2);
    }
}
