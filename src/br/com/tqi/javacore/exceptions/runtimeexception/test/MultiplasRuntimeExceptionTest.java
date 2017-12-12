package br.com.tqi.javacore.exceptions.runtimeexception.test;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch(ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
    }
}
