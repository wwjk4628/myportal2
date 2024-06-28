package himedia.myportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.myportal.repositories.vo.PhonebookVo;
import himedia.myportal.services.PhonebookService;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/phonebook")
@Controller
public class PhonebookController {
	
	@Autowired
	PhonebookService phonebookService;
	
	@GetMapping({"", "/", "list"})
	public String list(Model model) {
		List<PhonebookVo> list = phonebookService.getMessageList();
		System.out.println("con" + list);
		model.addAttribute("list", list);
		return "phonebook-views/list";
	}
	
	@GetMapping("/add")
	public String addList() {
		return "phonebook-views/addform";
	}
	
	@PostMapping("/write")
	public String wirte(@ModelAttribute PhonebookVo vo) {
		boolean success = phonebookService.writeMessage(vo);
		return "redirect:/phonebook";
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@ModelAttribute PhonebookVo vo, @PathVariable("id") Long id) {
		vo.setId(id);
		boolean success = phonebookService.deleteMessage(vo);
		return "redirect:/phonebook";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("keyword") String name,  Model model) {
		List<PhonebookVo> list = phonebookService.getSearchList(name);
		 model.addAttribute("list", list);
		 System.out.println(name);
		return "phonebook-views/list";
	}
	
	

}
