package br.com.fatec.printhelp.test;

import br.com.fatec.printhelp.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author kenedy
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

            Connection c= new ConnectionFactory().getConnection();

            System.out.println("conexão aberta");
            c.close();

            System.out.println("conexão fechada");
     }
    
}