/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.Date;
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
public class ControladorUnidadEducativaTest {
    
    public ControladorUnidadEducativaTest() {
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
    public void testAgregarNoticia() {
        System.out.println("agregarNoticia");
        Date fecha = null;
        String titulo = "";
        String descripcion = "";
        String imagen = "";
        ControladorUnidadEducativa instance = null;
        instance.agregarNoticia(fecha, titulo, descripcion, imagen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarCertificado() {
        System.out.println("agregarCertificado");
        String tipo = "";
        String descripcion = "";
        ControladorUnidadEducativa instance = null;
        instance.agregarCertificado(tipo, descripcion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarCoordinador() {
        System.out.println("agregarCoordinador");
        String cargo = "";
        String descripcion = "";
        ControladorUnidadEducativa instance = null;
        instance.agregarCoordinador(cargo, descripcion);
        fail("The test case is a prototype.");
    }
    
}
