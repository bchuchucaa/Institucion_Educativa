/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.pagos.ReciboDePago;
import java.util.Date;

/**
 *
 * @author claum
 */
public class ControladorPagosDocente {
    ReciboDePago reciboDePago;

    public ControladorPagosDocente() {
        this.reciboDePago = new ReciboDePago();
    }
    
    public Date calcularMensual(Date fechaUltimoPago){
        return null;
    }
    
    
}
