/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_matricula;

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
public class TipoMatriculaTest {
    
    public TipoMatriculaTest() {
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
    public void testGetNombre() {
        System.out.println("getNombre");
        TipoMatricula instance = new TipoMatricula();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        TipoMatricula instance = new TipoMatricula();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        TipoMatricula instance = new TipoMatricula();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        TipoMatricula instance = new TipoMatricula();
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        TipoMatricula instance = new TipoMatricula();
        String expResult = "";
        String result = instance.getDescuento();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        String descuento = "";
        TipoMatricula instance = new TipoMatricula();
        instance.setDescuento(descuento);
        fail("The test case is a prototype.");
    }
    
}
