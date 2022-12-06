package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Mathang;

/**
 * Home object for domain model class Mathang.
 * @see com.websitethoitrang.dao.Mathang
 * @author Hibernate Tools
 */
//@Stateless
public class MathangHome {

	private static final Log log = LogFactory.getLog(MathangHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Mathang transientInstance) {
		log.debug("persisting Mathang instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Mathang persistentInstance) {
		log.debug("removing Mathang instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Mathang merge(Mathang detachedInstance) {
		log.debug("merging Mathang instance");
		try {
			Mathang result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Mathang findById(String id) {
		log.debug("getting Mathang instance with id: " + id);
		try {
			Mathang instance = entityManager.find(Mathang.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
