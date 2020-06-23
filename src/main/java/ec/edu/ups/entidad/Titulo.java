package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Titulo
 *
 */
@Entity

public class Titulo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	private String nombreDeTitulo;
	private String anioDeTitulacion;
	@ManyToOne
	@JoinColumn
	private Docente docente;
	
	public Titulo() {
		
	}
	

	public Titulo(int codigo, String nombreDeTitulo, String anioDeTitulacion, Docente docente) {
		super();
		this.codigo = codigo;
		this.nombreDeTitulo = nombreDeTitulo;
		this.anioDeTitulacion = anioDeTitulacion;
		this.docente = docente;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}


	@Override
	public String toString() {
		return "Titulo [codigo=" + codigo + ", nombreDeTitulo=" + nombreDeTitulo + ", anioDeTitulacion="
				+ anioDeTitulacion + ", docente=" + docente + "]";
	}
   
	
}
