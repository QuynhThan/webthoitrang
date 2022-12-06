package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Loaimh;

/**
 * Home object for domain model class Loaimh.
 * @see com.websitethoitrang.dao.Loaimh
 * @author Hibernate Tools
 */
//@Stateless
public class LoaimhHome {

	private static final Log log = LogFactory.getLog(LoaimhHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Loaimh transientInstance) {
		log.debug("persisting Loaimh instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Loaimh persistentInstance) {
		log.debug("removing Loaimh instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Loaimh merge(Loaimh detachedInstance) {
		log.debug("merging Loaimh instance");
		try {
			Loaimh result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Loaimh findById(int id) {
		log.debug("getting Loaimh instance with id: " + id);
		try {
			Loaimh instance = entityManager.find(Loaimh.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
