/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

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
public class ControladorRegistroNotasTest {
    
    public ControladorRegistroNotasTest() {
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
    public void testAgregarNota() {
        System.out.println("agregarNota");
        int parcial = 0;
        double notaEvaluacion1 = 0.0;
        double notaEvaluacion2 = 0.0;
        double notaEvaluacion3 = 0.0;
        double notaExamen = 0.0;
        ControladorRegistroNotas instance = new ControladorRegistroNotas();
        instance.agregarNota(parcial, notaEvaluacion1, notaEvaluacion2, notaEvaluacion3, notaExamen);
        fail("The test case is a prototype.");
    }
    
}
