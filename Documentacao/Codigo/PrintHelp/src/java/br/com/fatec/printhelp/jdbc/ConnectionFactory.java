package br.com.fatec.printhelp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kenedy
 */
public void conectar(String banco, String login, String senha) {
        try
        {
            // Define Driver de conexão JDBC thin
            String URL =  "jdbc:sqlserver://Estacao01\\SQLEXPRESS:1433;databaseName=" + banco +
                          ";user=" + login + ";password="+senha;
 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL);                      
 
                    //Executa pedido SQL
            query = conn.createStatement();
            JOptionPane.showMessageDialog(menssagem, "Conexão Efetuada com sucesso!");
        } 
 
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(menssagem, "Erro na conexão!");
            ex.printStackTrace();
        }
    }

/*public class ConnectionFactory {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            String url ="jdbc:sqlserver://localhost:3306/ordemServico";
            String usuario = "NOTE_KENEDY\\kenedy";
            String senha = " ";
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver"); 
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}*/
