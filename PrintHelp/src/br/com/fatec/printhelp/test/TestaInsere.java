package br.com.fatec.printhelp.test;

import br.com.fatec.printhelp.model.*;
import br.com.fatec.printhelp.dao.*;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

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
    	i.setNumeroSerie("729X001");
    	i.setMarca("Lexmark");
    	i.setModelo("E460");
    	dao.adiciona(i);*/
    	
    	OrdemServico o = new OrdemServico();
    	OrdemServicoDao dao = new OrdemServicoDao();
    	o.setNumero(1);
    	o.setProblema("Papel atolado");
    	o.setDescricaoProblema("Papel atolou na porta de saída");
    	
    	/*Calendar dta = Calendar.getInstance();
    	DateFormat fdta = DateFormat.getDateInstance();
    	dta.set(2015, Calendar.JUNE, 04);
    	
    	o.setDataAbertura(fdta.format(dta));*/
    	o.setDataAbertura("2015-06-04");
    	o.setHoraAbertura(1630);
    	
    	/*Calendar dtf = Calendar.getInstance();
    	DateFormat fdtf = DateFormat.getDateInstance();
    	dtf.set(2015, Calendar.JUNE, 04);
    	
    	o.setDataFechamento(fdtf.format(dtf));*/
    	o.setDataFechamento("2015-06-04");
    	o.setHoraFechamento(1700);
    	o.setSolucao("Retirado o papel");
    	o.setTempoSla(180);
    	o.setNumeroserie("7X20LB");
    	o.setCnpj(3478567733L);
    	o.setCod_funcionario(1);
    	dao.adiciona(o);
    }
}

