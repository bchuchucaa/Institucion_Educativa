/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_matricula;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author enriq
 */
public class RecordAcademico implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private double nota;
    private List<Matricula> matricula;

    public RecordAcademico() {
    }

    public RecordAcademico(double nota, List<Matricula> matricula) {
        this.nota = nota;
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public List<Matricula> getMatricula() {
        return matricula;
    }

    public void setMatricula(List<Matricula> matricula) {
        this.matricula = matricula;
    }
    
}
