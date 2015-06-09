package br.com.fatec.printhelp.test;

import java.sql.SQLException;
import java.util.List;

import br.com.fatec.printhelp.dao.ClienteDao;
import br.com.fatec.printhelp.dao.ImpressoraDao;
import br.com.fatec.printhelp.model.Cliente;
import br.com.fatec.printhelp.model.Impressora;

public class TestaConsulta {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
/*		Impressora i = new Impressora();
    	ImpressoraDao dao = new ImpressoraDao();
    		
    	i.setNumeroSerie("Z550021");
    	
        //List<Impressora> impressoras = dao.consulta(i);
        Impressora impressoras = dao.consulta("Z550021");
        
        //imprime as informações dos impressoras:
        //for (Impressora impressora : impressoras) {
        System.out.println("Marca: " + impressoras.getMarca());
        System.out.println("Modelo: " + impressoras.getModelo());
        //}
*/
		
		Cliente c = new Cliente();
		ClienteDao dao = new ClienteDao();
		
		//c.setCnpj(12345678901L);
		Cliente cliente = dao.consulta(78425986003615L);
		System.out.println(cliente.getNomeCliente());
		System.out.println(cliente.getEndereco());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getResponsavel());
	}

}
