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
        enderecosDocumentacao = "https://clickup.com/api/clickupreference/operation/GetTasks/",
        nomeIntegracao = "clickup",
        tipoAutenticacao = FabTipoAutenticacaoRest.OAUTHV2
)
public enum FabIntRestClickupTarefa implements ComoFabricaIntegracaoRest {
//?where[0][col]=email&where[0][expr]={0
    @InfoConsumoRestService(getPachServico = "/api/v2/list/{0}/task", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = "list_id",
            adicionarAutenticacaoBearer = true)
    TAREFA_LISTAR,
    ///list/{list_id}/taskTemplate/{template_id}
    @InfoConsumoRestService(getPachServico = "/api/v2/list/{0}/taskTemplate/{1}", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.POST,
            parametrosGet = {"list_id", "modelo_id"},
            adicionarAutenticacaoBearer = true)
    TAREFA_CRIAR_VIA_MODELO,
    @InfoConsumoRestService(getPachServico = "/api/v2/task/{0}", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = "task_id",
            adicionarAutenticacaoBearer = true)
    TAREFA_VER,
    @InfoConsumoRestService(getPachServico = "/api/v2/team/{0}/taskTemplate?page={1}", tipoInformacaoRecebida = FabTipoArquivoImportacao.JSON,
            tipoConexao = FabTipoConexaoRest.GET,
            parametrosGet = "team_id",
            adicionarAutenticacaoBearer = true)
    TAREFA_MODELO_LISTAR,
}
