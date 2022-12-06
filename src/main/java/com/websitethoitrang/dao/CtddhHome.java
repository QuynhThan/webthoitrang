package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Ctddh;
import com.websitethoitrang.entities.CtddhId;

/**
 * Home object for domain model class Ctddh.
 * @see com.websitethoitrang.dao.Ctddh
 * @author Hibernate Tools
 */
//@Stateless
public class CtddhHome {

	private static final Log log = LogFactory.getLog(CtddhHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Ctddh transientInstance) {
		log.debug("persisting Ctddh instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Ctddh persistentInstance) {
		log.debug("removing Ctddh instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ctddh merge(Ctddh detachedInstance) {
		log.debug("merging Ctddh instance");
		try {
			Ctddh result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ctddh findById(CtddhId id) {
		log.debug("getting Ctddh instance with id: " + id);
		try {
			Ctddh instance = entityManager.find(Ctddh.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
