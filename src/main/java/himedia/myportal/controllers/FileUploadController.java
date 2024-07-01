package himedia.myportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import himedia.myportal.repositories.vo.FileVo;
import himedia.myportal.services.FileUploadService;

@Controller
@RequestMapping("fileupload")
public class FileUploadController {

	@Autowired
	FileUploadService fileUploadService;

//	업로드 폼
	@RequestMapping({ "", "/form" })
	public String uploadform() {

		return "fileupload/form";
	}

//	업로드 액
	@PostMapping("/upload")
	public String upload(@RequestParam("file1") MultipartFile file1, Model model) {
		System.out.println("원본 " + file1.getOriginalFilename());
		System.out.println("파일사이즈 " + file1.getSize());
		System.out.println("파라미터 이름: " + file1.getName());
		
//		실제 파일로 저장
		String saveFilename = fileUploadService.store(file1);
		model.addAttribute("imgFilename", saveFilename);
		
		return "fileupload/result";
	}
	
	@GetMapping("/list")
	public String view(Model model) {
		List<FileVo> list = fileUploadService.getMessageList();
		System.out.println("con" + list);
		model.addAttribute("list", list);
		return "fileupload/list";
	}

}
