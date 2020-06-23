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
public class EstudianteTest {
    
    public EstudianteTest() {
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
    public void testGetTipoSangre() {
        System.out.println("getTipoSangre");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.getTipoSangre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTipoSangre() {
        System.out.println("setTipoSangre");
        String tipoSangre = "";
        Estudiante instance = new Estudiante();
        instance.setTipoSangre(tipoSangre);
        fail("The test case is a prototype.");
    }
    
}
