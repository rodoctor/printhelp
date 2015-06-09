package br.com.fatec.printhelp.dao;

import br.com.fatec.printhelp.jdbc.ConnectionFactory;
import br.com.fatec.printhelp.model.Cliente;
import br.com.fatec.printhelp.model.Cliente;

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
	public class ClienteDao {
	  // a conexão com o banco de dados
	  private Connection connection;
	  public ClienteDao() throws ClassNotFoundException {
	         this.connection = new ConnectionFactory().getConnection();
	  } 
	  
	  public void adiciona(Cliente cliente) {//Metodo que adiciona registros no BD
	    String sql = "insert into cliente " + "(cnpj,nomeCliente,endereco,telefone,email,responsavel)" +  " values (?,?,?,?,?,?)";
	    try {
	        // prepared statement para inserção
	        PreparedStatement stmt = connection.prepareStatement(sql);
	        // seta os valores
	        stmt.setLong(1,cliente.getCnpj());
	        stmt.setString(2,cliente.getNomeCliente());
	        stmt.setString(3,cliente.getEndereco());
	        stmt.setString(4,cliente.getTelefone());
	        stmt.setString(5,cliente.getEmail());
	        stmt.setString(6,cliente.getResponsavel());
	        // executa
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);}
	    }

	  public List<Cliente> consulta (String cnpj) throws SQLException{           
			try {  
				List<Cliente> clientes = new ArrayList<Cliente>();
				String query = " SELECT nomeCliente,endereco,telefone,email,responsavel FROM cliente WHERE cnpj = ?"; 
	        	PreparedStatement stmt = this.connection.prepareStatement(query); 
	  
	            stmt.setString(1, cnpj);  
	            ResultSet rs = stmt.executeQuery();  
	    	    while (rs.next()) {
	    		       // criando o objeto Cliente
	    		       Cliente cliente = new Cliente();
	    		       cliente.setNomeCliente(rs.getString("nomeCliente"));
	    		       //cliente.setModelo(rs.getString("modelo"));
	    		    
	    		       // adiciona o cliente à lista de clientes
	    		       clientes.add(cliente);
	    		      /* System.out.println(rs.getString("marca"));
	    		       System.out.println(rs.getString("modelo"));*/
	    	    }
	    	    stmt.close();
	    		return clientes;
	        } catch (SQLException e) {
	        throw new RuntimeException(e);
	        }
	      }
	  
	  public void getlista() throws SQLException{//Metodo que lista registros do DB
	    // clientes: array armazena a lista de registros 
	    List<Cliente> clientes = new ArrayList<Cliente>();
	    PreparedStatement stmt = this.connection.prepareStatement("select * from cliente");
	    ResultSet rs = stmt.executeQuery();
	    
	    while (rs.next()) {
	       // criando o objeto Cliente
	       Cliente cliente = new Cliente();
	       cliente.setCnpj(rs.getLong("cnpj"));
	       cliente.setNomeCliente(rs.getString("nomeCliente"));
	       cliente.setEndereco(rs.getString("endereco"));
	       cliente.setTelefone(rs.getString("telefone"));
	       cliente.setEmail(rs.getString("email"));
	       cliente.setResponsavel(rs.getString("responsavel"));
	       // adiciona o cliente à lista de clientes
	       clientes.add(cliente);}
	    }
	    public void remove(Cliente cliente) {//Metodo que remove registros do BD
	        try {
	            PreparedStatement stmt = connection.prepareStatement("delete from cliente where cnpj=?");
	            stmt.setLong(1, cliente.getCnpj());
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	        throw new RuntimeException(e);
	        }
	      }
	      
	      public void altera(Cliente cliente){
	        String sql = "update cliente set nomeCliente=?, endereco=?, telefone=?, email=?, responsavel=? where cnpj=?";
	        try {
	            PreparedStatement stmt = connection.prepareStatement(sql);
	            stmt.setString(1, cliente.getNomeCliente());
	            stmt.setString(2, cliente.getEndereco());
	            stmt.setString(3, cliente.getTelefone());
	            stmt.setString(4, cliente.getEmail());
	            stmt.setString(5, cliente.getResponsavel());
	            stmt.setLong(6, cliente.getCnpj());
	            stmt.execute();
	         }
	         catch (SQLException e) {
	         throw new RuntimeException(e);
	         }
	       }
	    }

