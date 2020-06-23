/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Carrera;
import ec.edu.ups.modelo.Nivel;
import ec.edu.ups.modelo.gestion_matricula.Matricula;

/**
 *
 * @author Diego Duchimaza
 */
public class ControladorNivel {
    
    private Nivel nivel;

    public ControladorNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public boolean validadBachillerato(Matricula matricula){
        return false;
       
    }
    
    public void agregarCarrera(Carrera carrera){

    }
    
}
