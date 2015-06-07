package br.com.fatec.printhelp.servlets;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
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
 * Servlet implementation class AdicionaImpressora
 */
@WebServlet("/AdicionaImpressora")
public class AdicionaImpressora extends HttpServlet {//Servlet que cadastra impressora no BD
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
            response.setContentType("text/html;charset=UTF-8");
        
    HttpSession session = request.getSession(); //Objeto para sessão
    //Lista do tipo impressora, que armazena a requisição na sessão
    //List<Impressora>  lista = (ArrayList<Impressora>) session.getAttribute("minhaLista");   

    	//Pega os valores dos inputs e seta na instancia do obejto i 
        Impressora i = new Impressora();
        i.setNumeroSerie(request.getParameter("serie"));
        i.setMarca(request.getParameter("marca"));
        i.setModelo(request.getParameter("modelo"));
        ImpressoraDao dao= new ImpressoraDao();
        dao.adiciona(i); //chamada do metodo adiciona da clase dao
       // lista.add(i); //adiciona os valores dos inputs na lista

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
	            Logger.getLogger(AdicionaImpressora.class.getName()).log(Level.SEVERE, null, ex);
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
	            Logger.getLogger(AdicionaImpressora.class.getName()).log(Level.SEVERE, null, ex);
	        }
	}
}
