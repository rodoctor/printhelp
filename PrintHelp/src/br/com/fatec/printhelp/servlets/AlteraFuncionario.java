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

import br.com.fatec.printhelp.dao.FuncionarioDao;
import br.com.fatec.printhelp.model.Funcionario;

/**
 * Servlet implementation class AlteraFuncionario
 */
@WebServlet("/AlteraFuncionario")
public class AlteraFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
            response.setContentType("text/html;charset=UTF-8");
        
    HttpSession session = request.getSession(); //Objeto para sessão
    //Lista do tipo funcionario, que armazena a requisição na sessão
    //List<Funcionario>  lista = (ArrayList<Funcionario>) session.getAttribute("minhaLista");   
    	
        Funcionario f = new Funcionario();
        
        f.setCod_funcionario(Integer.parseInt(request.getParameter("codigo")));
        f.setNome(request.getParameter("nome"));
        f.setCargo(request.getParameter("cargo"));
        f.setTelefone(request.getParameter("telefone"));
        f.setEmail(request.getParameter("email"));
        f.setSenha(request.getParameter("senha"));
        f.setAdministrador(request.getParameter("administrador"));
        
        FuncionarioDao dao= new FuncionarioDao();
        dao.altera(f); //chamada do metodo adiciona da clase dao
       // lista.add(i); //adiciona os valores dos inputs na lista

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
	            Logger.getLogger(AlteraFuncionario.class.getName()).log(Level.SEVERE, null, ex);
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
	            Logger.getLogger(AlteraFuncionario.class.getName()).log(Level.SEVERE, null, ex);
	        }
	}
}
