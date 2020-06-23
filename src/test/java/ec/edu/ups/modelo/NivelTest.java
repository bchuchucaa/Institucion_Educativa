/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

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
public class NivelTest {
    
    public NivelTest() {
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
        Nivel instance = new Nivel();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Nivel instance = new Nivel();
        instance.setNumero(numero);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Nivel instance = new Nivel();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Nivel instance = new Nivel();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCarreras() {
        System.out.println("getCarreras");
        Nivel instance = new Nivel();
        List<Carrera> expResult = null;
        List<Carrera> result = instance.getCarreras();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCarreras() {
        System.out.println("setCarreras");
        List<Carrera> carreras = null;
        Nivel instance = new Nivel();
        instance.setCarreras(carreras);
        fail("The test case is a prototype.");
    }
    
}
