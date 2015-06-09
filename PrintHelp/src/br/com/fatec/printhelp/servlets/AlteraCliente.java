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

import br.com.fatec.printhelp.dao.ClienteDao;
import br.com.fatec.printhelp.model.Cliente;

/**
 * Servlet implementation class AlteraCliente
 */
@WebServlet("/AlteraCliente")
public class AlteraCliente extends HttpServlet {
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
    	
    	//Pega os valores dos inputs e seta na instancia do obejto i 
        Cliente c = new Cliente();
        
        c.setCnpj(Long.parseLong(request.getParameter("cnpj")));
        c.setNomeCliente(request.getParameter("nome"));
        c.setEndereco(request.getParameter("endereco"));
        c.setTelefone(request.getParameter("telefone"));
        c.setEmail(request.getParameter("email"));
        c.setResponsavel(request.getParameter("responsavel"));
        
        ClienteDao dao= new ClienteDao();
        dao.altera(c); //chamada do metodo adiciona da clase dao
       // lista.add(i); //adiciona os valores dos inputs na lista

        RequestDispatcher dispatcher = request.getRequestDispatcher("cliente.jsp");  
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
	            Logger.getLogger(AlteraCliente.class.getName()).log(Level.SEVERE, null, ex);
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
	            Logger.getLogger(AlteraCliente.class.getName()).log(Level.SEVERE, null, ex);
	        }
	}

}
