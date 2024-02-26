package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupTarefa;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupTarefa;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestClickupTarefa(tipo = FabIntRestClickupTarefa.TAREFA_LISTAR)
public class IntegracaoRestClickupTarefaListar
		extends
			AcaoApiIntegracaoComOauthAbstrato {

	public IntegracaoRestClickupTarefaListar(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabIntRestClickupTarefa.TAREFA_LISTAR, pTipoAgente, pUsuario,
				pParametro);
	}
}