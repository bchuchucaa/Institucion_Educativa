/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

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
public class TelefonoTest {
    
    public TelefonoTest() {
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
    public void testGetNumero() {
        System.out.println("getNumero");
        Telefono instance = new Telefono();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        Telefono instance = new Telefono();
        instance.setNumero(numero);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Telefono instance = new Telefono();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Telefono instance = new Telefono();
        instance.setTipo(tipo);
        fail("The test case is a prototype.");
    }
    
}
