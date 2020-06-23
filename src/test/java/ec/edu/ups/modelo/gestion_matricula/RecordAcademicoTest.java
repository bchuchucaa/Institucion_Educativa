/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_matricula;

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
public class RecordAcademicoTest {
    
    public RecordAcademicoTest() {
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
    public void testGetNota() {
        System.out.println("getNota");
        RecordAcademico instance = new RecordAcademico();
        double expResult = 0.0;
        double result = instance.getNota();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNota() {
        System.out.println("setNota");
        double nota = 0.0;
        RecordAcademico instance = new RecordAcademico();
        instance.setNota(nota);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        RecordAcademico instance = new RecordAcademico();
        List<Matricula> expResult = null;
        List<Matricula> result = instance.getMatricula();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        List<Matricula> matricula = null;
        RecordAcademico instance = new RecordAcademico();
        instance.setMatricula(matricula);
        fail("The test case is a prototype.");
    }
    
}
