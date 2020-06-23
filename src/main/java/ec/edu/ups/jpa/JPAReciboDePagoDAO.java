package ec.edu.ups.jpa;

import ec.edu.ups.dao.ReciboDePagoDAO;
import ec.edu.ups.entidad.ReciboDePago;

public class JPAReciboDePagoDAO extends JPAGenericDAO<ReciboDePago, Integer> implements ReciboDePagoDAO{

	public JPAReciboDePagoDAO() {
		super(ReciboDePago.class);
		// TODO Auto-generated constructor stub
	}

}
