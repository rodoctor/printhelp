<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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

	<div id="site">

		<!-- === CABE�ALHO === -->
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
		<li><a href="funcionario.jsp">Cadastro de Funcion�rio</a></li>
		<li><a href="impressora.jsp">Cadastro de Impressora</a></li>
		<li><a href="os.jsp">Administra��o de O.S.</a></li>
		<li><a href="relatorio.jsp">Relat�rio de O.S.</a></li>
		<li><a href="index.jsp">Sair</a></li>
	</ul>
</nav>

<div id="divFormulario">
	<form id="formulario" action="AdicionaCliente" method="POST">
			
		<label for="">
			Clientes Cadastrados</label><br>
			<select>
				<option>Op��o 1</option>
				<option>Op��o 2</option>
			</select><br><br>

					<label name="cnpj">
						<b>CNPJ</b><br>
						<input type="text" id="cnpj" name="cnpj" value="<%= request.getAttribute("cnpj") %>"/>
					</label><br>

					<label name="Nome">
					<b>Nome do Cliente</b></label><br>
					<input type="text" id="nome" name="nome" value="<%= request.getAttribute("nome") %>"/>
					</label><br>

					<label name="Endereco">
						<b>Endere�o</b><br>
						<input type="text" id="endereco" name="endereco" value="<%= request.getAttribute("endereco") %>"/>
					</label><br>

					<label name="Telefone">
						<b>Telefone</b><br>
						<input type="text" id="telefone" name="telefone" value="<%= request.getAttribute("telefone") %>"/>
					</label><br>
					
					<label name="Email">
						<b>Email</b><br>
						<input type="text" id="email" name="email" value="<%= request.getAttribute("email") %>"/>
					</label><br>

					<label name="Responsavel">
						<b>Respons�vel</b><br>
						<input type="text" id="responsavel" name="responsavel" value="<%= request.getAttribute("responsavel") %>"/><br>
					</label><br>
					
						
<!-- CRIAR FUN��ES PARA OS BOT�ES ============================-->
		<br>
		
		<input type="submit" name="Cadastrar" onclick="alert('Cadastro efetuado com sucesso!');" value="Cadastrar Cliente">

		<br>

		
		<input type="submit" formaction="ConsultaCliente" name="Consultar" onclick="" value="Consultar Cliente">
		
		<br>

		<input type="submit" formaction="AlteraCliente" name="Alterar" onclick="alert('Altera��o efetuada com sucesso!');" value="Alterar Cliente">
		
		<br>

		<input type="submit" formaction="RemoveCliente" name="Excluir" onclick="alert('Tem certeza que deseja excluir?');" value="Excluir Cliente!">
		
		<br>

		<!-- BOTAO TESTE SUBMIT -->
		<input type="button" value="Validar" onclick="fNome();fCnpj();fEndereco();fTelefone();fEmail();fResponsavel()">
		<!-- FINAL BTN TESTES -->

<!-- FINAL DE BOT�ES ====================================-->

	</form>
</div> <!--Final div Formul�rio-->
</section> <!-- Final #Conteudo -->

		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>
