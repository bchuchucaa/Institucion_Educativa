/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.pagos;

import java.util.Date;
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
public class PagoMensualTest {
    
    public PagoMensualTest() {
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
    public void testGetFecha() {
        System.out.println("getFecha");
        PagoMensual instance = new PagoMensual();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        PagoMensual instance = new PagoMensual();
        instance.setFecha(fecha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        PagoMensual instance = new PagoMensual();
        double expResult = 0.0;
        double result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        double monto = 0.0;
        PagoMensual instance = new PagoMensual();
        instance.setMonto(monto);
        fail("The test case is a prototype.");
    }
    
}
