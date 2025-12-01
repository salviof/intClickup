package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupListas;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupListas;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabConfigModuloCLickup;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.ConfigGeral.arquivosConfiguracao.ConfigModulo;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilCRCDataHora;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilCRCStringValidador;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.FabTipoConexaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.oauth.InfoTokenOauth2;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenOath2;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import jakarta.json.JsonObject;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.ChamadaHttpSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;
import java.util.Date;

@InfoIntegracaoRestClickupListas(tipo = FabIntRestClickupListas.LISTAS_DA_PASTA)
public class GestaoTokenRestClickup extends GestaoTokenOath2 {

    private boolean conexaoDiretaViaToken;
    private boolean oth2Implementado = false;

    @Override
    public boolean validarToken() {
        return false;
    }

    @Override
    protected void loadDadosIniciais() {

        if (!UtilCRCStringValidador.isNuloOuEmbranco(getConfig().getPropriedade(FabConfigModuloCLickup.TOKEN_ACESSO_DIRETO))) {
            conexaoDiretaViaToken = true;
        }
        if (!oth2Implementado) {
            this.setToken(gerarNovoToken());
        }
        super.loadDadosIniciais(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public ItfTokenDeAcessoExterno extrairToken(JsonObject jsonObject) {
        String token = getConfig().getPropriedade(FabConfigModuloCLickup.TOKEN_ACESSO_DIRETO);
        InfoTokenOauth2 tkObject = new InfoTokenOauth2(token);
        tkObject.setDataHoraExpirarToken(UtilCRCDataHora.incrementaMes(new Date(), 24));
        return tkObject;

    }

    public GestaoTokenRestClickup(final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario) {
        super(FabIntRestClickupListas.class, pTipoAgente, pUsuario);

    }

    @Override
    public final InfoTokenOauth2 gerarNovoToken() {
        if (conexaoDiretaViaToken) {
            String token = getConfig().getPropriedade(FabConfigModuloCLickup.TOKEN_ACESSO_DIRETO);
            InfoTokenOauth2 tkObject = new InfoTokenOauth2(token);
            tkObject.setDataHoraExpirarToken(UtilCRCDataHora.incrementaMes(new Date(), 24));
            return tkObject;
        }
        if (!oth2Implementado) {
            return null;
        }
        String url = getConfig().getPropriedade(FabConfigModuloCLickup.URL_SERVIDOR_CLICKUP) + "/api/v2/oauth/token"
                + "?client_id=" + getConfig().getPropriedade(FabConfigModuloCLickup.CLIENTE_ID)
                + "&client_secret=" + getConfig().getPropriedade(FabConfigModuloCLickup.CLIENT_SECRET) + "&code=string";

        String usuarioLogin = null;
        String senhaLogin = null;
        return super.gerarNovoToken(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected ChamadaHttpSimples gerarChamadaTokenObterChaveAcesso() {
        ChamadaHttpSimples chamada = new ChamadaHttpSimples();
        chamada.setTipoConexao(FabTipoConexaoRest.POST);
        return chamada;
    }

    @Override
    protected String gerarUrlAutenticaoObterCodigoSolicitacaoToken() {
        String url = "https://app.clickup.com/api?client_id={client_id}&redirect_uri={redirect_uri}";
        return url;
    }

    @Override
    protected String gerarUrlRetornoSucessoGeracaoTokenDeAcesso() {
        return getConfig().getPropriedade(FabConfigModuloCLickup.URL_HOST_CLIENT);
    }

    public boolean isConexaoDiretaViaToken() {
        return conexaoDiretaViaToken;
    }

}
