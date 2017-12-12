package br.com.tqi.javacore.blocodeinicializacao.classes;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Cliente {
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco");
        for(int i=1; i <=100; i++){
            parcelas[i-1] = i;
        }
    }
    public Cliente(){
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
