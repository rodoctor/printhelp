<%@page import="br.com.fatec.printhelp.model.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
	<title>Administração de O.S.</title>
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
				<form id="formulario" action="ConsultaOrdemServico" method="POST">

							<input type="button" id="abrir" onclick="window.location='abrirOS.jsp'" value="Abrir Nova O.S."><br>
							<h3 style="color: green">${mensagem}</h3>
							<label for="os"><b>Nº da OS</b></label><br>
							<select id="os" name="os">
								<option>Opção 1</option>
								<option>Opção 2</option>
							</select><br>
							
							<label name="numero">
							<b>Nº da OS</b><br>
							<input type="text" id="numero" name="numero" value="<%= request.getAttribute("numero")  != null? request.getAttribute("numero"): ""%>"/>
							
							<label name="dataA">
							<b>Data da Abertura</b>
							<input type="text" id="dataA" name="dataA" value="<%= request.getAttribute("dataA")  != null? request.getAttribute("dataA"): ""%>" disabled/><br>							
							
							<label name="cliente">
							<b>Cliente</b><br>
							<input type="text" id="cliente" name="cliente" value="<%= request.getAttribute("cliente")  != null? request.getAttribute("cliente"): ""%>"/>
							
							<label name="horaA">
							<b>Hora da Abertura</b>
							<input type="text" id="horaA" name="horaA" value="<%= request.getAttribute("horaA")  != null? request.getAttribute("horaA"): "" %>" disabled/><br>

							<label name="impressora">
							<b>Impressora</b><br>
							<input type="text" id="impressora" name="impressora" value="<%= request.getAttribute("impressora")  != null? request.getAttribute("impressora"): ""%>"/>
							
							<label name="dataF">
							<b>Data do Fechamento</b>
							<input type="text" id="dataF" name="dataF" value="<%= request.getAttribute("dataF")  != null? request.getAttribute("dataF"): ""%>" disabled/><br>							
						
							<label name="problema">
							<b>Problema</b><br>
							<input type="text" id="problema" name="problema" value="<%= request.getAttribute("problema") != null? request.getAttribute("problema"): ""%>"/>
							
							<label name="horaF">
							<b>Hora do Fechamento</b>
							<input type="text" id="horaF" name="horaF" value="<%= request.getAttribute("horaF") != null? request.getAttribute("horaF"): "" %>" disabled/><br>

							<label name="descricao">
								<b>Descrição do Problema</b><br>
								<input type="text" id="descricao" name="descricao" value="<%= request.getAttribute("descricao") != null? request.getAttribute("descricao"): "" %>"/>
							</label>
							
							<label name="sla">
							<b>Tempo SLA (min)</b>
							<input type="text" id="sla" name="sla" value="<%= request.getAttribute("sla")  != null? request.getAttribute("sla"): ""%>"/><br>														
							
							<label name="solucao">
								<b>Solução do problema</b><br>
								<input type="text" id="solucao" name="solucao" value="<%= request.getAttribute("solucao") != null? request.getAttribute("solucao"): ""%>"/>
							</label>
							
							<label name="cod_funcionario">
							<b>Técnico Responsável</b>
							<input type="text" id="cod_funcionario" name="cod_funcionario" value="<%= request.getAttribute("cod_funcionario") != null? request.getAttribute("cod_funcionario"): "" %>"/><br>														

																
										
		<!-- CRIAR FUNÇÕES PARA OS BOTÕES ============================-->
									<br>
																		
									<input type="submit" name="Consultar" onclick="" value="Consultar">
									
									

									<input type="submit" formaction="AlteraOrdemServico" name="Alterar" onclick="" value="Alterar">
									
									

									<input type="submit" formaction="FechaOrdemServico" name="Fechar" onclick="" value="Fechar">
									
									<br>

									<!-- BOTAO TESTE SUBMIT -->
									<!-- <input type="button" value="Validar" id="validar" onclick="fDescricao;"> -->
									<!-- FINAL BTN TESTES -->

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