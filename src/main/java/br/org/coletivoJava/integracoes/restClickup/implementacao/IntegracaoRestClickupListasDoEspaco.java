package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupListas;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupListas;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestClickupListas(tipo = FabIntRestClickupListas.LISTAS_DO_ESPACO)
public class IntegracaoRestClickupListasDoEspaco
		extends
			AcaoApiIntegracaoComOauthAbstrato {

	public IntegracaoRestClickupListasDoEspaco(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntRestClickupListas.LISTAS_DO_ESPACO, pTipoAgente, pUsuario,
				pParametro);
	}
}