package com.websitethoitrang.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.websitethoitrang.criteria.KhachhangCriterias;
import com.websitethoitrang.dao.KhachhangHome;
import com.websitethoitrang.entities.Khachhang;

@Component
@Service
public class KhachHangServices extends KhachhangHome {
	
	@Autowired
	KhachhangCriterias khachhangCriterias;
	
	@Autowired
	SessionFactory factory;

//	
//	@Autowired
//	KhachHangDao khachhangDao;

	//get khachhang by id
	public Khachhang getKhachhang(String makh) {
		return super.findById(makh);
	}

	
	//get all khachhang 
	public List<Khachhang> getAllKhachhang(){
		Session session=factory.openSession();
    	String hql="From Khachhang";
    	
		return session.createQuery(hql,Khachhang.class).getResultList();
	}
	
}
