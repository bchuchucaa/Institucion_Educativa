/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.pagos.ReciboDePago;
import ec.edu.ups.modelo.Titulo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author claum
 */
public class Docente extends Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    private double sueldo;
    private Date fechaDeRegistro;
    private List<Titulo> titulos;
    private List<ReciboDePago> recibosDePagos;
    
    public Docente() {
        this.titulos = new ArrayList<Titulo>();
        this.recibosDePagos = new ArrayList<ReciboDePago>();
    }

    public Docente(double sueldo, Date fechaDeRegistro, List<Titulo> titulos, List<ReciboDePago> recibosDePagos) {
        this.sueldo = sueldo;
        this.fechaDeRegistro = fechaDeRegistro;
        this.titulos = titulos;
        this.recibosDePagos = recibosDePagos;
    }
    
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }
    
    public List<Titulo> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<Titulo> titulos) {
        this.titulos = titulos;
    }

    public List<ReciboDePago> getRecibosDePagos() {
        return recibosDePagos;
    }

    public void setRecibosDePagos(List<ReciboDePago> recibosDePagos) {
        this.recibosDePagos = recibosDePagos;
    }
    
}
