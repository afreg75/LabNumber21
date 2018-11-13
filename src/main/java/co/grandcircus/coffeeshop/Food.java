package co.grandcircus.coffeeshop;

public class Food {
	
	private Long id;
	private String name;
	private String category;
	private String qty;
	private String price;
	private String description;
	

	public Food() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public String getQty() {
		return qty;
	}


	public void setQty(String qty) {
		this.qty = qty;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", category=" + category + ", qty=" + qty + ", price=" + price
				+ ", description=" + description + "]";
	}


	public Food(Long id, String name, String category, String qty, String price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.qty = qty;
		this.price = price;
		this.description = description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}