package com.websitethoitrang.controller.mathang;



import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.websitethoitrang.entities.Mathang;
import com.websitethoitrang.entities.Nhanhieu;
import com.websitethoitrang.services.BanggiaServices;
import com.websitethoitrang.services.MathangServices;
import com.websitethoitrang.services.NhanhieuServices;

@Controller
@RequestMapping("/admin")
public class AddProductController {
//	private static final Logger logger = LoggerFactory
//			.getLogger(FileUploadController.class);

	@Autowired
	NhanhieuServices nhanhieuService;
	@Autowired
	MathangServices mathangService;
	@Autowired
	BanggiaServices banggiaService;
	
		
	@GetMapping("/addProduct")
	public String addProduct(Model model) {
		
		model.addAttribute("nhanhieus", nhanhieuService.getAll());
		model.addAttribute("productList", mathangService.getAll());
		
		model.addAttribute("pathHinhanhSaved", "rosie0.jpg");
		return "admin/addProduct";
	}
	
//	@PostMapping("/addProduct")
//	public String addProduct(@ModelAttribute("addProduct") Mathang mathang , HttpServletRequest request 
//			, @RequestParam(value = "hinhanh") MultipartFile[] files) {
//		
//		HttpSession session = request.getSession();
//		
//		Nhanhieu nhanhieu = (Nhanhieu) session.getAttribute("nhanhieu");
//		mathang.setNhanhieu(nhanhieu);
//		
//		List<String> photos = new ArrayList<String>();
//		for (MultipartFile file : files) {
//			String fileName = saveImage(file);
//			photos.add(fileName);
//			System.out.println("======image = " + fileName);
//		}
//		
//		
//		//mathangService.persist(mathang);
//		//Mathang mathang = (Mathang) request.getAttribute("addProduct");
//		System.out.println("added mathang :" + mathang.toString());
//		return "redirect:addProduct";
//	}
	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute("addProduct") Mathang mathang , HttpServletRequest request 
			, @RequestParam(value = "hinhanh") MultipartFile[] files) {
		
		HttpSession session = request.getSession();
		
		Nhanhieu nhanhieu = (Nhanhieu) session.getAttribute("nhanhieu");
		mathang.setNhanhieu(nhanhieu);
		
		List<String> photos = new ArrayList<String>();
		for (MultipartFile file : files) {
			String fileName = saveImage(file);
			photos.add(fileName);
			System.out.println("======image = " + fileName);
		}
		
		
		//mathangService.persist(mathang);
		//Mathang mathang = (Mathang) request.getAttribute("addProduct");
		System.out.println("added mathang :" + mathang.toString());
		return "redirect:addProduct";
	}
	
	

	
	
	///
	@Autowired
	ServletContext servletContext;

	private String saveImage(MultipartFile multipartFile) {
		try {
			byte[] bytes = multipartFile.getBytes();
			//save to server
			//Path path = Paths.get(servletContext.getRealPath("/templates/images/" + multipartFile.getOriginalFilename()));
			
			// Save to local
			Path path = Paths.get("D:/ThanNgocQuynh/TNQ_IV_HKI/PHAT-TRIEN-HE-THONG-THONG-MINH/DoAn/WebsiteThoiTrang/src/main/webapp/templates/images/" + multipartFile.getOriginalFilename());
			
			Files.write(path, bytes);
			System.out.println(path + "path image ====================");
			return multipartFile.getOriginalFilename();
		} catch (IOException e) {
			return null;
		}
	}

	
}

