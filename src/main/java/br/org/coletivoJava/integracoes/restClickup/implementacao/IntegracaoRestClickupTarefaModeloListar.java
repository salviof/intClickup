package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupTarefa;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupTarefa;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;

@InfoIntegracaoRestClickupTarefa(tipo = FabIntRestClickupTarefa.TAREFA_MODELO_LISTAR)
public class IntegracaoRestClickupTarefaModeloListar
        extends
        AcaoApiIntegracaoComOauthAbstrato {

    public IntegracaoRestClickupTarefaModeloListar(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabIntRestClickupTarefa.TAREFA_MODELO_LISTAR, pTipoAgente,
                pUsuario, pParametro);
    }

    @Override
    public String gerarUrlRequisicao() {
        return super.gerarUrlRequisicao(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String gerarCorpoRequisicao() {
        return super.gerarCorpoRequisicao(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
