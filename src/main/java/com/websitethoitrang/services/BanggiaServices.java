package com.websitethoitrang.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.websitethoitrang.dao.BanggiaHome;
import com.websitethoitrang.entities.Banggia;

@Component
@Service
public class BanggiaServices extends BanggiaHome{
	
	@Autowired
	QueryServices<Banggia> queryBanggia;
	
	public List<Banggia> getAll(){
		return queryBanggia.getAll("Banggia", Banggia.class);
	}
	
	
}
