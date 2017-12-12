package br.com.tqi.javacore.exceptions.runtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        Object o = null;
        int a = 10;
        int b = 0;
        if (b != 0) {
            System.out.println(a / b);
        }

        try {
            System.out.println(o.toString());
        }catch(Exception e){
            e.printStackTrace();
        }

        try {
            int[] array = new int[2];
            System.out.println(array[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("fora do try catch");
    }
}
