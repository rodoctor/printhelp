<%@page import="br.com.fatec.printhelp.model.Funcionario"%>
<%@ page import="javax.management.modelmbean.RequiredModelMBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "br.com.fatec.printhelp.model.Impressora"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="javax.servlet.jsp.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<jsp:useBean id="impressora" class= "br.com.fatec.printhelp.model.Impressora"/>
<jsp:useBean id="dao" class="br.com.fatec.printhelp.dao.ImpressoraDao"/>
<jsp:useBean id="cliente" class= "br.com.fatec.printhelp.model.Cliente"/>
<jsp:useBean id="daoCliente" class="br.com.fatec.printhelp.dao.ClienteDao"/>
<jsp:useBean id="tecnico" class= "br.com.fatec.printhelp.model.Funcionario"/>
<jsp:useBean id="daoTecnico" class="br.com.fatec.printhelp.dao.FuncionarioDao"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<title>Abrir O.S.</title>
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
				<li><a href="cliente.jsp">Cadastro de Cliente</a></li>
				<li><a href="funcionario.jsp">Cadastro de Funcionário</a></li>
				<li><a href="impressora.jsp">Cadastro de Impressora</a></li>
				<li><a href="os.jsp">Administração de O.S.</a></li>
				<li><a href="relatorio.jsp">Relatório de O.S.</a></li>
				<li><a href="Logout">Sair</a></li>
				</ul>
			</nav>

			<div id="divFormulario">
			<div id="texto">
				<!-- Inicio Formulário -->
				<form id="formulario" action="AdicionaOS" method="POST">
							<h3 style="color: green">${mensagem}</h3>				
							<label name="cliente">
							<b>Cliente</b><br></label>
<!-- 							<input type="text" id="cliente" name="cliente" maxlength="20"/><br> -->
								<select id="cliente" name="cliente">
									<c:forEach var="cliente" items="${daoCliente.getlista()}">
										<option><c:out value="${cliente.cnpj}"/></option>
									</c:forEach>
								</select><br><br>
							
							<label name="impressora">
							<b>Impressora</b><br></label>
<!-- 							<input type="text" id="impressora" name="impressora" maxlength="20"/><br> -->
								<select id="impressora" name="impressora">
									<c:forEach var="impressora" items="${dao.getlista()}">
										<option><c:out value="${impressora.numeroSerie}"/></option>
									</c:forEach>
								</select><br><br>
						
							<label name="problema">
							<b>Problema</b><br></label>
							<input type="text" id="problema" name="problema" maxlength="20"/><br>

							<label name="descricao">
								<b>Descrição</b><br>
								<input type="text" id="descricao" name="descricao" maxlength="150"/>
							</label><br>
							
							<label name="tecnico">
								<b>Técnico</b><br>
								<select id="tecnico" name="tecnico">
									<c:forEach var="tecnico" items="${daoTecnico.getlista()}">
										<option><c:out value="${tecnico.cod_funcionario} ${tecnico.nome}"/></option>
									</c:forEach>
								</select><br><br>
<!-- 								<input type="text" id="tecnico" name="tecnico" maxlength="11"/> -->
							</label><br>
			</div>
				
							
								
		<!-- CRIAR FUNÇÕES PARA OS BOTÕES ============================-->
									<br>
																		
									<input type="submit" name="Cadastrar" onclick="" value="Cadastrar OS">
									
									<br>

		<!-- FINAL DE BOTÕES =====================================-->
				</form>
			</div> <!--Final div Formulário-->
		</section> <!-- Final #Conteudo -->

		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>