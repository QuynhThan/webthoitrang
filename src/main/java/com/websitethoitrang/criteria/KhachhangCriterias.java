package com.websitethoitrang.criteria;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class KhachhangCriterias {
//
//	@Autowired
//	SessionFactory factory;
	
	public static <T> List<T> getAll(Class<T> type,Session session ) {
		CriteriaBuilder builder = session.getCriteriaBuilder() ;
		CriteriaQuery<T>criteria = builder.createQuery(type);
		criteria.from(type);
		List<T> data = session.createQuery(criteria).getResultList();
		return data;
	}
	
}
