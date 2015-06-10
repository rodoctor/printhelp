package br.com.fatec.printhelp.test;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.fatec.printhelp.dao.OrdemServicoDao;
import br.com.fatec.printhelp.model.OrdemServico;

public class TestaAltera {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		OrdemServico o = new OrdemServico();
    	OrdemServicoDao dao = new OrdemServicoDao();
    	o.setNumero(1);
    	
    	o.setProblema("Sem tonner");
    	o.setDescricaoProblema("Sem toner");
       	o.setSolucao("Colocado novo toner");
    	o.setTempoSla(180);
    	o.setNumeroserie("9X20L99");
    	o.setCnpj(3478567733L);
    	o.setCod_funcionario(2);
    	dao.altera(o);
    	
    	
    	OrdemServico ordemServico = dao.consulta(2);
		System.out.println(ordemServico.getNumero());
		System.out.println(ordemServico.getProblema());
		System.out.println(ordemServico.getDescricaoProblema());
		System.out.println(ordemServico.getDataAbertura());
		System.out.println(ordemServico.getHoraAbertura());
		//int horaA = Integer.parseInt(ordemServico.getHoraAbertura());
		//System.out.println(horaA);
		System.out.println(ordemServico.getDataFechamento());
		
		//int horaF = Integer.parseInt(ordemServico.getHoraFechamento());
		System.out.println(ordemServico.getHoraFechamento());
		System.out.println(ordemServico.getTempoSla());
		System.out.println(ordemServico.getSolucao());
		System.out.println(ordemServico.getCnpj());
		System.out.println(ordemServico.getNumeroserie());
		System.out.println(ordemServico.getCod_funcionario());
	}

}
