package com.websitethoitrang.controller.mathang;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websitethoitrang.entities.Mathang;
import com.websitethoitrang.entities.Nhanhieu;
import com.websitethoitrang.services.BanggiaServices;
import com.websitethoitrang.services.MathangServices;
import com.websitethoitrang.services.NhanhieuServices;

@Controller
@RequestMapping("/admin")
public class AddProductController {

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
		
		return "admin/addProduct";
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute("addProduct") Mathang mathang , HttpServletRequest request ) {
		
		HttpSession session = request.getSession();
		
		Nhanhieu nhanhieu = (Nhanhieu) session.getAttribute("nhanhieu");
		mathang.setNhanhieu(nhanhieu);
		mathangService.persist(mathang);
		//Mathang mathang = (Mathang) request.getAttribute("addProduct");
		System.out.println("added mathang :" + mathang.toString());
		return "redirect:addProduct";
	}
}

