package br.com.ibge.api.entities;

import java.util.List;

public class Bairro {
	private String nome;
	private List<Rua> ruas;
	
	public Bairro(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Rua> getRuas() {
		return ruas;
	}
	public void setRuas(List<Rua> ruas) {
		this.ruas = ruas;
	}
}