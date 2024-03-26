package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupListas;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupListas;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

@InfoIntegracaoRestClickupListas(tipo = FabIntRestClickupListas.LISTA_CRIAR_NA_PASTA)
public class IntegracaoRestClickupListaCriarNaPasta
        extends
        AcaoApiIntegracaoComOauthAbstrato {

    public IntegracaoRestClickupListaCriarNaPasta(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabIntRestClickupListas.LISTA_CRIAR_NA_PASTA, pTipoAgente,
                pUsuario, pParametro);
    }

    @Override
    public String gerarUrlRequisicao() {
        String url = super.gerarUrlRequisicao();
        return url;
    }

    @Override
    public String gerarCorpoRequisicao() {

        String nome = getParametros()[1].toString();
        String descricao = getParametros()[2].toString();
        String corpo = "{\n"
                + "    \"name\": \"" + nome + "\",\n"
                + "    \"content\": \"" + descricao + "\"\n"
                //   + "    \"due_date\": 1567780450202,\n"
                //   + "    \"due_date_time\": false,\n"
                //    + "    \"priority\": 1,\n"
                //     + "    \"assignee\": 183,\n"
                // + "    \"status\": \"red\"\n"
                + "  }";
        return corpo;
    }

}
