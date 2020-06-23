/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
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
public class PersonaTest {
    
    public PersonaTest() {
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
    public void testGetCedula() {
        System.out.println("getCedula");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getCedula();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCedula() {
        System.out.println("setCedula");
        String cedula = "";
        Persona instance = new PersonaImpl();
        instance.setCedula(cedula);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Persona instance = new PersonaImpl();
        instance.setNombres(nombres);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Persona instance = new PersonaImpl();
        instance.setApellidos(apellidos);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Persona instance = new PersonaImpl();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Persona instance = new PersonaImpl();
        instance.setEdad(edad);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        Persona instance = new PersonaImpl();
        Date expResult = null;
        Date result = instance.getFechaNacimiento();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaNacimiento() {
        System.out.println("setFechaNacimiento");
        Date fechaNacimiento = null;
        Persona instance = new PersonaImpl();
        instance.setFechaNacimiento(fechaNacimiento);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Persona instance = new PersonaImpl();
        instance.setTelefono(telefono);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetContrasenia() {
        System.out.println("getContrasenia");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getContrasenia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetContrasenia() {
        System.out.println("setContrasenia");
        String contrasenia = "";
        Persona instance = new PersonaImpl();
        instance.setContrasenia(contrasenia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Persona instance = new PersonaImpl();
        instance.setCorreo(correo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRol() {
        System.out.println("getRol");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getRol();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRol() {
        System.out.println("setRol");
        String rol = "";
        Persona instance = new PersonaImpl();
        instance.setRol(rol);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetImagenNombre() {
        System.out.println("getImagenNombre");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getImagenNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetImagenNombre() {
        System.out.println("setImagenNombre");
        String imagenNombre = "";
        Persona instance = new PersonaImpl();
        instance.setImagenNombre(imagenNombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsActivo() {
        System.out.println("isActivo");
        Persona instance = new PersonaImpl();
        boolean expResult = false;
        boolean result = instance.isActivo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        boolean activo = false;
        Persona instance = new PersonaImpl();
        instance.setActivo(activo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCambiarFotoDePerfil() {
        System.out.println("cambiarFotoDePerfil");
        Persona instance = new PersonaImpl();
        instance.cambiarFotoDePerfil();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCambiarContrasenia() {
        System.out.println("cambiarContrasenia");
        Persona instance = new PersonaImpl();
        instance.cambiarContrasenia();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcularEdad() {
        System.out.println("calcularEdad");
        Persona instance = new PersonaImpl();
        instance.calcularEdad();
        fail("The test case is a prototype.");
    }

    public class PersonaImpl extends Persona {
    }
    
}
