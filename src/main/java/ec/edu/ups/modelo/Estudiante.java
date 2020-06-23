/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 *
 * @author enriq
 */
public class Estudiante extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private String tipoSangre;

    public Estudiante() {
    }
    
    public Estudiante(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

   

}
