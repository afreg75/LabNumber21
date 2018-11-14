package co.grandcircus.coffeeshop;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
//DAOs must be transactional in order to use the EntityManager to write.
//This means that a transaction is created every time a method runs here.
@Transactional

public class MenuItemDao {
	@PersistenceContext
	private EntityManager em;

	public List<Food> findAll() {
		// The SELECT clause is optional in HQL. If omitted, it's basically SELECT *.
		// When creating a a query specify the type of the results: Food.class
		// HQL queries use Java class and property names, not SQL table & column names.
		return em.createQuery("FROM Food", Food.class).getResultList();
	}

	public void createFood(Food food) {
		em.persist(food);
	}
	
		public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		Food food = em.getReference(Food.class, id);
		em.remove(food);
	}
		public Food findById(Long id) {
			return em.find(Food.class, id);
		}
		
		public void update(Food food) {
			em.merge(food);
		}
}
