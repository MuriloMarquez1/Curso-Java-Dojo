package br.com.tqi.javacore.polimorfismo.test;

import br.com.tqi.javacore.polimorfismo.classes.ArquivoDAO;
import br.com.tqi.javacore.polimorfismo.classes.InterfaceDAO;

public class DAOTest {
    public static void main(String[] args) {
        InterfaceDAO arquivoDAO = new ArquivoDAO();
        arquivoDAO.save();
    }
}
