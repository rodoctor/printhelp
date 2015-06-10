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

import br.com.fatec.printhelp.dao.FuncionarioDao;
import br.com.fatec.printhelp.model.Funcionario;

/**
 * Servlet implementation class RemoveFuncionario
 */
@WebServlet("/RemoveFuncionario")
public class RemoveFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
            response.setContentType("text/html;charset=UTF-8");
        
   // HttpSession session = request.getSession(); 
  //  List<Funcionario>  lista = (ArrayList<Funcionario>) session.getAttribute("minhaLista");   

        Funcionario f = new Funcionario();
        f.setCod_funcionario(Integer.parseInt(request.getParameter("codigo")));
        FuncionarioDao dao= new FuncionarioDao();
        dao.remove(f);
        //lista.add(i);
               
        RequestDispatcher dispatcher = request.getRequestDispatcher("funcionario.jsp");  
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
            Logger.getLogger(RemoveFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
