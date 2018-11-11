package co.grandcircus.coffeeshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

@Component
public class CoffeMenu {
	
	private static List<Food> list = new ArrayList<>();
	
	public CoffeMenu() {
		list.add(new Food("French Vanilla", "US", "$5.50", "Vanilla Flavored."));
		list.add(new Food("Dark", "$4.50", "Colombian", "Strong coffee."));
		list.add(new Food("Decaf", "$3.50", "Brazil", "Not sure why you drink it."));
	}
	
	public List<Food> getAllFoods() {
		return list;
	}
	
		public List<Food> getFoodsInCategory(String category) {
		List<Food> matches = new ArrayList<>();
		for(Food food : list) {
			if (food.getCategory().equalsIgnoreCase(category)) {
				matches.add(food);
			}
		}
		return matches;
	}
	
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
	
	public Set<String> getName() {
		Set<String> name = new TreeSet<>();
		for(Food food : list) {
			name.add(food.getName());
		}
		return name;
	}
	
	public void addFood(Food food) {
		list.add(food);
	}
		

}
