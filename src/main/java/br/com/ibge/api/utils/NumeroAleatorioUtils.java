package br.com.ibge.api.utils;

import java.util.Random;

public class NumeroAleatorioUtils {
	public static int gerarNumeroAleatorio() {
		return new Random().nextInt();
	}
}