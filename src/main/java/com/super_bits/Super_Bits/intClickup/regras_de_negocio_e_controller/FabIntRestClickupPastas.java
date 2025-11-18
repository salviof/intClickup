/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller;

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ComoFabricaIntegracaoRest;
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
public enum FabIntRestClickupPastas implements ComoFabricaIntegracaoRest {
//?where[0][col]=email&where[0][expr]={0
    @InfoConsumoRestService(getPachServico = "/api/v2/space/{0}/folder?archived=false'", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = "space_id",
            adicionarAutenticacaoBearer = true)
    PASTAS_LISTAR,
    //https://api.clickup.com/api/v2/space/{space_id}/folder
    @InfoConsumoRestService(getPachServico = "/api/v2/space/{0}/folder?archived=false'", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.POST,
            parametrosGet = "space_id",
            adicionarAutenticacaoBearer = true)
    PASTAS_CRIAR,
    //https://api.clickup.com/api/v2/folder/{folder_id}
    @InfoConsumoRestService(getPachServico = "/api/v2/folder/{0}", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.DELETE,
            parametrosGet = "folder_id",
            adicionarAutenticacaoBearer = true)
    PASTAS_REMOVER,
    //'https://api.clickup.com/api/v2/folder/{folder_id}
    @InfoConsumoRestService(getPachServico = "/api/v2/folder/{0}", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = "folder_id",
            adicionarAutenticacaoBearer = true)
    PASTAS_DETALHES,
}
