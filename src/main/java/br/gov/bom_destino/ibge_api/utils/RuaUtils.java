package br.gov.bom_destino.ibge_api.utils;

import java.util.ArrayList;
import java.util.List;

import br.gov.bom_destino.ibge_api.entities.Imovel;
import br.gov.bom_destino.ibge_api.entities.Rua;

public class RuaUtils {
	public static Rua gerarRua(String nome) {
		Rua rua = new Rua(nome);
		
		List<Imovel> imoveis = new ArrayList<>();
		imoveis.add(ImovelUtils.gerarImovel());

		rua.setImoveis(imoveis);
		return rua;
	}
}