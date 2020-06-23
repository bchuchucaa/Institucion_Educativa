/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.modelo.pagos.LibroDiario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Duchimaza
 */
public class UnidadEducativa implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String direccion;
    private String mision;
    private String correo;
    private List<Telefono> telefonos;
    private List<Noticia> noticias;
    private List<TipoCertificado> tiposCertificados;
    private List<Coordinador> coordinadores;
    private LibroDiario libroDiario;
    private Administrador administrador;
    
    public UnidadEducativa(){
        this.telefonos = new ArrayList<>();
        this.noticias = new ArrayList<>();
        this.tiposCertificados = new ArrayList<>();
        this.coordinadores = new ArrayList<>();    
    }

    public UnidadEducativa(String nombre, String direccion, String mision, String correo, List<Telefono> telefonos, List<Noticia> noticias, List<TipoCertificado> tiposCertificados, List<Coordinador> coordinadores, LibroDiario libroDiario, Administrador administrador) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.mision = mision;
        this.correo = correo;
        this.telefonos = telefonos;
        this.noticias = noticias;
        this.tiposCertificados = tiposCertificados;
        this.coordinadores = coordinadores;
        this.libroDiario = libroDiario;
        this.administrador = administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }

    public List<TipoCertificado> getTiposCertificados() {
        return tiposCertificados;
    }

    public void setTiposCertificados(List<TipoCertificado> tiposCertificados) {
        this.tiposCertificados = tiposCertificados;
    }

    public List<Coordinador> getCoordinadores() {
        return coordinadores;
    }

    public void setCoordinadores(List<Coordinador> coordinadores) {
        this.coordinadores = coordinadores;
    }

    public LibroDiario getLibroDiario() {
        return libroDiario;
    }

    public void setLibroDiario(LibroDiario libroDiario) {
        this.libroDiario = libroDiario;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
}
