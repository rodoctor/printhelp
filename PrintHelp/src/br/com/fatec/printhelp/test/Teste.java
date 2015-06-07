package br.com.fatec.printhelp.test;

import br.com.fatec.printhelp.dao.OrdemServicoDao;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		OrdemServicoDao dao = new OrdemServicoDao();
		String i;
		i = String.valueOf(dao.pegaHora());
		System.out.println(i);
		System.out.println(dao.pegaData());
		System.out.println(dao.pegaHora());
	}

}
