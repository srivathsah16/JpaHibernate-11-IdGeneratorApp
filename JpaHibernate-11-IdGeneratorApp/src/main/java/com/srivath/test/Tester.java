package com.srivath.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srivath.entities.DemoEntity;

public class Tester {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction txn = manager.getTransaction();
		DemoEntity demo = new DemoEntity();
		demo.setName("B");
		txn.begin();
		manager.persist(demo);
		txn.commit();
		manager.close();
		factory.close();
	}

}
