package co.grandcircus.coffeeshop;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import co.grandcircus.coffeeshop.User;


// Pretending to be a DAO for convenience, but really just keeps the data in a map. In a real app, use a real DAO.
@Component
public class UserDaoMemory {

	private Map<Long, User> users = new HashMap<>();
	private long nextId = 1;
	
		
	public User findById(Long id) {
		return users.get(id);
	}
	
	public User findByUsername(String username) {
		return users.values().stream().filter(user -> username.equals(user.getUsername())).findAny().orElse(null);
	}
	
		public void create(User user) {
		user.setId(nextId++);
		users.put(user.getId(), user);
	}
	
	public void update(User user) {
		users.put(user.getId(), user);
	}
}
