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
import javax.servlet.http.HttpSession;

import br.com.fatec.printhelp.dao.OrdemServicoDao;
import br.com.fatec.printhelp.model.OrdemServico;

/**
 * Servlet implementation class AlteraOrdemServico
 */
@WebServlet("/AlteraOrdemServico")
public class AlteraOrdemServico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
            response.setContentType("text/html;charset=UTF-8");
        
    HttpSession session = request.getSession(); //Objeto para sessão
    //Lista do tipo cliente, que armazena a requisição na sessão
    //List<Cliente>  lista = (ArrayList<Cliente>) session.getAttribute("minhaLista");
    
    OrdemServico o = new OrdemServico();
    o.setNumero(Integer.parseInt(request.getParameter("numero")));

    o.setProblema(request.getParameter("problema"));
    o.setDescricaoProblema(request.getParameter("descricao"));
    o.setSolucao(request.getParameter("solucao"));
    o.setTempoSla(Integer.parseInt(request.getParameter("sla")));
    o.setNumeroserie(request.getParameter("impressora"));
    o.setCnpj(Long.parseLong(request.getParameter("cliente")));
    o.setCod_funcionario(Integer.parseInt(request.getParameter("cod_funcionario")));
    OrdemServicoDao dao= new OrdemServicoDao();
    dao.altera(o); 
   // lista.add(o);

    
    //Pagina de resposta
    request.setAttribute("mensagem", "Alteração efetuada com sucesso!");
    RequestDispatcher dispatcher = request.getRequestDispatcher("os.jsp");  
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
	            Logger.getLogger(AlteraOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
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
	            Logger.getLogger(AlteraOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
	        }
	}
}
