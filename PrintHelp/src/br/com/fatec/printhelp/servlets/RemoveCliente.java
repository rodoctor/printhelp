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

import br.com.fatec.printhelp.dao.ClienteDao;
import br.com.fatec.printhelp.model.Cliente;

/**
 * Servlet implementation class RemoveCliente
 */
@WebServlet("/RemoveCliente")
public class RemoveCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
            response.setContentType("text/html;charset=UTF-8");
        
   // HttpSession session = request.getSession(); 
  //  List<Cliente>  lista = (ArrayList<Cliente>) session.getAttribute("minhaLista");   

        Cliente c = new Cliente();
        c.setCnpj(Long.parseLong(request.getParameter("cnpj")));
        ClienteDao dao= new ClienteDao();
        dao.remove(c);
        //lista.add(i);
               
        RequestDispatcher dispatcher = request.getRequestDispatcher("cliente.jsp");  
        dispatcher.forward(request, response);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
            Logger.getLogger(RemoveCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
