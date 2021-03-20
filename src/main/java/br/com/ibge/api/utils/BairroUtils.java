package br.com.ibge.api.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.ibge.api.entities.Bairro;
import br.com.ibge.api.entities.Rua;

public class BairroUtils {
	public static Bairro gerarBairro(String nome) {
		Bairro bairro = new Bairro(nome);
		
		List<Rua> ruas = new ArrayList<>();
		
		ruas.add(RuaUtils.gerarRua("Rua do Limoeiro"));
		
		bairro.setRuas(ruas);
		
		return bairro;
	}
}