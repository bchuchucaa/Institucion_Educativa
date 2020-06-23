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
public class CarreraTest {
    
    public CarreraTest() {
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
        Carrera instance = new Carrera();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Carrera instance = new Carrera();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Carrera instance = new Carrera();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Carrera instance = new Carrera();
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        Carrera instance = new Carrera();
        Nivel expResult = null;
        Nivel result = instance.getNivel();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNivel() {
        System.out.println("setNivel");
        Nivel nivel = null;
        Carrera instance = new Carrera();
        instance.setNivel(nivel);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCursos() {
        System.out.println("getCursos");
        Carrera instance = new Carrera();
        List<Curso> expResult = null;
        List<Curso> result = instance.getCursos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCursos() {
        System.out.println("setCursos");
        List<Curso> cursos = null;
        Carrera instance = new Carrera();
        instance.setCursos(cursos);
        fail("The test case is a prototype.");
    }
    
}
