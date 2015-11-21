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
 * Servlet implementation class Logar
 */
@WebServlet("/Logar")
public class Logar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@SuppressWarnings("unused")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
            response.setContentType("text/html;charset=UTF-8");
        
            HttpSession session = request.getSession(); //Objeto para sessão
            
            Funcionario user = null;
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            
            try {
                FuncionarioDao dao = new FuncionarioDao(); //cria uma instancia do DAO usuario
                user = dao.logar(email, senha);

                //se nao encontrou usuario no banco, redireciona para a pagina de erro!
                if ( user == null){
                	session.invalidate();
                	request.setAttribute("mensagem", "Email ou Senha Inválidos!");
                    RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");  
                    dispatcher.forward(request, response);
                }else{
                	String admin = user.getAdministrador();
                	if ( admin.equals("sim")){
	                      //se o dao retornar um usuario, coloca o mesmo na sessao
	                      session.setAttribute("user", user);
	                      RequestDispatcher dispatcher = request.getRequestDispatcher("principalAdmin.jsp");  
	                      dispatcher.forward(request, response);
                	}else{  
	                    session.setAttribute("user", user);
	                    RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");  
	                    dispatcher.forward(request, response);  
                	}
                }
            }
            catch ( Exception e ){

            } 
    }
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		        try {
		            processRequest(request, response);
		        } catch (ClassNotFoundException ex) {
		            Logger.getLogger(Logar.class.getName()).log(Level.SEVERE, null, ex);
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
		            Logger.getLogger(Logar.class.getName()).log(Level.SEVERE, null, ex);
		        }
		}
}
