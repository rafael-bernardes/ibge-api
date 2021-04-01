package br.gov.bom_destino.ibge.api.entities;

import java.util.List;

public class Cidade {
	private String nome;
	private int populacao;
	private Double areaTotal;
	private List<Bairro> bairros;
	
	public Cidade(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public Double getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(Double areaTotal) {
		this.areaTotal = areaTotal;
	}
	public List<Bairro> getBairros() {
		return bairros;
	}
	public void setBairros(List<Bairro> bairros) {
		this.bairros = bairros;
	}
}