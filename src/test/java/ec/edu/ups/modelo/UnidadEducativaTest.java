/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.modelo.pagos.LibroDiario;
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
public class UnidadEducativaTest {
    
    public UnidadEducativaTest() {
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
        UnidadEducativa instance = new UnidadEducativa();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        UnidadEducativa instance = new UnidadEducativa();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        UnidadEducativa instance = new UnidadEducativa();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        UnidadEducativa instance = new UnidadEducativa();
        instance.setDireccion(direccion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMision() {
        System.out.println("getMision");
        UnidadEducativa instance = new UnidadEducativa();
        String expResult = "";
        String result = instance.getMision();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMision() {
        System.out.println("setMision");
        String mision = "";
        UnidadEducativa instance = new UnidadEducativa();
        instance.setMision(mision);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        UnidadEducativa instance = new UnidadEducativa();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        UnidadEducativa instance = new UnidadEducativa();
        instance.setCorreo(correo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTelefonos() {
        System.out.println("getTelefonos");
        UnidadEducativa instance = new UnidadEducativa();
        List<Telefono> expResult = null;
        List<Telefono> result = instance.getTelefonos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTelefonos() {
        System.out.println("setTelefonos");
        List<Telefono> telefonos = null;
        UnidadEducativa instance = new UnidadEducativa();
        instance.setTelefonos(telefonos);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNoticias() {
        System.out.println("getNoticias");
        UnidadEducativa instance = new UnidadEducativa();
        List<Noticia> expResult = null;
        List<Noticia> result = instance.getNoticias();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNoticias() {
        System.out.println("setNoticias");
        List<Noticia> noticias = null;
        UnidadEducativa instance = new UnidadEducativa();
        instance.setNoticias(noticias);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTiposCertificados() {
        System.out.println("getTiposCertificados");
        UnidadEducativa instance = new UnidadEducativa();
        List<TipoCertificado> expResult = null;
        List<TipoCertificado> result = instance.getTiposCertificados();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTiposCertificados() {
        System.out.println("setTiposCertificados");
        List<TipoCertificado> tiposCertificados = null;
        UnidadEducativa instance = new UnidadEducativa();
        instance.setTiposCertificados(tiposCertificados);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCoordinadores() {
        System.out.println("getCoordinadores");
        UnidadEducativa instance = new UnidadEducativa();
        List<Coordinador> expResult = null;
        List<Coordinador> result = instance.getCoordinadores();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCoordinadores() {
        System.out.println("setCoordinadores");
        List<Coordinador> coordinadores = null;
        UnidadEducativa instance = new UnidadEducativa();
        instance.setCoordinadores(coordinadores);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLibroDiario() {
        System.out.println("getLibroDiario");
        UnidadEducativa instance = new UnidadEducativa();
        LibroDiario expResult = null;
        LibroDiario result = instance.getLibroDiario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLibroDiario() {
        System.out.println("setLibroDiario");
        LibroDiario libroDiario = null;
        UnidadEducativa instance = new UnidadEducativa();
        instance.setLibroDiario(libroDiario);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAdministrador() {
        System.out.println("getAdministrador");
        UnidadEducativa instance = new UnidadEducativa();
        Administrador expResult = null;
        Administrador result = instance.getAdministrador();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAdministrador() {
        System.out.println("setAdministrador");
        Administrador administrador = null;
        UnidadEducativa instance = new UnidadEducativa();
        instance.setAdministrador(administrador);
        fail("The test case is a prototype.");
    }
    
}
