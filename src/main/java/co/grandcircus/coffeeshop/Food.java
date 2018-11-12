package co.grandcircus.coffeeshop;

public class Food {
	
	private String name;
	private String category;
	private String price;
	private String description;
	
	public Food(String price) {
		super();
		this.price = price;
	}

	
	
	public Food() {}
	
	public Food(String name, String category, String price, String description) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", category=" + category + "]";
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}