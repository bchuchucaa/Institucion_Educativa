/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Duchimaza
 */
public class Carrera {
    
    private String nombre;
    private String descripcion;
    private Nivel nivel;
    private List<Curso> cursos;
    
    public Carrera(){
        this.cursos = new ArrayList<>();
    }

    public Carrera(String nombre, String descripcion, Nivel nivel, List<Curso> cursos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.cursos = cursos;
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

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    
}
