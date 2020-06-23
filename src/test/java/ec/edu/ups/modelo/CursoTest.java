/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.modelo.gestion_notas.Horario;
import ec.edu.ups.modelo.gestion_notas.Materia;
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
public class CursoTest {
    
    public CursoTest() {
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
    public void testGetParalelo() {
        System.out.println("getParalelo");
        Curso instance = new Curso();
        String expResult = "";
        String result = instance.getParalelo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetParalelo() {
        System.out.println("setParalelo");
        String paralelo = "";
        Curso instance = new Curso();
        instance.setParalelo(paralelo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAula() {
        System.out.println("getAula");
        Curso instance = new Curso();
        int expResult = 0;
        int result = instance.getAula();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAula() {
        System.out.println("setAula");
        int aula = 0;
        Curso instance = new Curso();
        instance.setAula(aula);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaterias() {
        System.out.println("getMaterias");
        Curso instance = new Curso();
        List<Materia> expResult = null;
        List<Materia> result = instance.getMaterias();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaterias() {
        System.out.println("setMaterias");
        List<Materia> materias = null;
        Curso instance = new Curso();
        instance.setMaterias(materias);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Curso instance = new Curso();
        Horario expResult = null;
        Horario result = instance.getHorario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        Horario horario = null;
        Curso instance = new Curso();
        instance.setHorario(horario);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCarrera() {
        System.out.println("getCarrera");
        Curso instance = new Curso();
        Carrera expResult = null;
        Carrera result = instance.getCarrera();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCarrera() {
        System.out.println("setCarrera");
        Carrera carrera = null;
        Curso instance = new Curso();
        instance.setCarrera(carrera);
        fail("The test case is a prototype.");
    }
    
}
