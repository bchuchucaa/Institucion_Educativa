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
public class TipoCertificadoTest {
    
    public TipoCertificadoTest() {
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
    public void testGetTipo() {
        System.out.println("getTipo");
        TipoCertificado instance = new TipoCertificado();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        TipoCertificado instance = new TipoCertificado();
        instance.setTipo(tipo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        TipoCertificado instance = new TipoCertificado();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        TipoCertificado instance = new TipoCertificado();
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }
    
}
