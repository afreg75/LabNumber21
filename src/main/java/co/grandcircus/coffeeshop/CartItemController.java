package co.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartItemController {

	@Autowired
	private CartItemDao cartItemDao;

	@Autowired
	private MenuItemDao menuItemDao;
	
		@RequestMapping("/mycart")
		public ModelAndView showCart() {
		ModelAndView mav = new ModelAndView("cart");
		mav.addObject("list", cartItemDao.findAll());
		return mav;
	
	}
		@RequestMapping("/mycart/delete")
		public ModelAndView delete(@RequestParam("id") Long id) {
				cartItemDao.delete(id);
					return new ModelAndView("redirect:/mycart");
		}
		
		@RequestMapping("/add-to-cart")
		public ModelAndView addToCart(@RequestParam("id") Long menuItemId) {
		  MenuItem m = menuItemDao.findById(menuItemId);
		  CartItem c = new CartItem();
		  c.setQuantity(1);
		  c.setMenuItem(m);
		  cartItemDao.create(c);
		  return new ModelAndView("redirect:/cart");
		}

}
