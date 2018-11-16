package co.grandcircus.coffeeshop;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UserController {
	
	@RequestMapping("/edit-profile")
	public ModelAndView showEditProfile(@SessionAttribute(name="profile", required=false) User user) {
		return new ModelAndView("edit-profile", "user", user);
	}
	
	@PostMapping("/edit-profile")
	public ModelAndView submitEditProfile(User user, HttpSession session) {
		session.setAttribute("user", user);
		ModelAndView mav = new ModelAndView("redirect:/");
		return mav;
	}
}

