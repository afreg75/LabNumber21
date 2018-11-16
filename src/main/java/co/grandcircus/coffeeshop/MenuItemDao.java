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

	public List<MenuItem> findAll() {
		// The SELECT clause is optional in HQL. If omitted, it's basically SELECT *.
		// When creating a a query specify the type of the results: Food.class
		// HQL queries use Java class and property names, not SQL table & column names.
		return em.createQuery("FROM MenuItem", MenuItem.class).getResultList();
	}

	public void createFood(MenuItem food) {
		em.persist(food);
	}
	
		public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		MenuItem food = em.getReference(MenuItem.class, id);
		em.remove(food);
	}
		public MenuItem findById(Long id) {
			return em.find(MenuItem.class, id);
		}
		
		public void update(MenuItem food) {
			em.merge(food);
		}
		
//		public MenuItem findByCategory(String category) {
//			return em.find(MenuItem.class, findByCategory(category));
//		}
		
		public List<MenuItem> findByCategory(String category) {
			// HQL queries can have named parameters, such as :regex here.
			// HQL queries use Java class and property names, not SQL table & column names.
			return em.createQuery("FROM Food WHERE category = :category", MenuItem.class)
					.setParameter("category", category)
					.getResultList();
		}
		
		public Object findByNameContainingIgnoreCase(String keyword) {
			// TODO Auto-generated method stub
			return null;
		}

		public Object findAllCategories() {
			// TODO Auto-generated method stub
			return null;
		}
}
