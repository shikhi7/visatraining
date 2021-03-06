package com.visa.traininig.jpa.app;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.visa.traininig.jpa.dal.JpaUtil;
import com.visa.traininig.jpa.domain.Account;
import com.visa.traininig.jpa.domain.Address;
import com.visa.traininig.jpa.domain.Customer;
import com.visa.traininig.jpa.domain.SavingsAccount;

public class AssociationTest {
	public static void main(String[] args) {
//		createAccountAndCustomerSeparately();
//		readAccountAlongWithCustomer();
//		createAccountAndCustomerTogether();
//		testLazy();
		testManyToMany();
		System.exit(0);
	}
	
	private static void testManyToMany() {
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        Customer c = new Customer("ffn", "mmn", "lln", new Date(System.currentTimeMillis()));
        Address a = new Address("sl1", "sl2", "blr", "ka", "56", "in");
        c.getAddresses().add(a);
        
        em.persist(c);
        
        tx.commit();
        em.close();
        
    }

	private static void testLazy() {
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        Customer c1 = em.find(Customer.class, 39);
        em.close();
        System.out.println(c1.getFirstname());
        Account a = c1.getAccounts().get(0);
        System.out.println(a.getBalance());
        
        
    }

//	private static void readAccountAlongWithCustomer() {
//		// TODO Auto-generated method stub
//		EntityManager em = JpaUt
//	}

	private static void createAccountAndCustomerSeparately() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Customer c = new Customer("mm","nn","ll", new Date(System.currentTimeMillis()));
		SavingsAccount sa = new SavingsAccount(1234);
		sa.setCustomer(c);
		em.persist(c);
		em.persist(sa);
		
		tx.commit();
		em.close();
	}
	
	private static void createAccountAndCustomerTogether() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Customer c = new Customer("mm","nn","ll", new Date(System.currentTimeMillis()));
		SavingsAccount sa = new SavingsAccount(1234);
		sa.setCustomer(c);
//		em.persist(c);
		em.persist(sa);
		
		tx.commit();
		em.close();
	}
}
