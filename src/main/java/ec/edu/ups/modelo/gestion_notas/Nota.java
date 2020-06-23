/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_notas;

import java.io.Serializable;

/**
 *
 * @author claum
 */
public class Nota implements Serializable{
    private static final long serialVersionUID = 1L;
    private int parcial;
    private double notaEvaluacion1;
    private double notaEvaluacion2;
    private double notaEvaluacion3;
    private double notaExamen;

    public Nota() {
    }

    public Nota(int parcial, double notaEvaluacion1, double notaEvaluacion2, double notaEvaluacion3, double notaExamen) {
        this.parcial = parcial;
        this.notaEvaluacion1 = notaEvaluacion1;
        this.notaEvaluacion2 = notaEvaluacion2;
        this.notaEvaluacion3 = notaEvaluacion3;
        this.notaExamen = notaExamen;
    }

    public int getParcial() {
        return parcial;
    }

    public void setParcial(int parcial) {
        this.parcial = parcial;
    }

    public double getNotaEvaluacion1() {
        return notaEvaluacion1;
    }

    public void setNotaEvaluacion1(double notaEvaluacion1) {
        this.notaEvaluacion1 = notaEvaluacion1;
    }

    public double getNotaEvaluacion2() {
        return notaEvaluacion2;
    }

    public void setNotaEvaluacion2(double notaEvaluacion2) {
        this.notaEvaluacion2 = notaEvaluacion2;
    }

    public double getNotaEvaluacion3() {
        return notaEvaluacion3;
    }

    public void setNotaEvaluacion3(double notaEvaluacion3) {
        this.notaEvaluacion3 = notaEvaluacion3;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }
    
    
}
