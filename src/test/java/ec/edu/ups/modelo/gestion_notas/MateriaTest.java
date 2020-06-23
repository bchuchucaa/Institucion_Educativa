/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_notas;

import ec.edu.ups.modelo.Curso;
import ec.edu.ups.modelo.Docente;
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
public class MateriaTest {
    
    public MateriaTest() {
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
        Materia instance = new Materia();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Materia instance = new Materia();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Materia instance = new Materia();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Materia instance = new Materia();
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNumeroDeHoras() {
        System.out.println("getNumeroDeHoras");
        Materia instance = new Materia();
        int expResult = 0;
        int result = instance.getNumeroDeHoras();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumeroDeHoras() {
        System.out.println("setNumeroDeHoras");
        int numeroDeHoras = 0;
        Materia instance = new Materia();
        instance.setNumeroDeHoras(numeroDeHoras);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetColorEnHorario() {
        System.out.println("getColorEnHorario");
        Materia instance = new Materia();
        String expResult = "";
        String result = instance.getColorEnHorario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetColorEnHorario() {
        System.out.println("setColorEnHorario");
        String colorEnHorario = "";
        Materia instance = new Materia();
        instance.setColorEnHorario(colorEnHorario);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDocente() {
        System.out.println("getDocente");
        Materia instance = new Materia();
        Docente expResult = null;
        Docente result = instance.getDocente();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDocente() {
        System.out.println("setDocente");
        Docente docente = null;
        Materia instance = new Materia();
        instance.setDocente(docente);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        Materia instance = new Materia();
        Curso expResult = null;
        Curso result = instance.getCurso();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCurso() {
        System.out.println("setCurso");
        Curso curso = null;
        Materia instance = new Materia();
        instance.setCurso(curso);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRegistroNotas() {
        System.out.println("getRegistroNotas");
        Materia instance = new Materia();
        List<RegistroNota> expResult = null;
        List<RegistroNota> result = instance.getRegistroNotas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRegistroNotas() {
        System.out.println("setRegistroNotas");
        List<RegistroNota> registroNotas = null;
        Materia instance = new Materia();
        instance.setRegistroNotas(registroNotas);
        fail("The test case is a prototype.");
    }
    
}
