package br.com.fatec.printhelp.model;
/**
 *
 * @author kenedy
 */
public class Impressora {
    //Variaveis
    private String numeroSerie;
    private String marca;
    private String modelo;
    
    //Metodos geters e seters
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
