package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupPastas;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupPastas;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestClickupPastas(tipo = FabIntRestClickupPastas.PASTAS_DETALHES)
public class IntegracaoRestClickupPastasDetalhes
        extends
        AcaoApiIntegracaoComOauthAbstrato {

    public IntegracaoRestClickupPastasDetalhes(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabIntRestClickupPastas.PASTAS_DETALHES, pTipoAgente, pUsuario,
                pParametro);
    }

    @Override
    public String gerarUrlRequisicao() {
        String urlREsp = super.gerarUrlRequisicao();
        return urlREsp;
    }

}
