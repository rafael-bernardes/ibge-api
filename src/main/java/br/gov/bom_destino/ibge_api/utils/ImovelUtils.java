package br.gov.bom_destino.ibge_api.utils;

import java.util.Random;

import br.gov.bom_destino.ibge_api.entities.Imovel;

public class ImovelUtils {
	public static Imovel gerarImovel() {
		Imovel imovel = new Imovel();
		
		imovel.setAreaConstruida(Math.random());
		imovel.setMatricula(gerarMatricula());
		imovel.setNumeroRua(String.valueOf(NumeroAleatorioUtils.gerarNumeroAleatorio()));
		
		return imovel;
	}
	
	public static String gerarMatricula() {
		Random random = new Random();
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			builder.append(String.valueOf(random.nextInt()));
		}
		
		return builder.toString();
	}
}