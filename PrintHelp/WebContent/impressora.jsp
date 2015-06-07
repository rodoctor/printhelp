<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<title>Cadastro de Impressora</title>
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
				<form id="formulario" action="AdicionaImpressora?cmd=cadastrar" method="POST">
							
						<label name="impressorasCadastradas">
							Impressoras Cadastradas</label><br>
							<select>
								<option>Opção 1</option>
								<option>Opção 2</option>
							</select><br><br>

									<label for="serie">
									<b>Numero de Série</b></label><br>
									<input type="text" id="serie" name="serie"/>
									</label><br>

									<label name="marca">
										<b>Marca da Impressora</b><br>
										<input type="text" id="marca" name="marca"/>
									</label><br>

									<label name="modelo">
										<b>Modelo da Impressora</b><br>
										<input type="text" id="modelo" name="modelo"/>
									</label><br>

															
										
		<!-- CRIAR FUNÇÕES PARA OS BOTÕES ============================-->
									<br>
									
									<input type="submit" name="Cadastrar"onclick="" value="Cadastrar">
		
									<br>

									
									<input type="submit" name="Consultar" formaction="ConsultaImpressora" onclick="" value="Consultar">
									
									<br>

									<input type="submit" name="Alterar" formaction="AlteraImpressora" onclick="" value="Alterar">
									
									<br>

									<input type="submit" name="Excluir" formaction="RemoveImpressora" onclick="alert('Tem certeza que deseja excluir?')" value="Excluir">
									
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