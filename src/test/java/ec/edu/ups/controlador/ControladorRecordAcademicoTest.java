/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.gestion_matricula.Matricula;
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
public class ControladorRecordAcademicoTest {
    
    public ControladorRecordAcademicoTest() {
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
    public void testAgregarMatricula() {
        System.out.println("agregarMatricula");
        Matricula matricula = null;
        ControladorRecordAcademico instance = null;
        instance.agregarMatricula(matricula);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcularRecordAcademico() {
        System.out.println("calcularRecordAcademico");
        ControladorRecordAcademico instance = null;
        instance.calcularRecordAcademico();
        fail("The test case is a prototype.");
    }
    
}
