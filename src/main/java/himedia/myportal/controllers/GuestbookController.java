package himedia.myportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import himedia.myportal.repositories.vo.GuestbookVo;
import himedia.myportal.services.GuestbookService;

@RequestMapping("/guestbook")
@Controller
public class GuestbookController {
	@Autowired
	GuestbookService guestbookService;
	
	@ResponseBody
	@RequestMapping({"", "/", "/list"})
	public String list() {
		List<GuestbookVo> list = guestbookService.getMessageList();
		return list.toString();
	}
}
