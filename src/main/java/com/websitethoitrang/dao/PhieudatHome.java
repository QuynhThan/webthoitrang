package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Phieudat;

/**
 * Home object for domain model class Phieudat.
 * @see com.websitethoitrang.dao.Phieudat
 * @author Hibernate Tools
 */
//@Stateless
public class PhieudatHome {

	private static final Log log = LogFactory.getLog(PhieudatHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Phieudat transientInstance) {
		log.debug("persisting Phieudat instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Phieudat persistentInstance) {
		log.debug("removing Phieudat instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Phieudat merge(Phieudat detachedInstance) {
		log.debug("merging Phieudat instance");
		try {
			Phieudat result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Phieudat findById(String id) {
		log.debug("getting Phieudat instance with id: " + id);
		try {
			Phieudat instance = entityManager.find(Phieudat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
