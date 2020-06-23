/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_notas;

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
public class NotaTest {
    
    public NotaTest() {
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
    public void testGetParcial() {
        System.out.println("getParcial");
        Nota instance = new Nota();
        int expResult = 0;
        int result = instance.getParcial();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetParcial() {
        System.out.println("setParcial");
        int parcial = 0;
        Nota instance = new Nota();
        instance.setParcial(parcial);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNotaEvaluacion1() {
        System.out.println("getNotaEvaluacion1");
        Nota instance = new Nota();
        double expResult = 0.0;
        double result = instance.getNotaEvaluacion1();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNotaEvaluacion1() {
        System.out.println("setNotaEvaluacion1");
        double notaEvaluacion1 = 0.0;
        Nota instance = new Nota();
        instance.setNotaEvaluacion1(notaEvaluacion1);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNotaEvaluacion2() {
        System.out.println("getNotaEvaluacion2");
        Nota instance = new Nota();
        double expResult = 0.0;
        double result = instance.getNotaEvaluacion2();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNotaEvaluacion2() {
        System.out.println("setNotaEvaluacion2");
        double notaEvaluacion2 = 0.0;
        Nota instance = new Nota();
        instance.setNotaEvaluacion2(notaEvaluacion2);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNotaEvaluacion3() {
        System.out.println("getNotaEvaluacion3");
        Nota instance = new Nota();
        double expResult = 0.0;
        double result = instance.getNotaEvaluacion3();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNotaEvaluacion3() {
        System.out.println("setNotaEvaluacion3");
        double notaEvaluacion3 = 0.0;
        Nota instance = new Nota();
        instance.setNotaEvaluacion3(notaEvaluacion3);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNotaExamen() {
        System.out.println("getNotaExamen");
        Nota instance = new Nota();
        double expResult = 0.0;
        double result = instance.getNotaExamen();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNotaExamen() {
        System.out.println("setNotaExamen");
        double notaExamen = 0.0;
        Nota instance = new Nota();
        instance.setNotaExamen(notaExamen);
        fail("The test case is a prototype.");
    }
    
}
