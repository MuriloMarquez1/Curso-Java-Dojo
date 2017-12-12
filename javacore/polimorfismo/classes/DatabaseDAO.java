package br.com.tqi.javacore.polimorfismo.classes;

public class DatabaseDAO implements InterfaceDAO {
    @Override
    public void save() {
        System.out.println("databasedao");
    }
}
