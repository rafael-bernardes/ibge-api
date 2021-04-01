package br.gov.bom_destino.ibge.api.rest;

import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.gov.bom_destino.ibge.api.utils.CidadeUtils;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class IbgeResource implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GET
	public Response getIBGEData(@QueryParam("nome-cidade") String nomeCidade) {
		return Response.ok(CidadeUtils.gerarCidade(nomeCidade)).build();
	}
}