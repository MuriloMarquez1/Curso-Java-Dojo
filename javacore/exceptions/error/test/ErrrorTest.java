package br.com.tqi.javacore.exceptions.error.test;

public class ErrrorTest {
    public static void main(String[] args) {
        stackOverflowError();
    }

    public static void stackOverflowError(){
        stackOverflowError();
        System.out.println("Se isso printar, o poi é macho");
    }

}
