<%@page import="br.com.fatec.printhelp.model.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<title>Cadastro de Clientes</title>
	<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
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
		<form id="formulario">
				
			<label for="os">
					<b>Numero de OS</b></label><br>
					<input type="text" id="os" name="os" maxlength="11"/>
			</label><br>
					
							
								
<!-- CRIAR FUNÇÕES PARA OS BOTÕES ============================-->
							<!-- BOTAO TESTE SUBMIT -->
							<input type="button" value="Emitir Relatório" id="validar" onclick="fOs()">
							<!-- FINAL BTN TESTES -->

<!-- FINAL DE BOTÕES =======================================-->

		</form>
	</div> <!--Final div Formulário-->
</section> <!-- Final #Conteudo -->

		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>