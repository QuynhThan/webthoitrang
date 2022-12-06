package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Loaikh;

/**
 * Home object for domain model class Loaikh.
 * @see com.websitethoitrang.dao.Loaikh
 * @author Hibernate Tools
 */
//@Stateless
public class LoaikhHome {

	private static final Log log = LogFactory.getLog(LoaikhHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Loaikh transientInstance) {
		log.debug("persisting Loaikh instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Loaikh persistentInstance) {
		log.debug("removing Loaikh instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Loaikh merge(Loaikh detachedInstance) {
		log.debug("merging Loaikh instance");
		try {
			Loaikh result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Loaikh findById(int id) {
		log.debug("getting Loaikh instance with id: " + id);
		try {
			Loaikh instance = entityManager.find(Loaikh.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
