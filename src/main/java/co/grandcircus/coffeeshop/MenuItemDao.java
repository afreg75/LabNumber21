package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class MenuItemDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public List<Food> findAll() {
		
		return jdbctemplate.query("SELECT * FROM menu_item", new BeanPropertyRowMapper<>(Food.class));
	}
}
