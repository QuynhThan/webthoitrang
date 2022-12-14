package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Hoadon;

/**
 * Home object for domain model class Hoadon.
 * @see com.websitethoitrang.dao.Hoadon
 * @author Hibernate Tools
 */
//@Stateless
public class HoadonHome {

	private static final Log log = LogFactory.getLog(HoadonHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Hoadon transientInstance) {
		log.debug("persisting Hoadon instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Hoadon persistentInstance) {
		log.debug("removing Hoadon instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Hoadon merge(Hoadon detachedInstance) {
		log.debug("merging Hoadon instance");
		try {
			Hoadon result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Hoadon findById(String id) {
		log.debug("getting Hoadon instance with id: " + id);
		try {
			Hoadon instance = entityManager.find(Hoadon.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
