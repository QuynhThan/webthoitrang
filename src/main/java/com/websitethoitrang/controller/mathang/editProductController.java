package com.websitethoitrang.controller.mathang;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.cj.Session;
import com.websitethoitrang.entities.Mathang;
import com.websitethoitrang.entities.Nhanhieu;
import com.websitethoitrang.services.MathangServices;
import com.websitethoitrang.services.NhanhieuServices;

@Controller
@RequestMapping("/admin")
public class editProductController {

	@Autowired
	MathangServices mathangService;
	@Autowired
	NhanhieuServices nhanhieuService;
	
	@GetMapping("edit-product")
	public String editProduct(Model model) {
		
		
		model.addAttribute("productList", mathangService.getAll());
		
		return "admin/editProduct";
	}
	
	@GetMapping("edit-product/{maMH}")
	public String editProduct(Model model, HttpServletRequest request,
					@PathVariable("maMH") String mamh) {
		Mathang mathangGet = mathangService.findById(mamh);
		if(mathangGet == null) {
			return "redirect:/admin/edit-product";
		}
		model.addAttribute("productEditing", mathangService.findById(mamh));
		model.addAttribute("productList", mathangService.getAll());
		model.addAttribute("nhanhieus", nhanhieuService.getAll());
		System.out.println("mathang editing == Túi xách tũi " + mathangGet.getMamh());
		
		return "admin/editProduct";
	}
	
	@PostMapping(value = "edit-product/{maMH}")
	public String editProduct(Model model, HttpServletRequest request,
					@ModelAttribute("producEditing") Mathang mathangEditing) {
		
		HttpSession session = request.getSession();
		Nhanhieu nhanhieu = (Nhanhieu) session.getAttribute("nhanhieu");
		mathangEditing.setNhanhieu(nhanhieu);
		
		System.out.println(mathangEditing.toString() + "=========================/");
		
		Mathang result = mathangService.merge(mathangEditing);
		
		model.addAttribute("message", result.equals(mathangService) == true ? "Edit successfully" : "Edit failed");
		
		return editProduct(model);
	}
	
}
