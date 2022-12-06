package com.websitethoitrang.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class QueryServices <E>{

	@Autowired
	SessionFactory factory;
	
	// get all entity
	public List<E>  getAll(String entity, Class<E> type){
		
		Session session=factory.openSession();
    	String hql="From " + entity;
    	
		return session.createQuery(hql,type).getResultList();
	}
}
