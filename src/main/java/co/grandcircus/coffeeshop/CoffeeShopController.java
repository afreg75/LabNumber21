package co.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CoffeeShopController {
	
		@Autowired
		private MenuItemDao menuItemDao;
		
		@Autowired 
		private UserDao userDao;
		
	
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
				@RequestParam("phonenumber") String phonenumber,
				@RequestParam("age")int age,
				@RequestParam("password") String password,
				@RequestParam(name = "checkbox" , required = false) boolean mail,
				@RequestParam("coffeeList") String favCoffee)				
			{
			Long id = null;
			User user = new User(id,  firstname,  lastname,  email,  phonenumber,  age,
					password, mail,favCoffee);
			ModelAndView mv = new ModelAndView("welcome");
			mv.addObject("firstname", firstname);
			mv.addObject("lastname", lastname);
			mv.addObject("email", email);
			mv.addObject("favoritecoffee", favCoffee);
			mv.addObject("phonenumber",  phonenumber);	
			mv.addObject("age", age);
			mv.addObject("password", password);
			mv.addObject("mail", mail);
			
			userDao.create(user);
		
			return mv;
		}
		@RequestMapping("/menulist")
		public ModelAndView listFood() {
			ModelAndView mav = new ModelAndView("menu-list");
					mav.addObject("list", menuItemDao.findAll());
					return mav;
		}
	}
		
	
