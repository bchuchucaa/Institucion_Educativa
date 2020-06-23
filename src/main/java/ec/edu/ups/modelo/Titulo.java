/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 *
 * @author claum
 */
public class Titulo implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombreDeTitulo;
    private String anioDeTitulacion;

    public Titulo() {
    }

    public Titulo(String nombreDeTitulo, String anioDeTitulacion) {
        this.nombreDeTitulo = nombreDeTitulo;
        this.anioDeTitulacion = anioDeTitulacion;
    }

    public String getNombreDeTitulo() {
        return nombreDeTitulo;
    }

    public void setNombreDeTitulo(String nombreDeTitulo) {
        this.nombreDeTitulo = nombreDeTitulo;
    }

    public String getAnioDeTitulacion() {
        return anioDeTitulacion;
    }

    public void setAnioDeTitulacion(String anioDeTitulacion) {
        this.anioDeTitulacion = anioDeTitulacion;
    }
    
    
}
