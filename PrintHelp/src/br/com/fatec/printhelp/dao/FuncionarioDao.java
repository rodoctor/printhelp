package br.com.fatec.printhelp.dao;

import br.com.fatec.printhelp.jdbc.ConnectionFactory;
import br.com.fatec.printhelp.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

	/**
	 *
	 * @author kenedy
	 */
	public class FuncionarioDao {
	  // a conexão com o banco de dados
	  private Connection connection;
	  public FuncionarioDao() throws ClassNotFoundException {
	         this.connection = new ConnectionFactory().getConnection();
	  } 
	  
	  public void adiciona(Funcionario funcionario) {//Metodo que adiciona registros no BD
	    String sql = "insert into funcionario " + "(cod_funcionario,nome,cargo,telefone,email,administrador,senha)" +  " values (?,?,?,?,?,?,?)";
	    try {
	        // prepared statement para inserção
	        PreparedStatement stmt = connection.prepareStatement(sql);
	        // seta os valores
	        stmt.setLong(1,funcionario.getCod_funcionario());
	        stmt.setString(2,funcionario.getNome());
	        stmt.setString(3,funcionario.getCargo());
	        stmt.setString(4,funcionario.getTelefone());
	        stmt.setString(5,funcionario.getEmail());
	        stmt.setString(6,funcionario.getAdministrador());
	        stmt.setString(7,funcionario.getSenha());
	        // executa
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);}
	    }

	  
	  public void getlista() throws SQLException{//Metodo que lista registros do DB
	    // funcionarios: array armazena a lista de registros 
	    List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	    PreparedStatement stmt = this.connection.prepareStatement("select * from funcionario");
	    ResultSet rs = stmt.executeQuery();
	    
	    while (rs.next()) {
	       // criando o objeto Funcionario
	       Funcionario funcionario = new Funcionario();
	       funcionario.setCod_funcionario(rs.getLong("cod_funcionario"));
	       funcionario.setNome(rs.getString("nome"));
	       funcionario.setCargo(rs.getString("cargo"));
	       funcionario.setTelefone(rs.getString("telefone"));
	       funcionario.setEmail(rs.getString("email"));
	       funcionario.setAdministrador(rs.getString("administrador"));
	       funcionario.setSenha(rs.getString("senha"));
	    
	       // adiciona o funcionario à lista de funcionarios
	       funcionarios.add(funcionario);}
	    }
	    public void remove(Funcionario funcionario) {//Metodo que remove registros do BD
	        try {
	            PreparedStatement stmt = connection.prepareStatement("delete from funcionario where cod_funcionario=?");
	            stmt.setLong(1, funcionario.getCod_funcionario());
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	        throw new RuntimeException(e);
	        }
	      }
	      
	      public void altera(Funcionario funcionario){
	        String sql = "update funcionario set nome=?, cargo=?, telefone=?, email=?, administrador=?, senha=? where cod_funcionario=?";
	        try {
	            PreparedStatement stmt = connection.prepareStatement(sql);
	            stmt.setString(1, funcionario.getNome());
	            stmt.setString(2, funcionario.getCargo());
	            stmt.setString(3, funcionario.getTelefone());
	            stmt.setString(4, funcionario.getEmail());
	            stmt.setString(5, funcionario.getAdministrador());
	            stmt.setString(6, funcionario.getSenha());
	            stmt.setLong(7, funcionario.getCod_funcionario());
	            stmt.execute();
	            
	     
	         }
	         catch (SQLException e) {
	         throw new RuntimeException(e);
	         }
	       }
	    }


