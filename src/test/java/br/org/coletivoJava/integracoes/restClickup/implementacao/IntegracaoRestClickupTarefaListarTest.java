/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.org.coletivoJava.integracoes.restClickup.implementacao;

import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupTarefa;
import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoremktClickupTestes;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreJson;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreStringJson;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import jakarta.json.JsonObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salvio
 */
public class IntegracaoRestClickupTarefaListarTest {

    public IntegracaoRestClickupTarefaListarTest() {
    }

    @Test
    public void testListarTarefas() {
        SBCore.configurar(new ConfiguradorCoremktClickupTestes(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        IntegracaoRestClickupListasDoEspacoTest integracao = new IntegracaoRestClickupListasDoEspacoTest();
        String codigoLista = integracao.getListaTarefaByCodigo("61");
        ItfRespostaWebServiceSimples resp = FabIntRestClickupTarefa.TAREFA_LISTAR.getAcao(codigoLista).getResposta();
        JsonObject retornoJson = resp.getRespostaComoObjetoJson();
        System.out.println(UtilSBCoreJson.getTextoByJsonObjeect(retornoJson));
    }

}
