package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Ctpd;
import com.websitethoitrang.entities.CtpdId;

/**
 * Home object for domain model class Ctpd.
 * @see com.websitethoitrang.dao.Ctpd
 * @author Hibernate Tools
 */
//@Stateless
public class CtpdHome {

	private static final Log log = LogFactory.getLog(CtpdHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Ctpd transientInstance) {
		log.debug("persisting Ctpd instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Ctpd persistentInstance) {
		log.debug("removing Ctpd instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ctpd merge(Ctpd detachedInstance) {
		log.debug("merging Ctpd instance");
		try {
			Ctpd result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ctpd findById(CtpdId id) {
		log.debug("getting Ctpd instance with id: " + id);
		try {
			Ctpd instance = entityManager.find(Ctpd.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
