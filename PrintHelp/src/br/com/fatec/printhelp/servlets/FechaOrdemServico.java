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
 * Servlet implementation class FechaOrdemServico
 */
@WebServlet("/FechaOrdemServico")
public class FechaOrdemServico extends HttpServlet {
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
	OrdemServicoDao dao= new OrdemServicoDao();
	
    o.setNumero(Integer.parseInt(request.getParameter("numero")));
    String data, hora;
    
    data = dao.pegaData();
    o.setDataFechamento(data);
    //============================================
    hora = dao.pegaHora();
    o.setHoraFechamento(Integer.parseInt(hora)); // converte e seta a hora
    //======================================================
    o.setSolucao(request.getParameter("solucao"));
    dao.fecha(o); 
   // lista.add(o);

    
    //Pagina de resposta
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
	            Logger.getLogger(FechaOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
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
	            Logger.getLogger(FechaOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
	        }
	}
}
