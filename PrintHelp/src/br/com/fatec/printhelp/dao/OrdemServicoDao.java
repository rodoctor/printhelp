package br.com.fatec.printhelp.dao;

import br.com.fatec.printhelp.jdbc.ConnectionFactory;
import br.com.fatec.printhelp.model.OrdemServico;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

	/**
	 *
	 * @author kenedy
	 */
	public class OrdemServicoDao {
	  // a conex�o com o banco de dados
	  private Connection connection;
	  public OrdemServicoDao() throws ClassNotFoundException {
	         this.connection = new ConnectionFactory().getConnection();
	  } 
	  
	  public void adiciona(OrdemServico ordemServico) {//Metodo que adiciona registros no BD
	    String sql = "insert into ordemServico "
	    		+ "(numero,problema,descricaoProblema,dataAbertura,horaAbertura,dataFechamento,"
	    		+ "horaFechamento,solucaoProblema,tempoSla,numeroSerie,cnpj,cod_funcionario)"
	    		+  " values (?,?,?,?,?,?,?,?,?,?,?,?)";
	    try {
	        // prepared statement para inser��o
	        PreparedStatement stmt = connection.prepareStatement(sql);
	        // seta os valores
	        stmt.setInt(1,ordemServico.getNumero());
	        stmt.setString(2,ordemServico.getProblema());
	        stmt.setString(3,ordemServico.getDescricaoProblema());
	        stmt.setString(4,ordemServico.getDataAbertura());
	        stmt.setInt(5,ordemServico.getHoraAbertura());
	        stmt.setString(6,ordemServico.getDataFechamento());
	        stmt.setInt(7,ordemServico.getHoraFechamento());
	        stmt.setString(8,ordemServico.getSolucao());
	        stmt.setInt(9,ordemServico.getTempoSla());
	        stmt.setString(10,ordemServico.getNumeroserie());
	        stmt.setLong(11,ordemServico.getCnpj());
	        stmt.setInt(12,ordemServico.getCod_funcionario());
	        // executa
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);}
	    }

	  
	  public void getlista() throws SQLException{//Metodo que lista registros do DB
	    // ordemServicos: array armazena a lista de registros 
	    List<OrdemServico> ordemServicos = new ArrayList<OrdemServico>();
	    PreparedStatement stmt = this.connection.prepareStatement("select * from ordemServico");
	    ResultSet rs = stmt.executeQuery();
	    
	    while (rs.next()) {
	       // criando o objeto OrdemServico
	       OrdemServico ordemServico = new OrdemServico();
	       ordemServico.setNumero(rs.getInt("numero"));
	       ordemServico.setProblema(rs.getString("problema"));
	       ordemServico.setDescricaoProblema(rs.getString("descricaoProblema"));
	       ordemServico.setDataAbertura(rs.getString("dataAbertura"));
	       ordemServico.setHoraAbertura(rs.getInt("horaAbertura"));
	       ordemServico.setDataFechamento(rs.getString("dataFechamento"));
	       ordemServico.setHoraFechamento(rs.getInt("horaFechamento"));
	       ordemServico.setSolucao(rs.getString("solucaoProblema"));
	       ordemServico.setTempoSla(rs.getInt("tempoSla"));
	       ordemServico.setNumeroserie(rs.getString("numeroSerie"));
	       ordemServico.setCnpj(rs.getLong("cnpj"));
	       ordemServico.setCod_funcionario(rs.getInt("cod_funcionario"));
	    
	       // adiciona o ordemServico � lista de ordemServicos
	       ordemServicos.add(ordemServico);}
	    }
	   /* public void remove(OrdemServico ordemServico) {//Metodo que remove registros do BD
	        try {
	            PreparedStatement stmt = connection.prepareStatement("delete from ordemServico where numero=?");
	            stmt.setInt(1, ordemServico.getNumero());
	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	        throw new RuntimeException(e);
	        }
	      }*/
	      
	      public void altera(OrdemServico ordemServico){
	        String sql = "update ordemServico set problema=?, descricaoProblema=?, dataAbertura=?,"
	        		+ "horaAbertura=?, dataFechamento=?, horaFechamento=?, solucaoProblema=?,"
	        		+ "tempoSla=?, numeroSerie=?, cnpj=?, cod_funcionario=? where numero=?";
	        try {
	            PreparedStatement stmt = connection.prepareStatement(sql);
	            stmt.setString(1, ordemServico.getProblema());
	            stmt.setString(2, ordemServico.getDescricaoProblema());
	            stmt.setString(3, ordemServico.getDataAbertura());
	            stmt.setInt(4, ordemServico.getHoraAbertura());
	            stmt.setString(5, ordemServico.getDataFechamento());
	            stmt.setInt(6, ordemServico.getHoraFechamento());
	            stmt.setString(7, ordemServico.getSolucao());
	            stmt.setInt(8, ordemServico.getTempoSla());
	            stmt.setString(9,ordemServico.getNumeroserie());
	            stmt.setLong(10,ordemServico.getCnpj());
	            stmt.setInt(11,ordemServico.getCod_funcionario());
	            stmt.execute();
	         }
	         catch (SQLException e) {
	         throw new RuntimeException(e);
	         }
	       }
	    }