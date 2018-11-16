package co.grandcircus.coffeeshop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="cart_item")
public class CartItem {
//	these two go together
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer quantity;
	
	@ManyToOne
	private MenuItem menuItem;
	
	CartItem(){}

	public Long getId() {
		return id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CartItem(Long id, Integer quantity, MenuItem menuItem) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.menuItem = menuItem;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", quantity=" + quantity + ", menuItem=" + menuItem + "]";
	}
}

	
