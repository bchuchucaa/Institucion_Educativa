package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Docente
 *
 */
@Entity

public class Docente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	private double sueldo;
	private Date fechaDeRegistro;
	@OneToMany(cascade= CascadeType.ALL,mappedBy = "docente",orphanRemoval=true)
	private List<Titulo> titulos;
	@OneToMany(cascade= CascadeType.ALL,mappedBy = "docente",orphanRemoval=true)
	private List<ReciboDePago> recibosDePagos;
	
	public Docente() {
		this.titulos= new ArrayList<Titulo>();
		this.recibosDePagos = new ArrayList<ReciboDePago>();
	}
	 public Docente(double sueldo, Date fechaDeRegistro, List<Titulo> titulos, List<ReciboDePago> recibosDePagos) {
	        this.sueldo = sueldo;
	        this.fechaDeRegistro = fechaDeRegistro;
	        this.titulos = titulos;
	        this.recibosDePagos = recibosDePagos;
	    }
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Date getFechaDeRegistro() {
		return fechaDeRegistro;
	}
	public void setFechaDeRegistro(Date fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}
	public List<Titulo> getTitulos() {
		return titulos;
	}
	public void setTitulos(List<Titulo> titulos) {
		this.titulos = titulos;
	}
	public List<ReciboDePago> getRecibosDePagos() {
		return recibosDePagos;
	}
	public void setRecibosDePagos(List<ReciboDePago> recibosDePagos) {
		this.recibosDePagos = recibosDePagos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Docente other = (Docente) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Docente [codigo=" + codigo + ", sueldo=" + sueldo + ", fechaDeRegistro=" + fechaDeRegistro
				+ ", titulos=" + titulos + ", recibosDePagos=" + recibosDePagos + "]";
	}
	    
	    
	    
}
