package br.gov.bom_destino.ibge.api.utils;

import java.util.ArrayList;
import java.util.List;

import br.gov.bom_destino.ibge.api.entities.Bairro;
import br.gov.bom_destino.ibge.api.entities.Rua;

public class BairroUtils {
	public static Bairro gerarBairro(String nome) {
		Bairro bairro = new Bairro(nome);
		
		List<Rua> ruas = new ArrayList<>();
		
		ruas.add(RuaUtils.gerarRua("Rua do Limoeiro"));
		
		bairro.setRuas(ruas);
		
		return bairro;
	}
}