/**
 * 
 */
//==============NOME==================================
function fNome() {
	var formulario = window.document.getElementById("formulario");
	var nome = formulario.nome.value;

	if (nome == "") {
	alert('Campo NOME Obrigatório');
	formulario.nome.focus();
	return false;
	}

	if (nome.length < 5) {
	alert('Digite seu nome completo');
	formulario.nome.focus();
	return false;
	}

	if (nome.length > 80) {
	alert('Campo NOME DO CLIENTE deve ter no máximo 80 caracteres');
	formulario.nome.focus();
	return false;
	}
}
//====================================================


//==============CNPJ==================================
function fCnpj() {
	var formulario = window.document.getElementById("formulario");
	var cnpj = +formulario.cnpj.value;

	if (cnpj == "") {
	alert('Campo CNPJ Obrigatório');
	formulario.cnpj.focus();
	return false;
	}

	if (isNaN(cnpj)) {
	alert('Você não digitou um número');
	formulario.cnpj.focus();
	return false;
	}

	if (cnpj.toString().length != 11) {
	alert('O campo CNPJ deve conter 11 caracteres');
	formulario.cnpj.focus();
	return false;
	}
}
//====================================================


//==============ENDEREÇO==============================
function fEndereco() {
	var formulario = window.document.getElementById("formulario");
	var endereco = formulario.endereco.value;

	if (endereco == "") {
	alert('Campo ENDEREÇO Obrigatório');
	formulario.endereco.focus();
	return false;
	}

	if (endereco.length < 5) {
	alert('Digite o endereço completo');
	formulario.endereco.focus();
	return false;
	}

	if (endereco.length > 80) {
	alert('Campo ENDEREÇO deve ter no máximo 80 caracteres');
	formulario.endereco.focus();
	return false;
	}
}
//====================================================


//==============TELEFONE==============================
function fTelefone() {
	var formulario = window.document.getElementById("formulario");
	var telefone = +formulario.telefone.value;

	if (telefone == "") {
	alert('Campo TELEFONE Obrigatório');
	formulario.telefone.focus();
	return false;
	}

	if (isNaN(telefone)) {
	alert('Você não digitou um número de telefone');
	formulario.telefone.focus();
	return false;
	}

	if (telefone.length <= 11) {
	alert('O campo TELEFONE deve conter no máximo 11 caracteres');
	formulario.telefone.focus();
	return false;
	}
}
//====================================================


//==============EMAIL=================================
function fEmail() {
	var formulario = window.document.getElementById("formulario");
	var filtro = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
	var email = formulario.email.value;

	if (email == "") {
	alert('Campo EMAIL Obrigatório');
	formulario.email.focus();
	return false;
	}

	if (!filtro.test(document.getElementById("email").value)) {
	alert('Por favor, digite o email corretamente');
	document.getElementById("email").focus();
	return false
	}
}
//====================================================


//==============RESPONSAVEL===========================
function fResponsavel() {
	var formulario = window.document.getElementById("formulario");
	var responsavel = formulario.responsavel.value;
	
	if (responsavel == "") {
	alert('Campo RESPONSAVEL Obrigatório');
	formulario.responsavel.focus();
	return false;
	}
}
//====================================================


//================DESCRIÇÃO===========================
function fDescricao() {
	var formulario = window.document.getElementById("formulario");
	var descricao = formulario.descricao.value;

	if (descricao == "") {
		alert('Campo DESCRIÇÃO obrigatório');
		formulario.descricao.focus();
		return false;
	}

	if (descricao.length < 20 ) {
		alert('Descrição menor que 20 caracteres. Por favor digite a descrição completa');
		formulario.descricao.focus();
		return false;
	}

}
//====================================================


//================CODIGO==============================
function fCodigo() {
	var formulario = window.document.getElementById("formulario");
	var codigo = +formulario.codigo.value;

	if (codigo == "") {
		alert('Campo CODIGO obrigatório');
		formulario.codigo.focus();
		return false;
	}

	if (isNaN(codigo)) {
		alert('Digite somente números no campo CODIGO');
		formulario.codigo.focus();
		return false;
	}
}

//===================================================


//=================SENHA=============================
function fSenha() {
	var formulario = window.document.getElementById("formulario");
	var filtro = /[\w][\d]/;
	var senha = formulario.senha.value;

	if (senha == "") {
	alert('Campo SENHA Obrigatório');
	formulario.senha.focus();
	return false;
	}

	if (!filtro.test(senha)) {
	alert('A senha deve conter carateres alfanumericos, com no minimo 8 caracteres');
	senha.focus();
	return false
	}

	if (senha.length < 8) {
	alert('A senha deve conter carateres alfanumericos, com no minimo 8 caracteres');
	formulario.senha.focus();
	return false;
	}
}
//===================================================



//================NUMERODESERIE====================
function fSerie() {
	var formulario = window.document.getElementById("formulario");
	var serie = formulario.serie.value;

	if (serie == "") {
	alert('Campo NUMERO DE SERIE Obrigatório');
	formulario.serie.focus();
	return false;
	}
}

//===================================================


//================MARCADAIMPRESSORA================
function fMarca() {
	var formulario = window.document.getElementById("formulario");
	var marca = formulario.marca.value;

	if (marca == "") {
	alert('Campo MARCA DA IMPRESSORA Obrigatório');
	formulario.marca.focus();
	return false;
	}
}
//===================================================


//================MODELODAIMPRESSORA===============
function fModelo() {
	var formulario = window.document.getElementById("formulario");
	var modelo = formulario.modelo.value;

	if (modelo == "") {
	alert('Campo MODELO DA IMPRESSORA Obrigatório');
	formulario.modelo.focus();
	return false;
	}
}
//===================================================


//=================NUMERODEOS======================
function fRelOs() {
	var formulario = window.document.getElementById("formulario");
	var os = formulario.os.value;
alert(os);
	if (os == "") {
	alert('Campo NUMERO DE OS Obrigatório');
	formulario.os.focus();
	return false;
	}
}
//===================================================


