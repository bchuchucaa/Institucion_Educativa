/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

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
public class ControladorMatriculaTest {
    
    public ControladorMatriculaTest() {
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
    public void testCalcularFechaDePago() {
        System.out.println("calcularFechaDePago");
        Date fechaUltimoPago = null;
        ControladorMatricula instance = null;
        Date expResult = null;
        Date result = instance.calcularFechaDePago(fechaUltimoPago);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarPago() {
        System.out.println("agregarPago");
        Date fecha = null;
        double monto = 0.0;
        ControladorMatricula instance = null;
        instance.agregarPago(fecha, monto);
        fail("The test case is a prototype.");
    }
    
}
