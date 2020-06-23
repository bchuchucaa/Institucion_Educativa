/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.TipoCertificado;
import ec.edu.ups.modelo.gestion_matricula.Matricula;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author criss
 */
public class ControladorTipoCertificadoTest {
    
    public ControladorTipoCertificadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testImprimirCertificado() {
        System.out.println("imprimirCertificado");
        TipoCertificado certificado = null;
        Matricula matricula = null;
        ControladorTipoCertificado instance = null;
        instance.imprimirCertificado(certificado, matricula);
        fail("The test case is a prototype.");
    }
    
}
