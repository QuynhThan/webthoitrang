package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Size;

/**
 * Home object for domain model class Size.
 * @see com.websitethoitrang.dao.Size
 * @author Hibernate Tools
 */
//@Stateless
public class SizeHome {

	private static final Log log = LogFactory.getLog(SizeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Size transientInstance) {
		log.debug("persisting Size instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Size persistentInstance) {
		log.debug("removing Size instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Size merge(Size detachedInstance) {
		log.debug("merging Size instance");
		try {
			Size result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Size findById(int id) {
		log.debug("getting Size instance with id: " + id);
		try {
			Size instance = entityManager.find(Size.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
