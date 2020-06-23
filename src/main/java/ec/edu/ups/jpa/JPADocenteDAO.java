package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.DocenteDAO;
import ec.edu.ups.entidad.Docente;

public class JPADocenteDAO extends JPAGenericDAO<Docente, Integer>  implements DocenteDAO{

	public JPADocenteDAO() {
		super(Docente.class);
		// TODO Auto-generated constructor stub
	}

	
	
}
