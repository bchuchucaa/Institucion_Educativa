/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_matricula;

import java.io.Serializable;

/**
 *
 * @author enriq
 */
public class TipoMatricula implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private String descripcion;
    private String descuento;

    public TipoMatricula() {
    }

    public TipoMatricula(String nombre, String descripcion, String descuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.descuento = descuento;
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

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

}
