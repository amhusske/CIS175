package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Order;

public class OrderHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ConsoleCoffeeShopOrder");
	
	

	public void	insertOrder(Order O) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(O);
		em.getTransaction().commit();
		em.close();
	};

	public List<Order> showAllOrders(){
		EntityManager em = emfactory.createEntityManager();
		List<Order>	allOrders = em.createQuery("SELECT i FROM Order i").getResultList();
		return allOrders;
	};


	public void delete(Order toDelete){
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Order> typedQuery= em.createQuery("select O from Order O where O.drink = :selectedDrink and O.size = :selectedSize", Order.class);
		typedQuery.setParameter("selectedDrink", toDelete.getDrink());
		typedQuery.setParameter("selectedSize", toDelete.getSize());
		typedQuery.setMaxResults(1);
		Order result = typedQuery.getSingleResult();
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	};
	


public Order searchForItemById(int idToEdit) {
	EntityManager em = emfactory.createEntityManager();
	em.getTransaction().begin();
	Order found = em.find(Order.class, idToEdit);
	em.close();
	return found;
}

public void updateItem(Order toEdit) {
	EntityManager em = emfactory.createEntityManager();
	em.getTransaction().begin();
	em.merge(toEdit);
	em.getTransaction().commit();
	em.close();
	
}

public List<Order> searchForOrderByDrink(String drink) {
	EntityManager em = emfactory.createEntityManager();
	em.getTransaction().begin();
	TypedQuery<Order>typedQuery = em.createQuery("select O from Order O	where O.drink = :selectedDrink",Order.class);
	typedQuery.setParameter("selectedDrink",drink);
	List<Order>foundOrders = typedQuery.getResultList();
	em.close();
	return foundOrders;
}

public List<Order> searchForOrderBySize(String size) {
	// TODO Auto-generated method stub
	EntityManager em = emfactory.createEntityManager();
	em.getTransaction().begin();
	TypedQuery<Order>typedQuery = em.createQuery("select O from Order O where O.size = :selectedSize",Order.class);
	typedQuery.setParameter("selectedSize",size);
	List<Order>foundOrders = typedQuery.getResultList();
	em.close();
	return	foundOrders;
}


public void cleanUp(){
emfactory.close();
}

	

}
