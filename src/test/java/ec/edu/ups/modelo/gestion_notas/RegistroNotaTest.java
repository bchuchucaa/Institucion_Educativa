/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_notas;

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
public class RegistroNotaTest {
    
    public RegistroNotaTest() {
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
    public void testGetMateria() {
        System.out.println("getMateria");
        RegistroNota instance = new RegistroNota();
        Materia expResult = null;
        Materia result = instance.getMateria();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMateria() {
        System.out.println("setMateria");
        Materia materia = null;
        RegistroNota instance = new RegistroNota();
        instance.setMateria(materia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNotas() {
        System.out.println("getNotas");
        RegistroNota instance = new RegistroNota();
        List<Nota> expResult = null;
        List<Nota> result = instance.getNotas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNotas() {
        System.out.println("setNotas");
        List<Nota> notas = null;
        RegistroNota instance = new RegistroNota();
        instance.setNotas(notas);
        fail("The test case is a prototype.");
    }
    
}
