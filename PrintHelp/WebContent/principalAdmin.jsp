<%@page import="br.com.fatec.printhelp.model.Funcionario"%>
<%@page import="javax.management.modelmbean.RequiredModelMBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<title>Pagina Principal</title>
	<meta charset="utf-8" />
	<link rel="stylesheet" type="text/css" href="css/estilo.css" />
	<link rel="stylesheet" type="text/css" href="css/botoes.css" />
	<script type="text/javascript" src="js/valida.js"></script>
</head>

<body>
<%  
    Funcionario funcionario = new Funcionario();   
	funcionario = (Funcionario)session.getAttribute("user");  
 %>
 <c:if test="${user eq null }">
<%--  	<jsp:forward page="index.jsp" /> --%>
 </c:if>
	<div id="site">

		<!-- === CABEÇALHO === -->
		<header>
			<div id="topo">
					<figure id="logo">
						<img src="img/logo_branco.png" alt="Logotipo PrintHelp">
					</figure>
			</div>
		</header>

		<section id="conteudo">
			
			<!-- Menu Lateral -->
			<nav id="menu">
				<ul>
				<li><a href="cliente.jsp">Cadastro de Cliente</a></li>
				<li><a href="funcionario.jsp">Cadastro de Funcionário</a></li>
				<li><a href="impressora.jsp">Cadastro de Impressora</a></li>
				<li><a href="os.jsp">Administração de O.S.</a></li>
				<li><a href="relatorio.jsp">Relatório de O.S.</a></li>
				<li><a href="Logout">Sair</a></li>
				</ul>
			</nav>

			<div id="divFormulario">
				<!-- Inicio Formulário -->
				<form id="formulario" action=" " method="POST">
				    <h1>Olá <%=funcionario.getNome()%>, seja bem vindo.</h1>
				</form>
				
			</div> <!--Final div Formulário-->
		</section> <!-- Final #Conteudo -->
		
		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>