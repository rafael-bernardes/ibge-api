package br.com.ibge.api.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.ibge.api.entities.Imovel;
import br.com.ibge.api.entities.Rua;

public class RuaUtils {
	public static Rua gerarRua(String nome) {
		Rua rua = new Rua(nome);
		
		List<Imovel> imoveis = new ArrayList<>();
		imoveis.add(ImovelUtils.gerarImovel());

		rua.setImoveis(imoveis);
		return rua;
	}
}