/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.mktMauticIntegracao.regras_de_negocio_e_controller;

import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupListas;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupEspacos;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupPastas;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupTarefa;
import com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller.FabIntRestClickupTimes;
import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoremktClickupTestes;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import org.junit.Assert;
import org.junit.Test;
import testes.testesSupers.TestesApiRest;

/**
 *
 * @author sfurbino
 */
public class FabClickupRestGeradorTest extends TestesApiRest {

    public FabClickupRestGeradorTest() {
    }

    /**
     * Test of values method, of class FabMauticContatoRest.
     */
    @Test
    public void testValues() {
        try {
            SBCore.configurar(new ConfiguradorCoremktClickupTestes(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
            gerarCodigosChamadasEndpoint(FabIntRestClickupListas.class);
            gerarCodigosChamadasEndpoint(FabIntRestClickupTimes.class);
            gerarCodigosChamadasEndpoint(FabIntRestClickupEspacos.class);
            gerarCodigosChamadasEndpoint(FabIntRestClickupPastas.class);
            gerarCodigosChamadasEndpoint(FabIntRestClickupTarefa.class);
        } catch (Throwable t) {
            Assert.fail("Deu merda");
        }

    }

}
