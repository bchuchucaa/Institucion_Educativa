/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_matricula;

import ec.edu.ups.modelo.Estudiante;
import ec.edu.ups.modelo.Nivel;
import ec.edu.ups.modelo.pagos.PagoMensual;
import java.util.Date;
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
public class MatriculaTest {
    
    public MatriculaTest() {
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
        Matricula instance = new Matricula();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Matricula instance = new Matricula();
        instance.setFecha(fecha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPeriodoLectivo() {
        System.out.println("getPeriodoLectivo");
        Matricula instance = new Matricula();
        String expResult = "";
        String result = instance.getPeriodoLectivo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPeriodoLectivo() {
        System.out.println("setPeriodoLectivo");
        String periodoLectivo = "";
        Matricula instance = new Matricula();
        instance.setPeriodoLectivo(periodoLectivo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEstadoAprobacionAnio() {
        System.out.println("getEstadoAprobacionAnio");
        Matricula instance = new Matricula();
        String expResult = "";
        String result = instance.getEstadoAprobacionAnio();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEstadoAprobacionAnio() {
        System.out.println("setEstadoAprobacionAnio");
        String estadoAprobacionAnio = "";
        Matricula instance = new Matricula();
        instance.setEstadoAprobacionAnio(estadoAprobacionAnio);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEstudiante() {
        System.out.println("getEstudiante");
        Matricula instance = new Matricula();
        Estudiante expResult = null;
        Estudiante result = instance.getEstudiante();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEstudiante() {
        System.out.println("setEstudiante");
        Estudiante estudiante = null;
        Matricula instance = new Matricula();
        instance.setEstudiante(estudiante);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTipoMatricula() {
        System.out.println("getTipoMatricula");
        Matricula instance = new Matricula();
        TipoMatricula expResult = null;
        TipoMatricula result = instance.getTipoMatricula();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTipoMatricula() {
        System.out.println("setTipoMatricula");
        TipoMatricula tipoMatricula = null;
        Matricula instance = new Matricula();
        instance.setTipoMatricula(tipoMatricula);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPagos() {
        System.out.println("getPagos");
        Matricula instance = new Matricula();
        List<PagoMensual> expResult = null;
        List<PagoMensual> result = instance.getPagos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPagos() {
        System.out.println("setPagos");
        List<PagoMensual> pagos = null;
        Matricula instance = new Matricula();
        instance.setPagos(pagos);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        Matricula instance = new Matricula();
        Nivel expResult = null;
        Nivel result = instance.getNivel();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNivel() {
        System.out.println("setNivel");
        Nivel nivel = null;
        Matricula instance = new Matricula();
        instance.setNivel(nivel);
        fail("The test case is a prototype.");
    }
    
}
