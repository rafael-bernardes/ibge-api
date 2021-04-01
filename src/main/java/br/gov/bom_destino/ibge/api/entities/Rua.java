package br.gov.bom_destino.ibge.api.entities;

import java.util.List;

public class Rua {
	private String nome;
	private List<Imovel> imoveis;
	
	public Rua(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Imovel> getImoveis() {
		return imoveis;
	}
	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}
}