package br.com.fatec.printhelp.test;

import br.com.fatec.printhelp.model.*;
import br.com.fatec.printhelp.dao.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.sql.Date;

/**
 *
 * @author kenedy
 */
public class TestaInsere {
    public static void main(String[] args) throws ClassNotFoundException {

/*        Cliente c= new Cliente();
        ClienteDao dao = new ClienteDao();
        c.setCnpj(34278668923L);
        c.setNomeCliente("teste");
        c.setEndereco("Av. Paulista");
        c.setTelefone("59215566");
        c.setEmail("teste@teste.com");
        c.setResponsavel("Resp");
        dao.adiciona(c);*/
    	
    	/*Funcionario f= new  Funcionario();
    	FuncionarioDao dao = new FuncionarioDao();
    	f.setCod_funcionario(1);
    	f.setNome("testeF");
    	f.setCargo("Analista de HelpDesk");
    	f.setTelefone("964361723");
    	f.setEmail("analista@teste.com");
    	f.setAdministrador("sim");
    	f.setSenha("admin");
    	dao.adiciona(f);*/
    	
    	/*Impressora i = new Impressora();
    	ImpressoraDao dao = new ImpressoraDao();
    	i.setNumeroSerie("729X002");
    	i.setMarca("Lexmark");
    	i.setModelo("E460");
    	dao.adiciona(i);*/
    	
    	OrdemServico o = new OrdemServico();
    	OrdemServicoDao dao = new OrdemServicoDao();
    	//o.setNumero(2);
    	o.setProblema("Papel atolado");
    	o.setDescricaoProblema("Papel atolou na porta de saída");
    	
    	//Pega data atual e formata para o BD
    	Calendar d = Calendar.getInstance();
    	Date data = d.getTime();
    	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    	String dta = f.format(data);
    	o.setDataAbertura(dta);
    	//======================================================
    	
    	//Pega hora atual e formata para o BD
    	SimpleDateFormat h = new SimpleDateFormat("HHmmss");
    	String hora_ab = h.format(data);
    	int hora_abertura = Integer.parseInt(hora_ab);
    	o.setHoraAbertura(hora_abertura);
    	//==================================================
    	//o.setDataFechamento(dta);
    	//o.setHoraFechamento(hora_abertura);
    	o.setSolucao("Retirado o papel");
    	o.setTempoSla(180);
    	o.setNumeroserie("7X20L1");
    	o.setCnpj(3478567733L);
    	o.setCod_funcionario(1);
    	dao.adiciona(o);
    }
}

