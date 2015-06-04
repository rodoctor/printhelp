<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<title>Cadastro de Funcion�rios</title>
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
					<li><a href="cliente.html">Cadastro de Cliente</a></li>
					<li><a href="funcionario.html">Cadastro de Funcion�rio</a></li>
					<li><a href="impressora.html">Cadastro de Impressora</a></li>
					<li><a href="os.html">Administra��o de O.S.</a></li>
					<li><a href="relatorio.html">Relat�rio de O.S.</a></li>
					<li><a href="index.html">Sair</a></li>
				</ul>
			</nav>

			<div id="divFormulario">
				<!-- Inicio Formul�rio -->
				<form id="formulario">														
									<label for="codigo">
									<b>Codigo do Funcionario</b></label><br>
									<input type="text" id="codigo" name="codigo"/>
									</label><br>

									<label for="nome">
										<b>Nome do Funcion�rio</b><br>
										<input type="text" id="nome" name="nome"/>
									</label><br>

									<label for="cargo">
										<b>Cargo do Funcion�rio</b><br>
										<select id="cargo" name="cargo">
										<option>Op��o 1</option>
										<option>Op��o 2</option>
										</select>
									</label><br>
					
									<label for="email">
										<b>Email</b><br>
										<input type="text" id="email" name="email"/>
									</label><br>

									<label for="senha">
										<b>Senha</b><br>
										<input type="password" id="senha" name="senha"/>
									</label><br>

									<label for="administrador">
										<b>Administrador</b><br>
										<input type="radio" name="administrador" value="sim" checked>Sim <input type="radio" name="administrador" value="nao">N�o
									</label><br>

									<label for="telefone">
										<b>Telefone</b><br>
										<input type="text" id="telefone" name="telefone"/><br>
									</label><br>

																	
		<!-- CRIAR FUN��ES PARA OS BOT�ES ============================-->
									<br>
									
									<input type="button" name="Cadastrar"onclick="alert('Hello World!');" value="Cadastrar">
		
									<br>

									
									<input type="button" name="Consultar" onclick="alert('Hello World!');" value="Consultar">
									
									<br>

									<input type="button" name="Alterar" onclick="alert('Hello World!');" value="Alterar">
									
									<br>

									<input type="button" name="Excluir" onclick="alert('Hello World!');" value="Excluir">
									
									<br>

									<!-- BOTAO TESTE SUBMIT -->
									<input type="button" value="Validar" id="validar" onclick="fCodigo();fNome();fEmail();fSenha();fTelefone()">
									<!-- FINAL BTN TESTES -->

		<!-- FINAL DE BOT�ES ======================================-->
				</form>
			</div> <!--Final div Formul�rio-->
		</section> <!-- Final #Conteudo -->

		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>
