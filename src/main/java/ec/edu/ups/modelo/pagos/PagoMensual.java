/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.pagos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author enriq
 */
public class PagoMensual implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date fecha;
    private double monto;

    public PagoMensual() {
        //Constructor de pago mensual del estudiante
    }

    public PagoMensual(Date fecha, double monto) {
        this.fecha = fecha;
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
