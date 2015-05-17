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
    private Date dataAbertura;
    private int horaAbertura;
    private Date dataFechamento;
    private int horaFechamento;
    private String solucao;
    private int tempoSla;

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

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(int horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
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
}
