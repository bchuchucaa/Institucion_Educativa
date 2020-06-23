/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_notas;

import ec.edu.ups.modelo.Curso;
import ec.edu.ups.modelo.Docente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Duchimaza
 */
public class Materia implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String descripcion;
    private int numeroDeHoras;
    private String colorEnHorario;
    private Docente docente;
    private Curso curso;
    private List<RegistroNota> registroNotas;

    public Materia() {
        this.registroNotas = new ArrayList<RegistroNota>();
    }

    public Materia(String nombre, String descripcion, int numeroDeHoras, String colorEnHorario, Curso curso, List<RegistroNota> registroNotas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroDeHoras = numeroDeHoras;
        this.colorEnHorario = colorEnHorario;
        this.curso = curso;
        this.registroNotas = registroNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroDeHoras() {
        return numeroDeHoras;
    }

    public void setNumeroDeHoras(int numeroDeHoras) {
        this.numeroDeHoras = numeroDeHoras;
    }

    public String getColorEnHorario() {
        return colorEnHorario;
    }

    public void setColorEnHorario(String colorEnHorario) {
        this.colorEnHorario = colorEnHorario;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<RegistroNota> getRegistroNotas() {
        return registroNotas;
    }

    public void setRegistroNotas(List<RegistroNota> registroNotas) {
        this.registroNotas = registroNotas;
    }
    

}
