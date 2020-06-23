/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.pagos;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author claum
 */
public class LibroDiarioTest {
    
    public LibroDiarioTest() {
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
    public void testGetMontoTotal() {
        System.out.println("getMontoTotal");
        LibroDiario instance = new LibroDiario();
        double expResult = 0.0;
        double result = instance.getMontoTotal();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMontoTotal() {
        System.out.println("setMontoTotal");
        double montoTotal = 0.0;
        LibroDiario instance = new LibroDiario();
        instance.setMontoTotal(montoTotal);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPagoMensualDeEstudiante() {
        System.out.println("getPagoMensualDeEstudiante");
        LibroDiario instance = new LibroDiario();
        List<PagoMensual> expResult = null;
        List<PagoMensual> result = instance.getPagoMensualDeEstudiante();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPagoMensualDeEstudiante() {
        System.out.println("setPagoMensualDeEstudiante");
        List<PagoMensual> pagoMensualDeEstudiante = null;
        LibroDiario instance = new LibroDiario();
        instance.setPagoMensualDeEstudiante(pagoMensualDeEstudiante);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPagoMensualAlDocente() {
        System.out.println("getPagoMensualAlDocente");
        LibroDiario instance = new LibroDiario();
        List<ReciboDePago> expResult = null;
        List<ReciboDePago> result = instance.getPagoMensualAlDocente();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPagoMensualAlDocente() {
        System.out.println("setPagoMensualAlDocente");
        List<ReciboDePago> pagoMensualAlDocente = null;
        LibroDiario instance = new LibroDiario();
        instance.setPagoMensualAlDocente(pagoMensualAlDocente);
        fail("The test case is a prototype.");
    }
    
}
