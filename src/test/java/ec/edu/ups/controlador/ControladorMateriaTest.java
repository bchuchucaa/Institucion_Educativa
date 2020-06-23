/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.gestion_notas.RegistroNota;
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
public class ControladorMateriaTest {
    
    public ControladorMateriaTest() {
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
    public void testAgregarRegistroNotas() {
        System.out.println("agregarRegistroNotas");
        RegistroNota registroNota = null;
        ControladorMateria instance = new ControladorMateria();
        instance.agregarRegistroNotas(registroNota);
        fail("The test case is a prototype.");
    }
    
}
