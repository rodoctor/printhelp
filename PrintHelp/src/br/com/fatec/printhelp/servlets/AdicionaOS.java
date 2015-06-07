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
        
    HttpSession session = request.getSession(); //Objeto para sessão
    //Lista do tipo ordemServico, que armazena a requisição na sessão
    //List<OrdemServico>  lista = (ArrayList<OrdemServico>) session.getAttribute("minhaLista");   

    	//Pega os valores dos inputs e seta na instancia do obejto i 
        OrdemServico o = new OrdemServico();
        /*o.setNumero(request.getParameter(serie));
        o.setMarca(request.getParameter("marca"));
        o.setModelo(request.getParameter("modelo"));*/
        OrdemServicoDao dao= new OrdemServicoDao();
        dao.adiciona(o); //chamada do metodo adiciona da clase dao
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
