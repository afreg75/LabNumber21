package co.grandcircus.coffeeshop;

public class MenuItem {
	
	private String name;
	private String description;
	private Integer price;
	
	public MenuItem() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public MenuItem(String name, String description, Integer price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	

}
