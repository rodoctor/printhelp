package br.com.fatec.printhelp.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.printhelp.dao.ImpressoraDao;
import br.com.fatec.printhelp.dao.OrdemServicoDao;
import br.com.fatec.printhelp.model.Impressora;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		OrdemServicoDao dao = new OrdemServicoDao();
//		String i;
//		i = String.valueOf(dao.pegaHora());
//		System.out.println(i);
//		System.out.println(dao.pegaData());
//		System.out.println(dao.pegaHora());
		
		List<Impressora> impressoras = new ArrayList<Impressora>();
		ImpressoraDao dao = new ImpressoraDao();
		impressoras = dao.getlista();
		
		for(Impressora imp: impressoras){
		System.out.println(imp.getNumeroSerie());
		}
	}

}
