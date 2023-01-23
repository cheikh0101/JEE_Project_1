package com.groupeisi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.groupeisi.entities.Comptes;



public class ComptesImpl implements IComptes {
	
	private EntityManager em;
	
	public ComptesImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("suiviStockPU");
		em = emf.createEntityManager();
	}

	@Override
	public int add(Comptes compte) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.persist(compte);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Comptes> getAll() {
		// TODO Auto-generated method stub
		try {
			return em.createQuery("SELECT p FROM Compte p").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int update(Comptes compte) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.merge(compte);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(String ref) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.remove(em.find(Comptes.class, ref));
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Comptes get(String ref) {
		// TODO Auto-generated method stub
		return em.find(Comptes.class, ref);
	}
	
	@Override
	public Comptes logon(String username, String password) {
		try {
			return (Comptes)em.
					createQuery("SELECT u FROM User u WHERE u.email LIKE :em AND u.password LIKE :pass")
					.setParameter("em", username)
					.setParameter("pass", password)
					.getSingleResult();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
