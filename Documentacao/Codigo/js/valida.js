function validar() {
var formulario = document.getElementById("formulario");
var nome = formulario.nome.value;
var cnpj = +formulario.cnpj.value;
var endereco = formulario.endereco.value;
var telefone = +formulario.telefone.value;

//======================NOME==================
if (nome == "") {
alert('Campo NOME DO CLIENTE Obrigatório');
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

//===============================================


//===================CNPJ=================
if (cnpj == "") {
alert('Campo CNPJ Obrigatório');
formulario.cnpj.focus();
return false;
}

if (typeof cnpj != 'number') {
alert('Você não digitou um número');
formulario.cnpj.focus();
return false;
}

if (cnpj.length == 11) {
alert('O campo CNPJ deve conter 11 caracteres');
formulario.cnpj.focus();
return false;
}
//===============================================


//==============ENDERECO==================
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
//===============================================


//==============TELEFONE==================
if (telefone == "") {
alert('Campo TELEFONE Obrigatório');
formulario.telefone.focus();
return false;
}

if (typeof telefone != 'number') {
alert('Você não digitou um número de telefone');
formulario.telefone.focus();
return false;
}

if (telefone.length <= 11) {
alert('O campo TELEFONE deve conter no máximo 11 caracteres');
formulario.telefone.focus();
return false;
}
//===============================================


//==================EMAIL=================
//===============================================


//==============RESPONSAVEL===============
//===============================================

}

