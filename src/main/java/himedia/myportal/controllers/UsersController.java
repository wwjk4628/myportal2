package himedia.myportal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.myportal.repositories.vo.UserVo;
import himedia.myportal.services.UserService;

@RequestMapping("/users")
@Controller
public class UsersController {
	@Autowired
	private UserService userService;
	
	//	가입 폼
	@GetMapping({"", "/", "/join"})
	public String join() {
		return "users/joinform";
	}
	
	//	가입 처리(액션)
	@PostMapping("/join")
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("회원 가입 폼: " + userVo);
		
		boolean success = userService.join(userVo);
		if (success) { //	가입 성공
			//	가입 성공 페이지로 리다이렉트
			System.out.println("회원 가입 성공");
			return "redirect:/users/joinsuccess";
		} else {
			//	다시 가입 폼으로
			System.err.println("회원 가입 실패");
			return "redirect:/users/join";
		}
	}
	
	//	가입 성공 페이지 
	@RequestMapping("/joinsuccess")
	public String joinSuccess() {
		return "users/joinsuccess";
	}
}
