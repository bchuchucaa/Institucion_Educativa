/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Duchimaza
 */
public class Nivel implements Serializable{
    private static final long serialVersionUID = 1L;
    private int numeroDeNivel;
    private String nombre;
    private List<Carrera> carreras;
    
    public Nivel(){
        this.carreras = new ArrayList<>();
    }

    public Nivel(int numero, String nombre, List<Carrera> carreras) {
        this.numeroDeNivel = numero;
        this.nombre = nombre;
        this.carreras = carreras;
    }

    public int getNumero() {
        return numeroDeNivel;
    }

    public void setNumero(int numero) {
        this.numeroDeNivel = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    
}
