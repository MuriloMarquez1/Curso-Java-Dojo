package br.com.tqi.javacore.exceptions.checkedExceptions.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        abrirArquivo();
    }
// voce pode delegar a exceção pra classe que a chamou, basta adicionar na classe- > public static void criaArquivo() throws "EXCEPTION"{
    public static void criaArquivo() {
        File file = new File("Teste.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Deu não fião, tenta dnv que arquivo deu pau");
        }
    }
    public static void abrirArquivo() {
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            System.out.println("dentro do catch");
            e.printStackTrace();
            System.out.println("Deu não fião, tenta dnv que arquivo deu pau");
        }finally{
            System.out.println("Fechar o arquivo");
        }
    }
}


