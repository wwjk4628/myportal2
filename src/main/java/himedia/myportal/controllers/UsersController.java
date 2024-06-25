package himedia.myportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
public class UsersController {
	@GetMapping({"", "/", "/join"})
	public String join() {
		return "users/joinform";
	}
}
