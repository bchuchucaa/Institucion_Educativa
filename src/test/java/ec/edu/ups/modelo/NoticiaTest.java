/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.awt.Image;
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
public class NoticiaTest {
    
    public NoticiaTest() {
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
        Noticia instance = new Noticia();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Noticia instance = new Noticia();
        instance.setFecha(fecha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Noticia instance = new Noticia();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Noticia instance = new Noticia();
        instance.setTitulo(titulo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescrpcion() {
        System.out.println("getDescrpcion");
        Noticia instance = new Noticia();
        String expResult = "";
        String result = instance.getDescrpcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescrpcion() {
        System.out.println("setDescrpcion");
        String descrpcion = "";
        Noticia instance = new Noticia();
        instance.setDescrpcion(descrpcion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Noticia instance = new Noticia();
        Image expResult = null;
        Image result = instance.getImagen();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        Image imagen = null;
        Noticia instance = new Noticia();
        instance.setImagen(imagen);
        fail("The test case is a prototype.");
    }
    
}
