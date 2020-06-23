/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.gestion_matricula.Matricula;
import java.util.Date;

/**
 *
 * @author Diego Duchimaza
 */
public class ControladorMatricula {
    
    Matricula matricula;

    public ControladorMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
    public Date calcularFechaDePago(Date fechaUltimoPago){
        return null;
    }
    
    public void agregarPago(Date fecha, double monto) {

    }
    
}
