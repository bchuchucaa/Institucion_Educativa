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
public class CoordinadorTest {
    
    public CoordinadorTest() {
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
    public void testGetCargo() {
        System.out.println("getCargo");
        Coordinador instance = new Coordinador();
        String expResult = "";
        String result = instance.getCargo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        Coordinador instance = new Coordinador();
        instance.setCargo(cargo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Coordinador instance = new Coordinador();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Coordinador instance = new Coordinador();
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }
    
}
