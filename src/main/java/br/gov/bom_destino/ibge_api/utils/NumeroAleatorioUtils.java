package br.gov.bom_destino.ibge_api.utils;

import java.util.Random;

public class NumeroAleatorioUtils {
	public static int gerarNumeroAleatorio() {
		return new Random().nextInt();
	}
}