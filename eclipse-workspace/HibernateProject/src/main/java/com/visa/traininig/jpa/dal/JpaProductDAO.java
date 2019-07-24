package com.visa.traininig.jpa.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.visa.traininig.jpa.domain.Product;

public class JpaProductDAO {
	
	public Product save (Product p) {
		EntityManagerFactory emf = JpaUtil.getEmf();
		EntityManager em = emf.createEntityManager();
		try{
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(p);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return p;
	}
	
	public Product findById(int id) {
		EntityManagerFactory emf = JpaUtil.getEmf();
		EntityManager em = emf.createEntityManager();
		try {
			Product p = em.find(Product.class, id);
			return p;
		} finally {
			em.close();
		}
	}
	
	public void removeById(int id) {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Product p = findById(id);
		try {
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			if (p!=null) {
				em.remove(p);
			}
			tx.commit();
		} finally {
			em.close();
		}
	}
	
	public List<Product> findAll(){
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Query q = em.createQuery("select p from Product as p");
		List<Product> all = q.getResultList();
		em.close();
		return all;
	}
	
	public void update(Product detached) {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(detached);
		tx.commit();
		em.close();
	}
	
}
