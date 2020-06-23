package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ReciboDePago
 *
 */
@Entity

public class ReciboDePago implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	private Date fechaDePago;
	private double montoDePago;
	@ManyToOne
	@JoinColumn
	private Docente docente;
	public ReciboDePago() {
		
	}
	public ReciboDePago( Date fechaDePago, double montoDePago, Docente docente) {
		super();

		this.fechaDePago = fechaDePago;
		this.montoDePago = montoDePago;
		this.docente = docente;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getFechaDePago() {
		return fechaDePago;
	}
	public void setFechaDePago(Date fechaDePago) {
		this.fechaDePago = fechaDePago;
	}
	public double getMontoDePago() {
		return montoDePago;
	}
	public void setMontoDePago(double montoDePago) {
		this.montoDePago = montoDePago;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
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
		ReciboDePago other = (ReciboDePago) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ReciboDePago [codigo=" + codigo + ", fechaDePago=" + fechaDePago + ", montoDePago=" + montoDePago
				+ ", docente=" + docente + "]";
	}
	
	
	
   
}
