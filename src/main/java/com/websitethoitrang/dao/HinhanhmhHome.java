package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Hinhanhmh;

/**
 * Home object for domain model class Hinhanhmh.
 * @see com.websitethoitrang.dao.Hinhanhmh
 * @author Hibernate Tools
 */
//@Stateless
public class HinhanhmhHome {

	private static final Log log = LogFactory.getLog(HinhanhmhHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Hinhanhmh transientInstance) {
		log.debug("persisting Hinhanhmh instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Hinhanhmh persistentInstance) {
		log.debug("removing Hinhanhmh instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Hinhanhmh merge(Hinhanhmh detachedInstance) {
		log.debug("merging Hinhanhmh instance");
		try {
			Hinhanhmh result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Hinhanhmh findById(String id) {
		log.debug("getting Hinhanhmh instance with id: " + id);
		try {
			Hinhanhmh instance = entityManager.find(Hinhanhmh.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
