package com.websitethoitrang.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.websitethoitrang.dao.NhanhieuHome;
import com.websitethoitrang.entities.Nhanhieu;

@Component
@Service
public class NhanhieuServices extends NhanhieuHome{
	
	@Autowired
	QueryServices<Nhanhieu> queryNhanhieu;
	
	//get all nhanhieu
	public List<Nhanhieu> getAll(){
		return queryNhanhieu.getAll("Nhanhieu",Nhanhieu.class);
	}
	
}
