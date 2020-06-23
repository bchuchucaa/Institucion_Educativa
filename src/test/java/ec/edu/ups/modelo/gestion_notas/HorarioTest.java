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
public class HorarioTest {
    
    public HorarioTest() {
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
    public void testGetHoras() {
        System.out.println("getHoras");
        Horario instance = new Horario();
        List<Hora> expResult = null;
        List<Hora> result = instance.getHoras();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHoras() {
        System.out.println("setHoras");
        List<Hora> horas = null;
        Horario instance = new Horario();
        instance.setHoras(horas);
        fail("The test case is a prototype.");
    }
    
}
