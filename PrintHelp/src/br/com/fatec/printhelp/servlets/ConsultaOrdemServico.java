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

import br.com.fatec.printhelp.dao.OrdemServicoDao;
import br.com.fatec.printhelp.model.OrdemServico;

/**
 * Servlet implementation class ConsultaOrdemServico
 */
@WebServlet("/ConsultaOrdemServico")
public class ConsultaOrdemServico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
            response.setContentType("text/html;charset=UTF-8");
        
    //HttpSession session = request.getSession(); //Objeto para sessão
    //Lista do tipo ordemServico, que armazena a requisição na sessão
    //List<OrdemServico>  lista = (ArrayList<OrdemServico>) session.getAttribute("minhaLista");   

        OrdemServicoDao dao= new OrdemServicoDao();
        int numero = (Integer.parseInt(request.getParameter("numero")));//Pega o codigo da jsp. O codigo é a clausula where da consulta

        OrdemServico ordemServicos = dao.consulta(numero);//chamada do metodo que faz a consulta
        
        request.setAttribute("numero", ordemServicos.getNumero());
        request.setAttribute("cliente", ordemServicos.getCnpj());
        request.setAttribute("impressora", ordemServicos.getNumeroserie());
        request.setAttribute("problema", ordemServicos.getProblema());
        request.setAttribute("descricao", ordemServicos.getDescricaoProblema());
        request.setAttribute("solucao", ordemServicos.getSolucao());
        request.setAttribute("dataA", ordemServicos.getDataAbertura());
        request.setAttribute("horaA", ordemServicos.getHoraAbertura());
        request.setAttribute("dataF", ordemServicos.getDataFechamento());
        request.setAttribute("horaF", ordemServicos.getHoraFechamento());
        request.setAttribute("sla", ordemServicos.getTempoSla());
        request.setAttribute("cod_funcionario", ordemServicos.getCod_funcionario());

        //lista.add(i); //adiciona os valores dos inputs na lista
        
        //Pagina de resposta
        RequestDispatcher dispatcher = request.getRequestDispatcher("os.jsp");  
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
	            Logger.getLogger(ConsultaOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
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
	            Logger.getLogger(ConsultaOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
