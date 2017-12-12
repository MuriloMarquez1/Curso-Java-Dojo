package br.com.tqi.javacore.polimorfismo.classes;

public class ArquivoDAO implements InterfaceDAO {

    @Override
    public void save() {
        System.out.println("ArquivosDAO");
    }
}
