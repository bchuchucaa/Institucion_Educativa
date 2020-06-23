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
 * @author claum
 */
public class ReciboDePago implements Serializable{
    private static final long serialVersionUID = 1L;
    private int codigo;
    private Date fechaDePago;
    private double montoDePago;

    public ReciboDePago() {
        //Constructor del recibo de pago del docente
    }
    
    public ReciboDePago(Date fechaDePago, double montoDePago) {
        this.fechaDePago = fechaDePago;
        this.montoDePago = montoDePago;
    }

    public Date getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(Date fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    public double getMontoDePago() {
        return montoDePago;
    }

    public void setMontoDePago(double montoDePago) {
        this.montoDePago = montoDePago;
    }


    
    
    
}
