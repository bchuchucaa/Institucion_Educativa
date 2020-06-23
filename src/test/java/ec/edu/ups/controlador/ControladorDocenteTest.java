/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.pagos.ReciboDePago;
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
public class ControladorDocenteTest {
    
    public ControladorDocenteTest() {
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
    public void testAgregarTitulo() {
        System.out.println("agregarTitulo");
        String nombre = "";
        String anio = "";
        ControladorDocente instance = null;
        instance.agregarTitulo(nombre, anio);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarReciboDePago() {
        System.out.println("agregarReciboDePago");
        ReciboDePago reciboDePago = null;
        ControladorDocente instance = null;
        instance.agregarReciboDePago(reciboDePago);
        fail("The test case is a prototype.");
    }
    
}
