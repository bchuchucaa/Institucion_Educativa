package ec.edu.ups.jpa;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.DocenteDAO;
import ec.edu.ups.dao.ReciboDePagoDAO;
import ec.edu.ups.dao.TituloDAO;

public class JPADAOFactory  extends DAOFactory{

	@Override
	public DocenteDAO getDocenteDAO() {
		// TODO Auto-generated method stub
		return new JPADocenteDAO();
	}

	@Override
	public TituloDAO getTituloDAO() {
		// TODO Auto-generated method stub
		return new JPATituloDAO();
	}

	@Override
	public ReciboDePagoDAO getReciboDePagoDAO() {
		// TODO Auto-generated method stub
		return new JPAReciboDePagoDAO();
	}

	


}
