package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupEspacos;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupEspacos;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestClickupEspacos(tipo = FabIntRestClickupEspacos.ESPACO_LISTAR)
public class IntegracaoRestClickupEspacoListar
		extends
			AcaoApiIntegracaoComOauthAbstrato {

	public IntegracaoRestClickupEspacoListar(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntRestClickupEspacos.ESPACO_LISTAR, pTipoAgente, pUsuario,
				pParametro);
	}
}