package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupPastas;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupPastas;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestClickupPastas(tipo = FabIntRestClickupPastas.PASTAS_REMOVER)
public class IntegracaoRestClickupPastasRemover
		extends
			AcaoApiIntegracaoComOauthAbstrato {

	public IntegracaoRestClickupPastasRemover(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntRestClickupPastas.PASTAS_REMOVER, pTipoAgente, pUsuario,
				pParametro);
	}
}