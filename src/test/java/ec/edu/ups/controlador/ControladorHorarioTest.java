/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.sql.Time;
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
public class ControladorHorarioTest {
    
    public ControladorHorarioTest() {
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
    public void testAgregarHora() {
        System.out.println("agregarHora");
        Time horaInicio = null;
        Time horaFin = null;
        String dia = "";
        ControladorHorario instance = null;
        instance.agregarHora(horaInicio, horaFin, dia);
        fail("The test case is a prototype.");
    }
    
}
