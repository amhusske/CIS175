package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Flower;

public class FlowerHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PartnerProjectWeek6");
	
	public void insertFlower(Flower f) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Flower>showAllFlowers(){
		EntityManager em = emfactory.createEntityManager();
		List<Flower> allFlowers = em.createQuery("SELECT c from flowers c").getResultList();
		return allFlowers;
	}
	
	
}
