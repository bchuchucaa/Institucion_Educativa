/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.gestion_matricula.TipoMatricula;
import java.util.Date;
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
public class ControladorPagoMensualTest {
    
    public ControladorPagoMensualTest() {
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
    public void testCalcularTotal() {
        System.out.println("calcularTotal");
        TipoMatricula tipoMatricula = null;
        double cuotaMensual = 0.0;
        ControladorPagoMensual instance = null;
        double expResult = 0.0;
        double result = instance.calcularTotal(tipoMatricula, cuotaMensual);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcularProximoPago() {
        System.out.println("calcularProximoPago");
        Date fechaUltimoPago = null;
        ControladorPagoMensual instance = null;
        Date expResult = null;
        Date result = instance.calcularProximoPago(fechaUltimoPago);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
