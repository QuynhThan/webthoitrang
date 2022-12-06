package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Ctdkm;
import com.websitethoitrang.entities.CtdkmId;

/**
 * Home object for domain model class Ctdkm.
 * @see com.websitethoitrang.dao.Ctdkm
 * @author Hibernate Tools
 */
//@Stateless
public class CtdkmHome {

	private static final Log log = LogFactory.getLog(CtdkmHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Ctdkm transientInstance) {
		log.debug("persisting Ctdkm instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Ctdkm persistentInstance) {
		log.debug("removing Ctdkm instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ctdkm merge(Ctdkm detachedInstance) {
		log.debug("merging Ctdkm instance");
		try {
			Ctdkm result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ctdkm findById(CtdkmId id) {
		log.debug("getting Ctdkm instance with id: " + id);
		try {
			Ctdkm instance = entityManager.find(Ctdkm.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
