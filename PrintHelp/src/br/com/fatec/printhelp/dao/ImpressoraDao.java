package br.com.fatec.printhelp.dao;

import br.com.fatec.printhelp.jdbc.ConnectionFactory;
import br.com.fatec.printhelp.model.Impressora;
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
	public class ImpressoraDao {
	  // a conexão com o banco de dados
	  private Connection connection;
	  public ImpressoraDao() throws ClassNotFoundException {
	         this.connection = new ConnectionFactory().getConnection();
	  } 
	  
	  public void adiciona(Impressora impressora) {//Metodo que adiciona registros no BD
	    String sql = "insert into impressora " 
	    		+ "(numeroSerie,marca,modelo)" 
	    		+  " values (?,?,?)";
	    try {
	        // prepared statement para inserção
	        PreparedStatement stmt = connection.prepareStatement(sql);
	        // seta os valores
	        stmt.setString(1,impressora.getNumeroSerie());
	        stmt.setString(2,impressora.getMarca());
	        stmt.setString(3,impressora.getModelo());

	        // executa
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);}
	    }

	  /*public List<Impressora> consulta (Impressora numero) throws SQLException{           
		try {  
			List<Impressora> impressoras = new ArrayList<Impressora>();
			String query = " SELECT marca, modelo FROM impressora WHERE numeroSerie = ?"; 
        	PreparedStatement stmt = this.connection.prepareStatement(query); 
  
            stmt.setString(1, numero.getNumeroSerie()); 
            ResultSet rs = stmt.executeQuery();  
    	    while (rs.next()) {
    		       // criando o objeto Impressora
    		       Impressora impressora = new Impressora();
    		       impressora.setMarca(rs.getString("marca"));
    		       impressora.setModelo(rs.getString("modelo"));
    		    
    		       // adiciona o impressora à lista de impressoras
    		       impressoras.add(impressora);
    		       System.out.println(rs.getString("marca"));
    		       System.out.println(rs.getString("modelo"));
    	    }
    	    stmt.close();
    		return impressoras;
        } catch (SQLException e) {
        throw new RuntimeException(e);
        }
      }*/
	  
	  public Impressora consulta (Impressora impressora) throws SQLException{           
			try {  
				//List<Impressora> impressoras = new ArrayList<Impressora>();
				String query = " SELECT marca, modelo FROM impressora WHERE numeroSerie = ?"; 
	        	PreparedStatement stmt = this.connection.prepareStatement(query); 
	  
	            stmt.setString(1, impressora.getNumeroSerie()); 
	            ResultSet rs = stmt.executeQuery();  
	    	    if (rs.next()) {
	    		       impressora.setMarca(rs.getString("marca"));
	    		       impressora.setModelo(rs.getString("modelo"));
	    	    }
	    	    stmt.close();
	    		return impressora;
	        } catch (SQLException e) {
	        throw new RuntimeException(e);
	        }
	      }
	  
	  
	  public Impressora consulta (String numeroSerie) throws SQLException{           
			try {  
				//List<Impressora> impressoras = new ArrayList<Impressora>();
				String query = " SELECT marca, modelo FROM impressora WHERE numeroSerie = ?"; 
	        	PreparedStatement stmt = this.connection.prepareStatement(query); 
	  
	        	Impressora impressora = new Impressora();
	        	
	            stmt.setString(1, numeroSerie); 
	            ResultSet rs = stmt.executeQuery();  
	    	    if (rs.next()) {
	    	    	   impressora.setNumeroSerie(numeroSerie);
	    		       impressora.setMarca(rs.getString("marca"));
	    		       impressora.setModelo(rs.getString("modelo"));
	    	    }
	    	    stmt.close();
	    		return impressora;
	        } catch (SQLException e) {
	        throw new RuntimeException(e);
	        }
	      }
	  
	  
	  
	  
	  /*public void getlista() throws SQLException{//Metodo que lista registros do DB
	    // impressoras: array armazena a lista de registros 
	    List<Impressora> impressoras = new ArrayList<Impressora>();
	    PreparedStatement stmt = this.connection.prepareStatement("select * from impressora");
	    ResultSet rs = stmt.executeQuery();
	    
	    while (rs.next()) {
	       // criando o objeto Impressora
	       Impressora impressora = new Impressora();
	       impressora.setNumeroSerie(rs.getString("numreroSerie"));
	       impressora.setMarca(rs.getString("marca"));
	       impressora.setModelo(rs.getString("modelo"));
	    
	       // adiciona o impressora à lista de impressoras
	       impressoras.add(impressora);}
	    }*/
	    public void remove(Impressora impressora) {//Metodo que remove registros do BD
	        try {
	            PreparedStatement stmt = connection.prepareStatement("delete from impressora where numeroSerie=?");
	            stmt.setString(1, impressora.getNumeroSerie());
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	        throw new RuntimeException(e);
	        }
	      }
	      
	      public void altera(Impressora impressora){
	        String sql = "update impressora set marca=?, modelo=? where numeroSerie=?";
	        try {
	            PreparedStatement stmt = connection.prepareStatement(sql);
	            stmt.setString(1, impressora.getMarca());
	            stmt.setString(2, impressora.getModelo());
	            stmt.setString(3, impressora.getNumeroSerie());

	            stmt.execute();
	         }
	         catch (SQLException e) {
	         throw new RuntimeException(e);
	         }
	       }
	    }


