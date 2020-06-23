package ec.edu.ups.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ec.edu.ups.dao.GenericDAO;



public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID>{

	private Class<T> persistentClass;
	protected EntityManager em;
	
	public JPAGenericDAO(Class<T> persistentClass) {
		this.persistentClass= persistentClass;
		this.em= Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
	
	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
			System.out.println("La entidad se ah creado correctamente! ");
		}catch (Exception e) {
			System.out.println(">>>ERROR: JPAGenericDAO: create "+ e);
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
		
	}

	@Override
	public T read(ID id) {
		
		return em.find(persistentClass, id);
		
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.getTransaction().commit();
		try {
			
		}catch (Exception e) {
			 System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
			    if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.remove(entity);
		}catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:delete "+ e);
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
	}



	@Override
	public List<T> read() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
