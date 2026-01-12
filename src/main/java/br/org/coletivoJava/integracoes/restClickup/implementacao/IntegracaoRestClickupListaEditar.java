package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupListas;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupListas;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;

@InfoIntegracaoRestClickupListas(tipo = FabIntRestClickupListas.LISTA_EDITAR)
public class IntegracaoRestClickupListaEditar
		extends
			AcaoApiIntegracaoComOauthAbstrato {

	public IntegracaoRestClickupListaEditar(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntRestClickupListas.LISTA_EDITAR, pTipoAgente, pUsuario,
				pParametro);
	}
}