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
		<li><a href="index.jsp">Sair</a></li>
	</ul>
</nav>

<div id="divFormulario">
	<form id="formulario" action="AdicionaCliente" method="POST">
			
		<label for="">
			Clientes Cadastrados</label><br>
			<select>
				<option>Opção 1</option>
				<option>Opção 2</option>
			</select><br><br>

			
					<label name="Nome">
					<b>Nome do Cliente</b></label><br>
					<input type="text" id="nome" name="nome"/>
					</label><br>

					<label name="cnpj">
						<b>CNPJ</b><br>
						<input type="text" id="cnpj" name="cnpj"/>
					</label><br>

					<label name="Endereco">
						<b>Endereço</b><br>
						<input type="text" id="endereco" name="endereco"/>
					</label><br>

					<label name="Telefone">
						<b>Telefone</b><br>
						<input type="text" id="telefone" name="telefone"/>
					</label><br>
					
					<label name="Email">
						<b>Email</b><br>
						<input type="text" id="email" name="email"/>
					</label><br>

					<label name="Responsavel">
						<b>Responsável</b><br>
						<input type="text" id="responsavel" name="responsavel"/><br>
					</label><br>
					
						
<!-- CRIAR FUNÇÕES PARA OS BOTÕES ============================-->
		<br>
		
		<input type="submit" name="Cadastrar" onclick="alert('Hello World!');" value="Cadastrar Cliente">

		<br>

		
		<input type="submit" name="Consultar" onclick="alert('Hello World!');" value="Consultar Cliente">
		
		<br>

		<input type="subimit" name="Alterar" onclick="alert('Hello World!');" value="Alterar Cliente">
		
		<br>

		<input type="submit" name="Excluir" onclick="alert('Hello World!');" value="Excluir Cliente!">
		
		<br>

		<!-- BOTAO TESTE SUBMIT -->
		<input type="button" value="Validar" onclick="fNome();fCnpj();fEndereco();fTelefone();fEmail();fResponsavel()">
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
