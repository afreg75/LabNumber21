package co.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CoffeeShopController {
	
		@Autowired
		private MenuItemDao menuItemDao;
		
		@Autowired 
		private UserDao userDao;
		
		@Autowired
		private CartItemDao cartItemDao;
		
		@RequestMapping("/")
		public ModelAndView index() {
			return new ModelAndView("login");
		}
	
		@RequestMapping("/home")
		public ModelAndView showHome() {
			return new ModelAndView("home");
		}
		
		@RequestMapping("/registration")
		public ModelAndView showRegistrationForm() {
			return new ModelAndView("registration");
		}
		
		@RequestMapping("/admin/menulist")
		public ModelAndView showAdminForm() {
			ModelAndView mav = new ModelAndView("admin-menu-list");
				mav.addObject("list", menuItemDao.findAll());
				return mav;
			}
		@RequestMapping("/menuitems/add")
		public ModelAndView showItem(MenuItem food) {
			ModelAndView mav = new ModelAndView("admin-menu-list");
			menuItemDao.createFood(food);
				mav.addObject("list", menuItemDao.findAll());
				return mav;
			}
			
		@RequestMapping("add-coffee")
		public ModelAndView showAddForm() {
		ModelAndView mav = new ModelAndView("addmenuitem");
				return mav;
		}
			
		
		@RequestMapping("/welcome")
		public ModelAndView showWelcome(
				@RequestParam("firstname") String firstname, 
				@RequestParam("lastname") String lastname,
				@RequestParam("email") String email,
				@RequestParam("phonenumber") String phonenumber,
				@RequestParam("age")int age,
				@RequestParam("username") String username,
				@RequestParam("password") String password,
				@RequestParam(name = "checkbox" , required = false) boolean mail,
				@RequestParam("coffeeList") String favCoffee)				
			{
			Long id = null;
			User user = new User(id,  firstname,  lastname,  email,  phonenumber,  age,
					username, password, mail,favCoffee);
			ModelAndView mv = new ModelAndView("welcome");
			mv.addObject("firstname", firstname);
			mv.addObject("lastname", lastname);
			mv.addObject("email", email);
			mv.addObject("favoritecoffee", favCoffee);
			mv.addObject("phonenumber",  phonenumber);	
			mv.addObject("age", age);
			mv.addObject("username", username);
			mv.addObject("password", password);
			mv.addObject("mail", mail);
			
			userDao.createUser(user);
		
			return mv;
		}
		@RequestMapping("/menulist")
		public ModelAndView listFood() {
			ModelAndView mav = new ModelAndView("menu-list");
					mav.addObject("list", menuItemDao.findAll());
					return mav;
		}
		
		@RequestMapping("/menulist/category")
	
		public ModelAndView listFood(
				@RequestParam(value="keyword", required=false) String keyword,
				@RequestParam(value="category", required=false) String category) {
			ModelAndView mav = new ModelAndView("menu-list");
			if (keyword != null && !keyword.isEmpty()) {
				mav.addObject("foods", menuItemDao.findByNameContainingIgnoreCase(keyword));
			} else if (category != null && !category.isEmpty()) {
				mav.addObject("foods", menuItemDao.findByCategory(category));
			} else {
				mav.addObject("foods", menuItemDao.findAll());
			}
			// list of categories needed for <select>
			mav.addObject("categories", menuItemDao.findAllCategories());
			return mav;
		}
		
		@RequestMapping("/menuitems/delete")
		public ModelAndView delete(@RequestParam("id") Long id) {
			ModelAndView mav = new ModelAndView("admin-menu-list");
			menuItemDao.delete(id);
			mav.addObject("list", menuItemDao.findAll());
			return mav;
		}
		
		@RequestMapping("/food/update")
		public ModelAndView showEditForm(@RequestParam("id") Long id) {
			ModelAndView mav = new ModelAndView("editmenuitem");
			mav.addObject("menuitem", menuItemDao.findById(id));
			mav.addObject("title", "Edit Food");
			return mav;
		}
		
		@RequestMapping(value="/food/update", method=RequestMethod.POST)
		public ModelAndView submitEditForm(MenuItem food) {
			menuItemDao.update(food);
			return new ModelAndView("redirect:/admin/menulist");
		}
		
	}
