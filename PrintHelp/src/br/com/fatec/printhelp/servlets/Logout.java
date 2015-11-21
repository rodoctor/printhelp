package br.com.fatec.printhelp.servlets;

import java.io.IOException;  
import java.io.PrintWriter;  
  



import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession; 

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
            response.setContentType("text/html;charset=UTF-8");
            
            PrintWriter out=response.getWriter();
            
            HttpSession session=request.getSession();  
            session.invalidate();  
             
            request.getRequestDispatcher("index.jsp").include(request, response); 
            
//            out.print("<h1>");
//            out.print("Logout efetuado com sucesso!");  
//            out.print("</h1>");
            
            out.close(); 
            
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		        try {
		            processRequest(request, response);
		        } catch (ClassNotFoundException ex) {
		            Logger.getLogger(Logout.class.getName()).log(Level.SEVERE, null, ex);
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
		            Logger.getLogger(Logout.class.getName()).log(Level.SEVERE, null, ex);
		        }
		}
}
