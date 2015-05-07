function validar(cliNome) {
var txt_cliNome = formCliente.txt_cliNome.value;

//======================cliNome==================
if (txt_cliNome == "") {
alert('Campo NOME DO CLIENTE Obrigatório');
formCliente.txt_cliNome.focus();
return false;
}

if (txt_cliNome.length < 5) {
alert('Digite seu nome completo');
formCliente.txt_cliNome.focus();
return false;

if (txt_cliNome.length > 80) {
alert('Campo NOME DO CLIENTE deve ter no máximo 80 caracteres');
formCliente.txt_cliNome.focus();
return false;
}
//===============================================


//==================txt_cliNome==================
//===============================================


//===================txt_cliCNPJ=================
//===============================================


//==============txt_cliEndereco==================
//===============================================


//==============txt_cliTelefone==================
//===============================================


//==================txt_cliEmail=================
//===============================================


//==============txt_cliResponsavel===============
//===============================================
}

