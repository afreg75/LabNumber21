package co.grandcircus.coffeeshop.jdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeshop.User;

@Repository
public class UserDaoJDBC {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public void create(User user) {
		
		String sql = "INSERT INTO user (id, firstname, lastname, email, phonenumber, age, password, mail, favcoffee) VALUES (?,?,?,?,?,?,?,?,?)";
		jdbctemplate.update(sql, user.getId(),user.getFirstname(), user.getLastname(), user.getEmail(), 
				user.getPhonenumber(), user.getAge(), user.getPassword(), user.isMail(), user.getFavCoffee());
		
	}

}
