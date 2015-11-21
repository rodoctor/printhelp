<%@page import="br.com.fatec.printhelp.model.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<title>Cadastro de Funcionários</title>
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
	<!-- Inicio Formulário -->
	<form id="formulario" action="AdicionaFuncionario" method="POST">														
						<label for="codigo">
						<b>Codigo do Funcionario</b></label><br>
						<input type="text" id="codigo" name="codigo" maxlength="11" value="<%= request.getAttribute("codigo") != null? request.getAttribute("codigo"): "" %>"/>
						</label><br>

						<label for="nome">
							<b>Nome do Funcionário</b><br>
							<input type="text" id="nome" name="nome" maxlength="50" value="<%= request.getAttribute("nome")  != null? request.getAttribute("nome"): ""%>"/>
						</label><br>
		
						<label for="cargo">
							<b>Cargo</b><br>
							<input type="text" id="cargo" name="cargo" maxlength="50" value="<%= request.getAttribute("cargo") != null? request.getAttribute("cargo"): ""%>"/>
						</label><br>
						
						<label for="email">
							<b>Email</b><br>
							<input type="email" id="email" name="email" maxlength="50" value="<%= request.getAttribute("email") != null? request.getAttribute("email"): ""%>"/>
						</label><br>

						<label for="senha">
							<b>Senha</b><br>
							<input type="password" id="senha" name="senha" maxlength="20" value="<%= request.getAttribute("senha") != null? request.getAttribute("senha"): ""%>"/>
						</label><br>
						
						<label for="administrador">
							<b>Administrador?</b><br>
							<input type="text" id="administrador" name="administrador" maxlength="3" value="<%= request.getAttribute("administrador")  != null? request.getAttribute("administrador"): ""%>"/>
						</label><br>

<!-- 						<label for="administrador"> -->
<!-- 							<b>Administrador</b><br> -->
<!-- 							<input type="radio" name="administrador" value="sim" checked>Sim  -->
<!-- 							<input type="radio" name="administrador" value="não">Não -->
<!-- 						</label><br> -->

						<label for="telefone">
							<b>Telefone</b><br>
							<input type="text" id="telefone" name="telefone" maxlength="11" value="<%= request.getAttribute("telefone") != null? request.getAttribute("telefone"): ""%>"/><br>
						</label><br>

														
<!-- CRIAR FUNÇÕES PARA OS BOTÕES ============================-->
						<br>
						
						<input type="submit" name="Cadastrar" onclick="alert('Cadastro efetuado com sucesso!');" value="Cadastrar">

						

						
						<input type="submit" formaction="ConsultaFuncionario" name="Consultar" onclick="" value="Consultar">
						
						

						<input type="submit" formaction="AlteraFuncionario" name="Alterar" onclick="alert('Alteração efetuada com sucesso!');" value="Alterar">
						
						

						<input type="submit" formaction="RemoveFuncionario" name="Excluir" onclick="alert('Tem certeza que deseja excluir?');" value="Excluir">
						
						<br>

						<!-- BOTAO TESTE SUBMIT -->
						<!-- <input type="button" value="Validar" id="validar" onclick="fCodigo();fNome();fEmail();fSenha();fTelefone()"> -->
						<!-- FINAL BTN TESTES -->

<!-- FINAL DE BOTÕES ======================================-->
	</form>
</div> <!--Final div Formulário-->
</section> <!-- Final #Conteudo -->

		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>
