package br.gov.bom_destino.ibge_api.utils;

import java.util.ArrayList;
import java.util.List;

import br.gov.bom_destino.ibge_api.entities.Bairro;
import br.gov.bom_destino.ibge_api.entities.Cidade;

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
