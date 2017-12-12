package br.com.tqi.javacore.exceptions.checkedExceptions.test;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {

    }

    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void lerArquivo() {

        try(Reader reader = new BufferedReader(new FileReader("text.txt"));) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


