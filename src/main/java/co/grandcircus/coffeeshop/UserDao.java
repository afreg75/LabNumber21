package co.grandcircus.coffeeshop;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



@Repository
//DAOs must be transactional in order to use the EntityManager to write.
//This means that a transaction is created every time a method runs here.
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public User findById(Long id) {
		return em.find(User.class, id);
	}
	
	public User findByUsername(String username) {
		try {
			return em.createQuery("FROM User WHERE username = :username", User.class)
					.setParameter("username", username)
					.getSingleResult();
		} catch (NoResultException ex) {
			// No user with that username found.
			return null;
		}
	}
	public User findByGithubId(Long githubId) {
		try {
			return em.createQuery("FROM User WHERE githubId = :githubId", User.class)
					.setParameter("githubId", githubId)
					.getSingleResult();
		} catch (NoResultException ex) {
			// No user with that githubId found.
			return null;
		}
	}	

	public void createUser(User user) {
		em.persist(user);
	}
	public void update(User user) {
		em.merge(user);
	}

}
