package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Ctpn;
import com.websitethoitrang.entities.CtpnId;

/**
 * Home object for domain model class Ctpn.
 * @see com.websitethoitrang.dao.Ctpn
 * @author Hibernate Tools
 */
//@Stateless
public class CtpnHome {

	private static final Log log = LogFactory.getLog(CtpnHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Ctpn transientInstance) {
		log.debug("persisting Ctpn instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Ctpn persistentInstance) {
		log.debug("removing Ctpn instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ctpn merge(Ctpn detachedInstance) {
		log.debug("merging Ctpn instance");
		try {
			Ctpn result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ctpn findById(CtpnId id) {
		log.debug("getting Ctpn instance with id: " + id);
		try {
			Ctpn instance = entityManager.find(Ctpn.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
