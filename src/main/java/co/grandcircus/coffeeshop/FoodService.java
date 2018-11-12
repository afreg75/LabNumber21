package co.grandcircus.coffeeshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

// The @Component annotation makes this is a singleton Spring Bean,
// created and managed by Spring. (Alternatively, could use @Service)
@Component
public class FoodService {
	
	private List<Food> list = new ArrayList<>();
	
	public FoodService() {
		list.add(new Food("French Vanilla", "US", "$5.50", "Vanilla Flavored."));
		list.add(new Food("Dark", "Colombian", "$4.50", "Strong coffee."));
		list.add(new Food("Decaf",  "Brazil","$3.50", "Not sure why you drink it."));
	}
	
	/**
	 * Get list of all foods.
	 */
	public List<Food> getAllFoods() {
		return list;
	}
	
	/**
	 * Get list of foods in a given category.
	 */
	public List<Food> getFoodsInCategory(String category) {
		List<Food> matches = new ArrayList<>();
		for(Food food : list) {
			if (food.getCategory().equalsIgnoreCase(category)) {
				matches.add(food);
			}
		}
		return matches;
	}
	
	/**
	 * Get list of food with name matching a keyword.
	 */
	public List<Food> getFoodsByKeyword(String keyword) {
		keyword = keyword.toLowerCase();
		List<Food> matches = new ArrayList<>();
		for(Food food : list) {
			if (food.getName().toLowerCase().contains(keyword)) {
				matches.add(food);
			}
		}
		return matches;
	}
	
	/**
	 * Get set of food categories.
	 */
	public Set<String> getCategories() {
		Set<String> categories = new TreeSet<>();
		for(Food food : list) {
			categories.add(food.getCategory());
		}
		return categories;
	}

	/**
	 * Add a food to the list
	 */
	public void addFood(Food food) {
		list.add(food);
	}
}