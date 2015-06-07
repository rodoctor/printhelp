package br.com.fatec.printhelp.servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;


import br.com.fatec.printhelp.dao.OrdemServicoDao;
import br.com.fatec.printhelp.model.OrdemServico;

/**
 * Servlet implementation class AdicionaOS
 */
@WebServlet("/AdicionaOS")
public class AdicionaOS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
            response.setContentType("text/html;charset=UTF-8");
        
    //HttpSession session = request.getSession(); //Objeto para sessão
    //Lista do tipo ordemServico, que armazena a requisição na sessão
    //List<OrdemServico>  lista = (ArrayList<OrdemServico>) session.getAttribute("minhaLista");   
    	OrdemServicoDao dao= new OrdemServicoDao();
    	String data, hora;
    	//int hora_aux;
    	//Pega os valores dos inputs e seta na instancia do obejto i 
        OrdemServico o = new OrdemServico();
        o.setProblema(request.getParameter("problema"));
        o.setDescricaoProblema(request.getParameter("descricao"));
        
        //insere data atual
        data = dao.pegaData();
        o.setDataAbertura(data);
        //============================================
        
        //insere hora atual
        //hora = "190000";
        //hora = String.valueOf(dao.pegaHora());//converte para string
        hora = dao.pegaHora();
        o.setHoraAbertura(Integer.parseInt(hora)); // converte e seta a hora
        //======================================================
        /*o.setDataFechamento("");
        o.setHoraFechamento(200000);
        o.setSolucao("teste");*/

        //insere tempoSla
        int tempo = 180;
        o.setTempoSla(tempo);
        //=====================================================
        o.setNumeroserie(request.getParameter("impressora"));
        
        //insere cnpj
        //String cnpj = request.getParameter("cliente");
        o.setCnpj(Long.parseLong(request.getParameter("cliente")));
        //=====================================================
        
        //insere funcionario
        //String codigo = (request.getParameter("tecnico"));
        o.setCod_funcionario(Integer.parseInt(request.getParameter("tecnico")));
        dao.adiciona(o); //chamada do metodo adiciona da classe dao
       // lista.add(o); //adiciona os valores dos inputs na lista

        RequestDispatcher dispatcher = request.getRequestDispatcher("ordemServico.jsp");  
        dispatcher.forward(request, response);
    }
    	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
	        try {
	            processRequest(request, response);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(AdicionaOS.class.getName()).log(Level.SEVERE, null, ex);
	        }
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	        try {
	            processRequest(request, response);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(AdicionaOS.class.getName()).log(Level.SEVERE, null, ex);
	        }
	}

}
