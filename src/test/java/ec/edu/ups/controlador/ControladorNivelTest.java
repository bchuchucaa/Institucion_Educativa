/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Carrera;
import ec.edu.ups.modelo.gestion_matricula.Matricula;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author criss
 */
public class ControladorNivelTest {
    
    public ControladorNivelTest() {
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
    public void testValidadBachillerato() {
        System.out.println("validadBachillerato");
        Matricula matricula = null;
        ControladorNivel instance = null;
        boolean expResult = false;
        boolean result = instance.validadBachillerato(matricula);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarCarrera() {
        System.out.println("agregarCarrera");
        Carrera carrera = null;
        ControladorNivel instance = null;
        instance.agregarCarrera(carrera);
        fail("The test case is a prototype.");
    }
    
}
