package br.com.fatec.printhelp.dao;

import br.com.fatec.printhelp.jdbc.ConnectionFactory;
import br.com.fatec.printhelp.model.Funcionario;
import br.com.fatec.printhelp.model.OrdemServico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

	/**
	 *
	 * @author kenedy
	 */
	public class OrdemServicoDao {
	  // a conexão com o banco de dados
	  private Connection connection;
	  public OrdemServicoDao() throws ClassNotFoundException {
	         this.connection = new ConnectionFactory().getConnection();
	  } 
	  
	  public void adiciona(OrdemServico ordemServico) {//Metodo que adiciona registros no BD
	    String sql = "insert into ordemServico "
	    		+ "(problema,descricaoProblema,dataAbertura,horaAbertura,dataFechamento,"
	    		+ "horaFechamento,solucaoProblema,tempoSla,numeroSerie,cnpj,cod_funcionario)"
	    		+  " values (?,?,?,?,?,?,?,?,?,?,?)";
	    try {
	        // prepared statement para inserção
	        PreparedStatement stmt = connection.prepareStatement(sql);
	        // seta os valores
	        //stmt.setInt(1,ordemServico.getNumero());
	        stmt.setString(1,ordemServico.getProblema());
	        stmt.setString(2,ordemServico.getDescricaoProblema());
	        stmt.setString(3,ordemServico.getDataAbertura());
	        stmt.setInt(4,ordemServico.getHoraAbertura());
	        stmt.setString(5,ordemServico.getDataFechamento());
	        stmt.setInt(6,ordemServico.getHoraFechamento());
	        stmt.setString(7,ordemServico.getSolucao());
	        stmt.setInt(8,ordemServico.getTempoSla());
	        stmt.setString(9,ordemServico.getNumeroserie());
	        stmt.setLong(10,ordemServico.getCnpj());
	        stmt.setInt(11,ordemServico.getCod_funcionario());
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
	    
	       // adiciona o ordemServico à lista de ordemServicos
	       ordemServicos.add(ordemServico);}
	    }
	  
	  public void fecha(OrdemServico ordemServico){
	        String sql = "update ordemServico set dataFechamento=?, horaFechamento=?,"
	        		+ " solucaoProblema=? where numero=?";
	        try {
	            PreparedStatement stmt = connection.prepareStatement(sql);
	            
	            stmt.setString(1, ordemServico.getDataFechamento());
	            stmt.setInt(2, ordemServico.getHoraFechamento());
	            stmt.setString(3, ordemServico.getSolucao());
	            stmt.setInt(4,ordemServico.getNumero());
	            stmt.execute();
	         }
	         catch (SQLException e) {
	         throw new RuntimeException(e);
	         }
	       }
	      
	  public OrdemServico consulta (int codigo) throws SQLException{           
			try {  
				//List<Funcionario> funcionarios = new ArrayList<Funcionario>();
				String query = " SELECT numero,problema,descricaoProblema,dataAbertura,horaAbertura,dataFechamento,horaFechamento,solucaoProblema,tempoSla,numeroSerie,cnpj,cod_funcionario FROM ordemServico WHERE numero = ?"; 
	        	PreparedStatement stmt = this.connection.prepareStatement(query); 
	        	OrdemServico ordemServico = new OrdemServico();
	            stmt.setLong(1, codigo); 
	            ResultSet rs = stmt.executeQuery();  
	    	    if (rs.next()) {
	    		       
	    		       ordemServico.setNumero(rs.getInt("numero"));
	    		       ordemServico.setProblema(rs.getString("problema"));
	    		       ordemServico.setDescricaoProblema(rs.getString("descricaoProblema"));
	    		       ordemServico.setDataAbertura(rs.getString("dataAbertura"));
	    		       
	    		       //pega horaAbertura, elimina os 2 pontos(:), converte para int e seta no objeto
	    		       String hora = rs.getString("horaAbertura");
	    		       hora = hora.replace( ":" , ""); //tira dois pontos 
	    		       int horaA = Integer.parseInt(hora);
	    		       ordemServico.setHoraAbertura(horaA);
	    		      //================================================================
	    		       ordemServico.setDataFechamento(rs.getString("dataFechamento"));
	    		       
	    		       //pega horaFechamento, elimina os 2 pontos(:), converte para int e seta no objeto
	    		       hora = rs.getString("horaFechamento");
	    		       hora = hora.replace( ":" , ""); //tira dois pontos 
	    		       int horaF = Integer.parseInt(hora);
	    		       ordemServico.setHoraFechamento(horaF);
	    		       //==============================================================
	    		       
	    		       
	    		       ordemServico.setSolucao(rs.getString("solucaoProblema"));
	    		       ordemServico.setTempoSla(rs.getInt("tempoSla"));
	    		       ordemServico.setNumeroserie(rs.getString("numeroSerie"));
	    		       ordemServico.setCnpj(rs.getLong("cnpj"));
	    		       ordemServico.setCod_funcionario(rs.getInt("cod_funcionario"));
	    		       //ordemServico.setNumero(rs.getInt(codigo));

	    	    }
	    	    stmt.close();
	    		return ordemServico;
	        } catch (SQLException e) {
	        throw new RuntimeException(e);
	        }
	      }
	  
	      public void altera(OrdemServico ordemServico){
	        String sql = "update ordemServico set problema=?, descricaoProblema=?,"
	        		+ " solucaoProblema=?, tempoSla=?, numeroSerie=?, cnpj=?, cod_funcionario=? where numero=?";
	        try {
	            PreparedStatement stmt = connection.prepareStatement(sql);
	            
	            stmt.setString(1, ordemServico.getProblema());
	            stmt.setString(2, ordemServico.getDescricaoProblema());
	            stmt.setString(3, ordemServico.getSolucao());
	            stmt.setInt(4, ordemServico.getTempoSla());
	            stmt.setString(5,ordemServico.getNumeroserie());
	            stmt.setLong(6,ordemServico.getCnpj());
	            stmt.setInt(7,ordemServico.getCod_funcionario());
	            stmt.setInt(8,ordemServico.getNumero());
	            stmt.execute();
	         }
	         catch (SQLException e) {
	         throw new RuntimeException(e);
	         }
	       }
	      
	      public String pegaData(){
	    	//Pega data atual e formata para o BD
	      	Calendar d = Calendar.getInstance();
	      	Date data = d.getTime();
	      	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
	      	String dta = f.format(data);
			return dta;
	      }
	      
	      //public int pegaHora(){
	      public String pegaHora(){
	    	//Pega hora atual e formata para o BD
	      	Calendar d = Calendar.getInstance();
	      	Date data = d.getTime();
	      	SimpleDateFormat h = new SimpleDateFormat("HHmmss");
	      	String hora_ab = h.format(data);
	      	//int hora_abertura = Integer.parseInt(hora_ab);
			return hora_ab;
	      }
	    }
