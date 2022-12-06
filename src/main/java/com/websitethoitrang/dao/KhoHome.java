package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Kho;

/**
 * Home object for domain model class Kho.
 * @see com.websitethoitrang.dao.Kho
 * @author Hibernate Tools
 */
//@Stateless
public class KhoHome {

	private static final Log log = LogFactory.getLog(KhoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Kho transientInstance) {
		log.debug("persisting Kho instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Kho persistentInstance) {
		log.debug("removing Kho instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Kho merge(Kho detachedInstance) {
		log.debug("merging Kho instance");
		try {
			Kho result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Kho findById(String id) {
		log.debug("getting Kho instance with id: " + id);
		try {
			Kho instance = entityManager.find(Kho.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
