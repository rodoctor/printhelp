package br.com.fatec.printhelp.servlets;

import java.io.IOException;
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
 * Servlet implementation class RemoveImpressora
 */
@WebServlet("/RemoveImpressora")
public class RemoveImpressora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
            response.setContentType("text/html;charset=UTF-8");
        
    HttpSession session = request.getSession(); 
    List<Impressora>  lista = (ArrayList<Impressora>) session.getAttribute("minhaLista");   

        Impressora i = new Impressora();
        i.setNumeroSerie(request.getParameter("serie"));
        ImpressoraDao dao= new ImpressoraDao();
        dao.remove(i);
        lista.add(i);
               
        RequestDispatcher dispatcher = request.getRequestDispatcher("impressora.jsp");  
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
            Logger.getLogger(RemoveImpressora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
