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

import br.com.fatec.printhelp.dao.ClienteDao;
import br.com.fatec.printhelp.model.Cliente;

/**
 * Servlet implementation class ConsultaCliente
 */
@WebServlet("/ConsultaCliente")
public class ConsultaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
            response.setContentType("text/html;charset=UTF-8");
        
    HttpSession session = request.getSession(); //Objeto para sessão
    //Lista do tipo cliente, que armazena a requisição na sessão
    //List<Cliente>  lista = (ArrayList<Cliente>) session.getAttribute("minhaLista");   

        Cliente c = new Cliente();
        ClienteDao dao= new ClienteDao();
        Long numero = (Long.parseLong(request.getParameter("cnpj")));//Pega o cnpj da jsp. O cnpj é a clausula where da consulta

        Cliente clientes = dao.consulta(numero);//chamada do metodo que faz a consulta
        
        request.setAttribute("cnpj", clientes.getCnpj());
        request.setAttribute("nome", clientes.getNomeCliente());
        request.setAttribute("endereco", clientes.getEndereco());
        request.setAttribute("telefone", clientes.getTelefone());
        request.setAttribute("email", clientes.getEmail());
        request.setAttribute("responsavel", clientes.getResponsavel());

        //lista.add(i); //adiciona os valores dos inputs na lista
        
        //Pagina de resposta
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
	            Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
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
	            Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
