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
	
	public QueryServices() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public QueryServices(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	// get all in List id
	public List<E> getInListID(String entity, String entityID, Class<E> type, List<String> ids){
		if (ids == null) {
			return null;
		}
		Session session = factory.openSession();
		String hql = "From " + entity + " Where " + entityID + " in (";
		for (String id : ids) {
			//String str = "'" + id + "',";
			String str = id + " ,";
			hql += str;
		}
		hql = hql.substring(0,hql.length()-1);
		hql += ")";
		System.out.println("querry in getInListID = " + hql);
		return session.createQuery(hql,type).getResultList();
	}
	
	// get all entity
	public List<E>  getAll(String entity, Class<E> type){
		
		Session session=factory.openSession();
    	String hql="From " + entity;
    	
		return session.createQuery(hql,type).getResultList();
	}
	
	//get order by field DESC z-a or ASC a-z
	public List<E> getOrderBy(String entity, Class<E> type, String orderField){
		Session session = factory.openSession();
		String hql = "From " + entity + " order by " + orderField + " ASC";
		return session.createQuery(hql,type).getResultList();
	}
	public List<E> getOrderBy(String entity, Class<E> type, String orderField, String orderType){
		Session session = factory.openSession();
		String hql = "From " + entity + " order by " + orderField + " " + orderType;
		return session.createQuery(hql,type).getResultList();
	}
	//condition String type "field = value",...
	public List<E> getOrderBy(String entity, Class<E> type, String orderField, String orderType, String condition){
		Session session = factory.openSession();
		String hql = "From " + entity + " where " + condition + " order by " + orderField + " " + orderType;
		return session.createQuery(hql,type).getResultList();
	}
}
