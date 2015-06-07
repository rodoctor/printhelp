<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
	<title>Administra��o de O.S.</title>
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

							<input type="button" id="abrir" onclick="window.location='abrirOS.jsp'" value="Abrir O.S."><br>
							
							<label for="os"><b>N� da OS</b></label><br>
							<select id="os" name="os">
								<option>Op��o 1</option>
								<option>Op��o 2</option>
							</select><br>
							
							<label name="cliente">
							<b>Cliente</b><br>
							<input type="text" id="cliente" name="cliente"/><br>

							<label name="impressora">
							<b>Impressora</b><br>
							<input type="text" id="impressora" name="impressora"/><br>
						
							<label name="problema">
							<b>Problema</b><br>
							<input type="text" id="problema" name="problema"/><br>

							<label name="descricao">
								<b>Descri��o do Problema</b><br>
								<input type="text" id="descricao" name="descricao"/>
							</label><br>
							
							<label name="solucao">
								<b>Solu��o do problema</b><br>
								<input type="text" id="solucao" name="solucao"/>
							</label><br>							

																
										
		<!-- CRIAR FUN��ES PARA OS BOT�ES ============================-->
									<br>
																		
									<input type="button" name="Consultar" onclick="alert('Hello World!');" value="Consultar">
									
									<br>

									<input type="button" name="Alterar" onclick="alert('Hello World!');" value="Alterar">
									
									<br>

									<input type="button" name="Fechar" onclick="alert('Hello World!');" value="Fechar">
									
									<br>

									<!-- BOTAO TESTE SUBMIT -->
									<input type="button" value="Validar" id="validar" onclick="fDescricao;">
									<!-- FINAL BTN TESTES -->

		<!-- FINAL DE BOT�ES =====================================-->
				</form>
			</div> <!--Final div Formul�rio-->
		</section> <!-- Final #Conteudo -->

		<footer id="rodape">
			<p>Equipe PrintHelp de Desenvolvimento  - 2015</p>
		</footer>

	</div>
</body>
</html>