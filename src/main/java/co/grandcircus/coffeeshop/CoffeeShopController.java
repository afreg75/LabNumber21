package co.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.coffeeshop.CoffeMenu;

@Controller
public class CoffeeShopController {
	
		@Autowired
		CoffeMenu coffemenu;
	
		@RequestMapping("/")
		public ModelAndView index() {
			return new ModelAndView("home");
		}
		
		@RequestMapping("/registration")
		public ModelAndView showRegistrationForm() {
			return new ModelAndView("registration");
		}
		@RequestMapping("/welcome")
		public ModelAndView showWelcome(
				@RequestParam("firstname") String firstname, 
				@RequestParam("lastname") String lastname,
				@RequestParam("email") String email,
				@RequestParam("coffeeList") String coffee,
				@RequestParam("phonenumber") String phonenumber,
				@RequestParam("password") String password,				
				@RequestParam(name = "checkbox" , required = false) boolean checkbox)				
			{
			
			ModelAndView mv = new ModelAndView("welcome");
			mv.addObject("firstname", firstname);
			mv.addObject("lastname", lastname);
			mv.addObject("email", email);
			mv.addObject("favoritecoffee", coffee);
			mv.addObject("phonenumber",  phonenumber);	
			mv.addObject("password", password);
			mv.addObject("checkbox", checkbox);
		
			return mv;
		}
		@RequestMapping("/foods")
		public ModelAndView listFood(@RequestParam(value="category", required=false) String category) {
			ModelAndView mav = new ModelAndView("menulist");
			if (category != null && !category.isEmpty()) {
				mav.addObject("foods", coffemenu.getFoodsInCategory(category));
				mav.addObject("category", category);
			} else {
				mav.addObject("foods", coffemenu.getAllFoods());
			}
			return mav;
		}
	}
		
	
