package br.com.fatec.printhelp.model;
/**
 *
 * @author kenedy
 */
public class Funcionario {
    //Variaveis
    private long cod_funcionario;
    private String nome;
    private String cargo;
    private String telefone;
    private String email;
    private String administrador;
    private String senha;
    
    //Metodos geters e seters
	public long getCod_funcionario() {
		return cod_funcionario;
	}
	public void setCod_funcionario(long cod_funcionario) {
		this.cod_funcionario = cod_funcionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdministrador() {
		return administrador;
	}
	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
       
}
