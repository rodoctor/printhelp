package br.com.fatec.printhelp.test;

import java.sql.SQLException;
import java.util.List;

import br.com.fatec.printhelp.dao.ClienteDao;
import br.com.fatec.printhelp.dao.FuncionarioDao;
import br.com.fatec.printhelp.dao.ImpressoraDao;
import br.com.fatec.printhelp.dao.OrdemServicoDao;
import br.com.fatec.printhelp.model.Cliente;
import br.com.fatec.printhelp.model.Funcionario;
import br.com.fatec.printhelp.model.Impressora;
import br.com.fatec.printhelp.model.OrdemServico;

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
		
		/*Cliente c = new Cliente();
		ClienteDao dao = new ClienteDao();
		
		//c.setCnpj(12345678901L);
		Cliente cliente = dao.consulta(78425986003615L);
		System.out.println(cliente.getNomeCliente());
		System.out.println(cliente.getEndereco());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getResponsavel());*/
		

/*		FuncionarioDao dao = new FuncionarioDao();
		
		Funcionario funcionario = dao.consulta(3);
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCargo());
		System.out.println(funcionario.getTelefone());
		System.out.println(funcionario.getEmail());
		System.out.println(funcionario.getAdministrador());
		System.out.println(funcionario.getSenha());*/
		
		OrdemServicoDao dao = new OrdemServicoDao();
		
		OrdemServico ordemServico = dao.consulta(2);

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
		System.out.println(ordemServico.getNumero());
	}

}
