package br.org.coletivoJava.integracoes.restClickup.implementacao;

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoHeaderBuilder;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.transmissao_recepcao_rest_client.ItfAcaoApiRest;
import java.util.Map;

public class IntegracaoRestClickup_HeaderPadrao
        extends
        AcaoApiIntegracaoHeaderBuilder {

    public IntegracaoRestClickup_HeaderPadrao(final ItfAcaoApiRest pAcao) {
        super(pAcao);
    }

    @Override
    public void gerarHeaderPadrao() {
        cabecalho.put("Authorization", acao.getTokenGestao().getToken());
        cabecalho.put("Content-Type", "application/json");
    }

}
