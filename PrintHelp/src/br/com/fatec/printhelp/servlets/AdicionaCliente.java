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
import br.com.fatec.printhelp.dao.OrdemServicoDao;
import br.com.fatec.printhelp.model.Cliente;
import br.com.fatec.printhelp.model.OrdemServico;

/**
 * Servlet implementation class AdicionaCliente
 */
@WebServlet("/AdicionaCliente")
public class AdicionaCliente extends HttpServlet {
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
    	
    	Cliente c = new Cliente();
    	
        c.setCnpj(Long.parseLong(request.getParameter("cnpj")));
        c.setNomeCliente(request.getParameter("nome"));
        c.setEndereco(request.getParameter("endereco"));
        c.setTelefone(request.getParameter("telefone"));
        c.setEmail(request.getParameter("email"));
        c.setResponsavel(request.getParameter("responsavel"));

        ClienteDao dao= new ClienteDao();
        dao.adiciona(c);//chamada do metodo adiciona da classe dao
        
        String msg = "Cliente cadastrado com sucesso!";
        request.getParameter("msg");
        
       // lista.add(o); //adiciona os valores dos inputs na lista

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
		            Logger.getLogger(AdicionaCliente.class.getName()).log(Level.SEVERE, null, ex);
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
		            Logger.getLogger(AdicionaCliente.class.getName()).log(Level.SEVERE, null, ex);
		        }
		}

}
