package com.websitethoitrang.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.websitethoitrang.services.MathangServices;

@Controller
public class ProductController {
	
	@Autowired
	MathangServices mathangService;
	
	@GetMapping(value = "/product/{maMH}")
	public String product(Model model,  
			@PathVariable("maMH") String maMH) {
		
		model.addAttribute("thisProduct", mathangService.findById(maMH));
		List<String> ids = mathangService.getRecommendation(maMH);
		model.addAttribute("productList",mathangService.getInListID(ids));
		
		return "product/product";
	}
	@PostMapping(value = "/product/review/{maMH}")
	public String review(Model model, @PathVariable("maMH") String maMH, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String userID = (String) session.getAttribute("userID");
		String productID = (String) session.getAttribute("producID");
		String userRating = (String) session.getAttribute("rating");
		String timestamp = (String) session.getAttribute("timestamp");
		try {
			addToDataSet(userID, productID, userRating, timestamp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return product(model,maMH);
	}
	
	//Function
	public void addToDataSet(String userID, String productID, String rating, String timestamp) throws IOException {
		FileWriter pw = new FileWriter("D:\\ThanNgocQuynh\\TNQ_IV_HKI\\PHAT-TRIEN-HE-THONG-THONG-MINH\\Project_Gr\\DemoIntel\\rating_raw.csv",true);
        
        pw.append(userID);
        pw.append(",");
        pw.append(productID);
        pw.append(",");
        pw.append(rating);
        pw.append(",");
        pw.append(timestamp);
        pw.append("\n");
        
        pw.flush();
        pw.close();
	}
}
