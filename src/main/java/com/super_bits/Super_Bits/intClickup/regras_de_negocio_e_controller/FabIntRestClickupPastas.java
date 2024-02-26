/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller;

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ItfFabricaIntegracaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.FabTipoConexaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.InfoConsumoRestService;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.FabTipoAutenticacaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.InfoConfigRestClientIntegracao;

import com.super_bits.modulosSB.SBCore.modulos.ManipulaArquivo.importacao.FabTipoArquivoImportacao;

/**
 *
 * @author SalvioF
 */
@InfoConfigRestClientIntegracao(configuracao = FabConfigModuloCLickup.class,
        enderecosDocumentacao = "https://clickup.com/api/clickupreference/operation/GetFolders/",
        nomeIntegracao = "clickup",
        tipoAutenticacao = FabTipoAutenticacaoRest.OAUTHV2
)
public enum FabIntRestClickupPastas implements ItfFabricaIntegracaoRest {
//?where[0][col]=email&where[0][expr]={0
    @InfoConsumoRestService(getPachServico = "/api/v2/space/{0}/folder?archived=false'", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = "space_id",
            adicionarAutenticacaoBearer = true)
    PASTAS_LISTAR,
}
