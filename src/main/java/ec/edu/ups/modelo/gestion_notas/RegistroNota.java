/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_notas;

import ec.edu.ups.modelo.gestion_notas.Materia;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author claum
 */
public class RegistroNota implements Serializable{
    private static final long serialVersionUID = 1L;
    private Materia materia;
    private List<Nota> notas;

    public RegistroNota() {
    }

    public RegistroNota(Materia materia, List<Nota> notas) {
        this.materia = materia;
        this.notas = notas;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
    
}
