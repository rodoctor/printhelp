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
		<li>Menu</li>
<!-- 		<li><a href="cliente.jsp">Cadastro de Cliente</a></li>
		<li><a href="funcionario.jsp">Cadastro de Funcionário</a></li>
		<li><a href="impressora.jsp">Cadastro de Impressora</a></li>
		<li><a href="os.jsp">Administração de O.S.</a></li>
		<li><a href="relatorio.jsp">Relatório de O.S.</a></li>
		<li><a href="index.jsp">Sair</a></li> -->
	</ul>
</nav>

<div id="divFormulario">
	<!-- Inicio Formulário -->
<form id="formulario" action="Logar" method="POST">
	<h3>${mensagem}</h3>

	<label for="email1">
	<b>Email</b><br>
	<input type="email" id="email1" name="email" maxlength="50"/>
	</label><br>

	<label name="senha1">
		<b>Senha</b><br>
		<input type="password" id="senha1" name="senha" maxlength="20"/>
	</label><br>				
						
	<!-- CRIAR FUNÇÕES PARA OS BOTÕES ============================-->
	<br>
	<input type="submit" name="Entrar"onclick="" value="Entrar">
	<br>
</form>
</div> <!--Final div Formulário-->
</section> <!-- Final #Conteudo -->

		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>