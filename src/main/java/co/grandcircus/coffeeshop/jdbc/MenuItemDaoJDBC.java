package co.grandcircus.coffeeshop.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeshop.Food;


@Repository
public class MenuItemDaoJDBC {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public List<Food> findAll() {
		
		return jdbctemplate.query("SELECT * FROM menu_item", new BeanPropertyRowMapper<>(Food.class));
	}
}
