package co.grandcircus.coffeeshop;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class CookieController {
	
	@RequestMapping("/clear")
	public String clear(HttpServletResponse response) {
		// Clear cookie
		Cookie cookie = new Cookie("count", "");
		cookie.setMaxAge(0); // the only way to remove a cookie: set it's lifespan to 0
		response.addCookie(cookie);
		
		return "redirect:/";
	}

}
