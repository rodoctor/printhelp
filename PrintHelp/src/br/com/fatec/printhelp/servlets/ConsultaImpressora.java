package br.com.fatec.printhelp.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fatec.printhelp.dao.ImpressoraDao;
import br.com.fatec.printhelp.model.Impressora;

/**
 * Servlet implementation class ConsultaImpressora
 */
@WebServlet("/ConsultaImpressora")
public class ConsultaImpressora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws SQLException 
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
            response.setContentType("text/html;charset=UTF-8");
        
    HttpSession session = request.getSession(); //Objeto para sessão
    //Lista do tipo impressora, que armazena a requisição na sessão
    //List<Impressora>  lista = (ArrayList<Impressora>) session.getAttribute("minhaLista");   

    	//Pega os valores dos inputs e seta na instancia do obejto i 
        Impressora i = new Impressora();
        ImpressoraDao dao= new ImpressoraDao();
        String numero = (request.getParameter("serie"));//Pega o numero da jsp. O numero é a clausula where da consulta

        Impressora impressoras = dao.consulta(numero);//chamada do metodo que faz a consulta
                
        request.setAttribute("serie", impressoras.getNumeroSerie());
        request.setAttribute("marca", impressoras.getMarca());
        request.setAttribute("modelo", impressoras.getModelo());
        /*impressora.getMarca();
        impressora.getModelo();
        }*/
        //lista.add(i); //adiciona os valores dos inputs na lista
        RequestDispatcher dispatcher = request.getRequestDispatcher("impressora.jsp");  
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
	            Logger.getLogger(ConsultaImpressora.class.getName()).log(Level.SEVERE, null, ex);
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
	            Logger.getLogger(ConsultaImpressora.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
