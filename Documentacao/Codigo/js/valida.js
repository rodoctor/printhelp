function validar(txt_cliNome) {
var txt_cliNome = formCliente.txt_cliNome.value;
var txt_cliCnpj = formCliente.txt_cliCnpj.value;

//======================cliNome==================
if (txt_cliNome == "") {
alert('Campo NOME DO CLIENTE Obrigatório');
// formCliente.txt_cliNome.focus();
documento.formCliente.txt_cliNome.style.background = 'red';
return false;
}

if (txt_cliNome.length < 5) {
alert('Digite seu nome completo');
formCliente.txt_cliNome.focus();
return false;
}

if (txt_cliNome.length > 80) {
alert('Campo NOME DO CLIENTE deve ter no máximo 80 caracteres');
// formCliente.txt_cliNome.focus();
return false;
}

//===============================================


//===================txt_cliCNPJ=================
// if (txt_cliCnpj == "") {
// alert('Campo CNPJ Obrigatório');
// formCliente.txt_cliCNPJ.focus();
// return false;
// }

// if (txt_cliCnpj.length <> 11) {
// alert('O campo CNPJ deve conter 11 caracteres');
// formCliente.txt_cliCnpj.focus();
// return false;
// }

// if (isNaN(formCliente.txt_cliCNPJ)) { 
// alert('Você não digitou um número');
// formCliente.txt_cliCnpj.focus();
// return false;
// } 


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

