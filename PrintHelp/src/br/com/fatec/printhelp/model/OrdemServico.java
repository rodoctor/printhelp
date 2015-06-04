package br.com.fatec.printhelp.model;

import java.util.Date;

/**
 *
 * @author kenedy
 */
public class OrdemServico {
    //Variaveis
    private int numero;
    private String problema;
    private String descricaoProblema;
    private String dataAbertura;
    private int horaAbertura;
    private String dataFechamento;
    private int horaFechamento;
    private String solucao;
    private int tempoSla;
    private long cnpj;
    private String numeroSerie;
    private int cod_funcionario;

    //Metodos geters e seters 
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(int horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public int getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(int horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public int getTempoSla() {
        return tempoSla;
    }

    public void setTempoSla(int tempoSla) {
        this.tempoSla = tempoSla;
    }

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNumeroserie() {
		return numeroSerie;
	}

	public void setNumeroserie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public int getCod_funcionario() {
		return cod_funcionario;
	}

	public void setCod_funcionario(int cod_funcionario) {
		this.cod_funcionario = cod_funcionario;
	}
    
    
}
