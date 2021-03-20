package br.com.ibge.api.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.ibge.api.entities.Bairro;
import br.com.ibge.api.entities.Cidade;

public class CidadeUtils {
	public static Cidade gerarCidade(String nome) {
		Cidade cidade = new Cidade(nome);
		
		List<Bairro> bairros = new ArrayList<>(); 				
		bairros.add(BairroUtils.gerarBairro("Malta"));
		
		cidade.setBairros(bairros);
		cidade.setAreaTotal(Math.random());
		cidade.setPopulacao(NumeroAleatorioUtils.gerarNumeroAleatorio());
		return cidade;
	}
}
