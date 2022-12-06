package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Dondathang;

/**
 * Home object for domain model class Dondathang.
 * @see com.websitethoitrang.dao.Dondathang
 * @author Hibernate Tools
 */
//@Stateless
public class DondathangHome {

	private static final Log log = LogFactory.getLog(DondathangHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Dondathang transientInstance) {
		log.debug("persisting Dondathang instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Dondathang persistentInstance) {
		log.debug("removing Dondathang instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Dondathang merge(Dondathang detachedInstance) {
		log.debug("merging Dondathang instance");
		try {
			Dondathang result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Dondathang findById(String id) {
		log.debug("getting Dondathang instance with id: " + id);
		try {
			Dondathang instance = entityManager.find(Dondathang.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
