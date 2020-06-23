/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_notas;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Diego Duchimaza
 */
public class Horario implements Serializable{
    private static final long serialVersionUID = 1L;
    private List<Hora> horas;

    public Horario() {
    }

    public Horario(List<Hora> horas) {
        this.horas = horas;

    }

    public List<Hora> getHoras() {
        return horas;
    }

    public void setHoras(List<Hora> horas) {
        this.horas = horas;
    }    
    
}
