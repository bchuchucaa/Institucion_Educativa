/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.gestion_matricula.TipoMatricula;
import ec.edu.ups.modelo.pagos.PagoMensual;
import java.util.Date;

/**
 *
 * @author enriq
 */
public class ControladorPagoMensual {
    
    PagoMensual pagoMensual;

    public ControladorPagoMensual(PagoMensual pagoMensual) {
        this.pagoMensual = pagoMensual;
    }
    
    public double calcularTotal(TipoMatricula tipoMatricula, double cuotaMensual){
        return 0;
    }
    
    public Date calcularProximoPago(Date fechaUltimoPago){
        return null;
    }
}
