package br.gov.bom_destino.ibge.api.entities;

public class Imovel {
	private String matricula;
	private String numeroRua;
	private Double areaConstruida;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNumeroRua() {
		return numeroRua;
	}
	public void setNumeroRua(String numeroRua) {
		this.numeroRua = numeroRua;
	}
	public Double getAreaConstruida() {
		return areaConstruida;
	}
	public void setAreaConstruida(Double areaConstruida) {
		this.areaConstruida = areaConstruida;
	}
}
