package br.com.fatec.printhelp.test;

import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import br.com.fatec.printhelp.jdbc.ConnectionFactory;

public class TestaConexao {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection c= (Connection) new ConnectionFactory().getConnection();

        System.out.println("conexão aberta");
        c.close();

        System.out.println("conexão fechada");
        
    }
}
