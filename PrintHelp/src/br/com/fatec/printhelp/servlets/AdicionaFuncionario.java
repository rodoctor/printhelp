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
import br.com.fatec.printhelp.dao.FuncionarioDao;
import br.com.fatec.printhelp.model.Cliente;
import br.com.fatec.printhelp.model.Funcionario;

/**
 * Servlet implementation class AdicionaFuncionario
 */
@WebServlet("/AdicionaFuncionario")
public class AdicionaFuncionario extends HttpServlet {
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
    	
    	Funcionario f = new Funcionario();
    	
        f.setCod_funcionario(Long.parseLong(request.getParameter("codigo")));
        f.setNome(request.getParameter("nome"));
        f.setCargo(request.getParameter("cargo"));
        f.setEmail(request.getParameter("email"));
        f.setSenha(request.getParameter("senha"));
        f.setAdministrador(request.getParameter("administrador"));
        f.setTelefone(request.getParameter("telefone"));

        FuncionarioDao dao= new FuncionarioDao();
        dao.adiciona(f); //chamada do metodo adiciona da classe dao
       // lista.add(o); //adiciona os valores dos inputs na lista

        RequestDispatcher dispatcher = request.getRequestDispatcher("funcionario.jsp");  
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
		            Logger.getLogger(AdicionaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
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
		            Logger.getLogger(AdicionaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
		        }
		}
}
