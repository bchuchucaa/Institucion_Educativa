/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.pagos;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Diego Duchimaza
 */
public class LibroDiario implements Serializable{
    private static final long serialVersionUID = 1L;
    private double montoTotal;
    private List<PagoMensual> pagoMensualDeEstudiante;
    private List<ReciboDePago> pagoMensualAlDocente;

    public LibroDiario() {
    }

    public LibroDiario(double montoTotal, List<PagoMensual> pagoMensualDeEstudiante, List<ReciboDePago> pagoMensualAlDocente) {
        this.montoTotal = montoTotal;
        this.pagoMensualDeEstudiante = pagoMensualDeEstudiante;
        this.pagoMensualAlDocente = pagoMensualAlDocente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public List<PagoMensual> getPagoMensualDeEstudiante() {
        return pagoMensualDeEstudiante;
    }

    public void setPagoMensualDeEstudiante(List<PagoMensual> pagoMensualDeEstudiante) {
        this.pagoMensualDeEstudiante = pagoMensualDeEstudiante;
    }

    public List<ReciboDePago> getPagoMensualAlDocente() {
        return pagoMensualAlDocente;
    }

    public void setPagoMensualAlDocente(List<ReciboDePago> pagoMensualAlDocente) {
        this.pagoMensualAlDocente = pagoMensualAlDocente;
    }
    
    
}
