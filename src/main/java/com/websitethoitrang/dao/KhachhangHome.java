package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Khachhang;

/**
 * Home object for domain model class Khachhang.
 * @see com.websitethoitrang.dao.Khachhang
 * @author Hibernate Tools
 */
//@Stateless
public class KhachhangHome {

	private static final Log log = LogFactory.getLog(KhachhangHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Khachhang transientInstance) {
		log.debug("persisting Khachhang instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Khachhang persistentInstance) {
		log.debug("removing Khachhang instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Khachhang merge(Khachhang detachedInstance) {
		log.debug("merging Khachhang instance");
		try {
			Khachhang result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Khachhang findById(String id) {
		log.debug("getting Khachhang instance with id: " + id);
		try {
			Khachhang instance = entityManager.find(Khachhang.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
