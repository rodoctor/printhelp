<%@page import="br.com.fatec.printhelp.model.Funcionario"%>
<%@ page import="javax.management.modelmbean.RequiredModelMBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "br.com.fatec.printhelp.model.Cliente"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="javax.servlet.jsp.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<jsp:useBean id="cliente" class= "br.com.fatec.printhelp.model.Cliente"/>
<jsp:useBean id="dao" class="br.com.fatec.printhelp.dao.ClienteDao"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<title>Cadastro de Clientes</title>
	<!--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  -->
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
	<form id="formulario" action="AdicionaCliente" method="POST">
			
		<label for="">Lista de Clientes Cadastrados</label><br>
						<select id="lista_cliente" name="lista_cliente">
							<c:forEach var="cliente" items="${dao.getlista()}">
								<option><c:out value="${cliente.cnpj}"/></option>
							</c:forEach>
						</select><br><br>
<%-- 			 		<label value="<%= request.getAttribute("msg") != null? request.getAttribute("msg"): "" %>"></label> --%>
					<label name="cnpj">
						<b>CNPJ</b><br>
						<input type="text" id="cnpj" name="cnpj" maxlength="20" value="<%= request.getAttribute("cnpj") != null? request.getAttribute("cnpj"): "" %>"/>
					</label><br>

					<label name="Nome">
					<b>Nome do Cliente</b></label><br>
					<input type="text" id="nome" name="nome" maxlength="80" value="<%= request.getAttribute("nome")  != null? request.getAttribute("nome"): ""%>"/>
					</label><br>

					<label name="Endereco">
						<b>Endereço</b><br>
						<input type="text" id="endereco" name="endereco" maxlength="80" value="<%= request.getAttribute("endereco")  != null? request.getAttribute("endereco"): ""%>"/>
					</label><br>

					<label name="Telefone">
						<b>Telefone</b><br>
						<input type="text" id="telefone" name="telefone" maxlength="11" value="<%= request.getAttribute("telefone") != null? request.getAttribute("telefone"): ""%>"/><br>
					</label><br>
					
					<label name="Email">
						<b>Email</b><br>
						<input type="email" id="email" name="email" maxlength="50" value="<%= request.getAttribute("email") != null? request.getAttribute("email"): ""%>"/>
					</label><br>

					<label name="Responsavel">
						<b>Responsável</b><br>
						<input type="text" id="responsavel" name="responsavel" maxlength="50" value="<%= request.getAttribute("responsavel")  != null? request.getAttribute("responsavel"): ""%>"/><br>
					</label><br>
					
						
<!-- CRIAR FUNÇÕES PARA OS BOTÕES ============================-->
		<br>
		
		<input type="submit" name="Cadastrar" onclick="alert('Cliente cadastrado com sucesso!');" value="Cadastrar Cliente">

		

		
		<input type="submit" formaction="ConsultaCliente" name="Consultar" onclick="" value="Consultar Cliente">
		
		

		<input type="submit" formaction="AlteraCliente" name="Alterar" onclick="alert('Alteração efetuada com sucesso!');" value="Alterar Cliente">
		
	

		<input type="submit" formaction="RemoveCliente" name="Excluir" onclick="alert('Tem certeza que deseja excluir?');" value="Excluir Cliente!">
		
		<br>

		<!-- BOTAO TESTE SUBMIT -->
		<!-- <input type="button" value="Validar" onclick="fNome();fCnpj();fEndereco();fTelefone();fEmail();fResponsavel()"> -->
		<!-- FINAL BTN TESTES -->

<!-- FINAL DE BOTÕES ====================================-->

	</form>
</div> <!--Final div Formulário-->
</section> <!-- Final #Conteudo -->

		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>
