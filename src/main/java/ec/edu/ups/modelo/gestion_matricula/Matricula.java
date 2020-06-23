/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.gestion_matricula;

import ec.edu.ups.modelo.Estudiante;
import ec.edu.ups.modelo.Nivel;
import ec.edu.ups.modelo.gestion_matricula.TipoMatricula;
import ec.edu.ups.modelo.pagos.PagoMensual;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author enriq
 */
public class Matricula implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date fecha;
    private String periodoLectivo;
    private String estadoAprobacionAnio;
    private Estudiante estudiante;
    private TipoMatricula tipoMatricula;
    private Nivel nivel;
    private List<PagoMensual> pagos;

    public Matricula() {
    }

    public Matricula(Date fecha, String periodoLectivo, Estudiante estudiante, TipoMatricula tipoMatricula, List<PagoMensual> pagos) {
        this.fecha = fecha;
        this.periodoLectivo = periodoLectivo;
        this.estudiante = estudiante;
        this.tipoMatricula = tipoMatricula;
        this.pagos = pagos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPeriodoLectivo() {
        return periodoLectivo;
    }

    public void setPeriodoLectivo(String periodoLectivo) {
        this.periodoLectivo = periodoLectivo;
    }

    public String getEstadoAprobacionAnio() {
        return estadoAprobacionAnio;
    }

    public void setEstadoAprobacionAnio(String estadoAprobacionAnio) {
        this.estadoAprobacionAnio = estadoAprobacionAnio;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public TipoMatricula getTipoMatricula() {
        return tipoMatricula;
    }

    public void setTipoMatricula(TipoMatricula tipoMatricula) {
        this.tipoMatricula = tipoMatricula;
    }

    public List<PagoMensual> getPagos() {
        return pagos;
    }

    public void setPagos(List<PagoMensual> pagos) {
        this.pagos = pagos;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    
}
