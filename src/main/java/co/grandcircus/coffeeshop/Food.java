package co.grandcircus.coffeeshop;

public class Food {
	
	private String name;
	private String price;
	private String description;
	private String category;
	
	
	public Food() {}

	public String getName() {
		return name;
	}

	public Food(String category) {
		super();
		this.category = category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public Food(String name, String category, String price, String description) {
		super();
		this.name = name;
		this.category= category;
		this.price = price;
		this.description = description;
		
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


}
