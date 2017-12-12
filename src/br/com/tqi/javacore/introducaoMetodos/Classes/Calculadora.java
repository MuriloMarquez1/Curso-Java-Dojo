package br.com.tqi.javacore.introducaoMetodos.Classes;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);
    }
    public void subtraiDosNumeros(){
        System.out.println(5-5);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        if(num2 != 0) {
            return num1 / num2;
        }else{
            System.out.println("Divisão por 0 não é possivel");
            return 0;
        }
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma = soma + num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma = soma + num;
        }
        System.out.println(soma);
    }
}
