/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.modelo.gestion_notas.Horario;
import ec.edu.ups.modelo.gestion_notas.Materia;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Diego Duchimaza
 */
public class Curso implements Serializable{
    private static final long serialVersionUID = 1L;
    private String paralelo;
    private int aula;
    private List<Materia>  materias;
    private Horario horario;
    private Carrera carrera;
    
    public Curso(){
        
    }

    public Curso(String paralelo, int aula, List<Materia> materias, Horario horario, Carrera carrera) {
        this.paralelo = paralelo;
        this.aula = aula;
        this.materias = materias;
        this.horario = horario;
        this.carrera = carrera;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
}
