package br.org.coletivoJava.integracoes.restClickup.implementacao;

import br.org.coletivoJava.integracoes.restClickup.api.InfoIntegracaoRestClickupTimes;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupTimes;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoComOauthAbstrato;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import java.util.Map;

@InfoIntegracaoRestClickupTimes(tipo = FabIntRestClickupTimes.TIME_LISTAR)
public class IntegracaoRestClickupTimeListar
        extends
        AcaoApiIntegracaoComOauthAbstrato {

    public IntegracaoRestClickupTimeListar(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ItfUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabIntRestClickupTimes.TIME_LISTAR, pTipoAgente, pUsuario,
                pParametro);
    }

    @Override
    public Map<String, String> gerarCabecalho() {
        return super.gerarCabecalho(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
