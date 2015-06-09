<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<title>Login</title>
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
	<!-- Inicio Formulário -->
<form id="formulario" action="Logar" method="POST">

		<label for="email">
		<b>Email</b></label><br>
		<input type="text" id="email" name="email"/>
		</label><br>

		<label name="senha">
			<b>Senha</b><br>
			<input type="password" id="senha" name="senha"/>
		</label><br>				
						
<!-- CRIAR FUNÇÕES PARA OS BOTÕES ============================-->
<br>
<input type="submit" name="Entrar"onclick="" value="Entrar">
<br>
<input type="submit" name="resgatar" formaction="" onclick="" value="Esqueci a senha">
<br>
<!-- BOTAO TESTE SUBMIT -->
<input type="button" value="Validar" id="validar" onclick="fSerie();fMarca();fModelo();">
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