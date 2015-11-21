package br.com.fatec.printhelp.servlets;

import java.io.IOException;
import java.sql.SQLException;
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
 * Servlet implementation class ConsultaFuncionario
 */
@WebServlet("/ConsultaFuncionario")
public class ConsultaFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
            response.setContentType("text/html;charset=UTF-8");
        
    HttpSession session = request.getSession(); //Objeto para sessão
    //Lista do tipo funcionario, que armazena a requisição na sessão
    //List<Funcionario>  lista = (ArrayList<Funcionario>) session.getAttribute("minhaLista");   

        Funcionario c = new Funcionario();
        FuncionarioDao dao= new FuncionarioDao();
        int numero = (Integer.parseInt(request.getParameter("codigo")));//Pega o codigo da jsp. O codigo é a clausula where da consulta

        Funcionario funcionarios = dao.consulta(numero);//chamada do metodo que faz a consulta
        
        request.setAttribute("codigo", funcionarios.getCod_funcionario());
        request.setAttribute("nome", funcionarios.getNome());
        request.setAttribute("cargo", funcionarios.getCargo());
        request.setAttribute("telefone", funcionarios.getTelefone());
        request.setAttribute("email", funcionarios.getEmail());
        request.setAttribute("administrador", funcionarios.getAdministrador());        
        request.setAttribute("senha", funcionarios.getSenha());

        //lista.add(i); //adiciona os valores dos inputs na lista
        
        //Pagina de resposta
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
	            Logger.getLogger(ConsultaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
	            Logger.getLogger(ConsultaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
