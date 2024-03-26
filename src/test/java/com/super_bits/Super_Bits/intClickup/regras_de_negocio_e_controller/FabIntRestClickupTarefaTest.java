/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.super_bits.Super_Bits.intClickup.regras_de_negocio_e_controller;

import com.super_bits.Super_Bits.mktMauticIntegracao.configAppp.ConfiguradorCoremktClickupTestes;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import org.junit.Assert;
import org.junit.Test;
import testes.testesSupers.TestesApiRest;

/**
 *
 * @author salvio
 */
public class FabIntRestClickupTarefaTest extends TestesApiRest {

    public FabIntRestClickupTarefaTest() {
    }

    /**
     * Test of values method, of class FabIntRestClickupTarefa.
     */
    @Test
    public void testValues() {
        try {
            SBCore.configurar(new ConfiguradorCoremktClickupTestes(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

            gerarCodigosChamadasEndpoint(FabIntRestClickupTarefa.class);

        } catch (Throwable t) {
            Assert.fail("Deu merda");
        }

    }

}
