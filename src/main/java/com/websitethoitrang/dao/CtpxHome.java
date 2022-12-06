package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Ctpx;
import com.websitethoitrang.entities.CtpxId;

/**
 * Home object for domain model class Ctpx.
 * @see com.websitethoitrang.dao.Ctpx
 * @author Hibernate Tools
 */
//@Stateless
public class CtpxHome {

	private static final Log log = LogFactory.getLog(CtpxHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Ctpx transientInstance) {
		log.debug("persisting Ctpx instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Ctpx persistentInstance) {
		log.debug("removing Ctpx instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ctpx merge(Ctpx detachedInstance) {
		log.debug("merging Ctpx instance");
		try {
			Ctpx result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ctpx findById(CtpxId id) {
		log.debug("getting Ctpx instance with id: " + id);
		try {
			Ctpx instance = entityManager.find(Ctpx.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
