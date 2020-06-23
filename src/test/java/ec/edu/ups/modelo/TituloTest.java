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
public class TituloTest {
    
    public TituloTest() {
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
    public void testGetNombreDeTitulo() {
        System.out.println("getNombreDeTitulo");
        Titulo instance = new Titulo();
        String expResult = "";
        String result = instance.getNombreDeTitulo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombreDeTitulo() {
        System.out.println("setNombreDeTitulo");
        String nombreDeTitulo = "";
        Titulo instance = new Titulo();
        instance.setNombreDeTitulo(nombreDeTitulo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAnioDeTitulacion() {
        System.out.println("getAnioDeTitulacion");
        Titulo instance = new Titulo();
        String expResult = "";
        String result = instance.getAnioDeTitulacion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAnioDeTitulacion() {
        System.out.println("setAnioDeTitulacion");
        String anioDeTitulacion = "";
        Titulo instance = new Titulo();
        instance.setAnioDeTitulacion(anioDeTitulacion);
        fail("The test case is a prototype.");
    }
    
}
