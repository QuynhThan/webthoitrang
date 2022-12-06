package com.websitethoitrang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websitethoitrang.entities.Khachhang;
import com.websitethoitrang.services.KhachHangServices;
import com.websitethoitrang.services.QueryServices;

@Controller
@RequestMapping
public class TestController {
	
	@Autowired
	KhachHangServices khachhangService;
	
	@Autowired
	QueryServices<Khachhang> queryKhachhangService;
	
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("khachhang", khachhangService.findById("KH1"));
		model.addAttribute("listKhachhang", khachhangService.getAllKhachhang());
		return "test";
	}
	@GetMapping("/test1")
	public String test1(Model model) {
		model.addAttribute("khachhang", khachhangService.findById("KH1"));
		model.addAttribute("listKhachhang", queryKhachhangService.getAll("Khachhang",Khachhang.class));
		return "test1";
	}
}
