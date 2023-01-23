package com.groupeisi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.groupeisi.entities.Comptes;
import com.groupeisi.entities.Droits;

public class DroitsImpl implements IDroits {

	private EntityManager em;
	
	public DroitsImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("suiviStockPU");
		em = emf.createEntityManager();
	}

	@Override
	public int add(Droits droit) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.persist(droit);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Droits> getAll() {
		// TODO Auto-generated method stub
		try {
			return em.createQuery("SELECT p FROM Droits p").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int update(Droits droit) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.merge(droit);
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
			em.remove(em.find(Droits.class, ref));
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Droits get(String ref) {
		// TODO Auto-generated method stub
		return em.find(Droits.class, ref);
	}

}
