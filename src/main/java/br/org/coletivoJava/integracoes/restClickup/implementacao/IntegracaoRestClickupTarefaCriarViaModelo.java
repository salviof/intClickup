package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupTarefa;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupTarefa;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestClickupTarefa(tipo = FabIntRestClickupTarefa.TAREFA_CRIAR_VIA_MODELO)
public class IntegracaoRestClickupTarefaCriarViaModelo
        extends
        AcaoApiIntegracaoComOauthAbstrato {

    public IntegracaoRestClickupTarefaCriarViaModelo(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabIntRestClickupTarefa.TAREFA_CRIAR_VIA_MODELO, pTipoAgente,
                pUsuario, pParametro);
    }

    @Override
    public String gerarUrlRequisicao() {
        return super.gerarUrlRequisicao(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String gerarCorpoRequisicao() {
        String nome = getParametros()[2].toString();
        String payload = String.join("\n",
                "{",
                " \"name\": \"" + nome + "\"",
                "}"
        );
        return payload;
    }

}
