package ec.edu.ups.jpa;

import ec.edu.ups.dao.TituloDAO;
import ec.edu.ups.entidad.Titulo;

public class JPATituloDAO extends JPAGenericDAO<Titulo, Integer> implements TituloDAO{

	public JPATituloDAO() {
		super(Titulo.class);
		// TODO Auto-generated constructor stub
	}

}
