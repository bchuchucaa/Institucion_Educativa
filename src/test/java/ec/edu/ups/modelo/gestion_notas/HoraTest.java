/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_notas;

import java.sql.Time;
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
public class HoraTest {
    
    public HoraTest() {
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
    public void testGetHoraInicio() {
        System.out.println("getHoraInicio");
        Hora instance = new Hora();
        Time expResult = null;
        Time result = instance.getHoraInicio();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHoraInicio() {
        System.out.println("setHoraInicio");
        Time horaInicio = null;
        Hora instance = new Hora();
        instance.setHoraInicio(horaInicio);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHoraFin() {
        System.out.println("getHoraFin");
        Hora instance = new Hora();
        Time expResult = null;
        Time result = instance.getHoraFin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHoraFin() {
        System.out.println("setHoraFin");
        Time horaFin = null;
        Hora instance = new Hora();
        instance.setHoraFin(horaFin);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Hora instance = new Hora();
        String expResult = "";
        String result = instance.getDia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDia() {
        System.out.println("setDia");
        String dia = "";
        Hora instance = new Hora();
        instance.setDia(dia);
        fail("The test case is a prototype.");
    }
    
}
