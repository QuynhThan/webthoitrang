package com.websitethoitrang.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.websitethoitrang.dao.MathangHome;
import com.websitethoitrang.entities.Mathang;
import com.websitethoitrang.entities.Nhanhieu;

@Component
@Service
public class MathangServices extends MathangHome {
	
	@Autowired
	QueryServices<Mathang> queryMathang;
	
	public List<Mathang> getAll(){
		return queryMathang.getAll("Mathang", Mathang.class);
	}
	
}
