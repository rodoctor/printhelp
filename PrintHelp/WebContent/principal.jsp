<%@page import="br.com.fatec.printhelp.model.Funcionario"%>
<%@page import="javax.management.modelmbean.RequiredModelMBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="impressora" class= "br.com.fatec.printhelp.model.Impressora"/>
<jsp:useBean id="dao" class= "br.com.fatec.printhelp.dao.ImpressoraDao"/>

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
					<li><a href="osUser.jsp">Administração de O.S.</a></li>
					<li><a href="relatorioUser.jsp">Relatório de O.S.</a></li>
					<li><a href="Logout">Sair</a></li>
				</ul>
			</nav>

			<div id="divFormulario">
				<!-- Inicio Formulário -->
				<form id="formulario" action="ConsultaImpressora" method="POST">	
				    <h1>Olá <%=funcionario.getNome()%>, seja bem vindo.</h>
				</form>
			</div> <!--Final div Formulário-->
		</section> <!-- Final #Conteudo -->

		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>