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
public class ReciboDePagoTest {
    
    public ReciboDePagoTest() {
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
    public void testGetFechaDePago() {
        System.out.println("getFechaDePago");
        ReciboDePago instance = new ReciboDePago();
        Date expResult = null;
        Date result = instance.getFechaDePago();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaDePago() {
        System.out.println("setFechaDePago");
        Date fechaDePago = null;
        ReciboDePago instance = new ReciboDePago();
        instance.setFechaDePago(fechaDePago);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMontoDePago() {
        System.out.println("getMontoDePago");
        ReciboDePago instance = new ReciboDePago();
        double expResult = 0.0;
        double result = instance.getMontoDePago();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMontoDePago() {
        System.out.println("setMontoDePago");
        double montoDePago = 0.0;
        ReciboDePago instance = new ReciboDePago();
        instance.setMontoDePago(montoDePago);
        fail("The test case is a prototype.");
    }
    
}
