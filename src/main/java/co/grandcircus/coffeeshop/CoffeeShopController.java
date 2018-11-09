package co.grandcircus.coffeeshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {
	
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
				@RequestParam(name = "checkbox" , required = false) boolean checkbox)				
		{
			
			ModelAndView mv = new ModelAndView("welcome");
			mv.addObject("firstname", firstname);
			mv.addObject("lastname", lastname);
			mv.addObject("email", email);
			mv.addObject("favoritecoffee", coffee);
			mv.addObject("phonenumber",  phonenumber);			
			mv.addObject("checkbox", checkbox);
		
			
			
						return mv;
		}
		
	}