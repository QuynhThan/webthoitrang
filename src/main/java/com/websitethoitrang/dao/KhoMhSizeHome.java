package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.KhoMhSize;
import com.websitethoitrang.entities.KhoMhSizeId;

/**
 * Home object for domain model class KhoMhSize.
 * @see com.websitethoitrang.dao.KhoMhSize
 * @author Hibernate Tools
 */
//@Stateless
public class KhoMhSizeHome {

	private static final Log log = LogFactory.getLog(KhoMhSizeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(KhoMhSize transientInstance) {
		log.debug("persisting KhoMhSize instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(KhoMhSize persistentInstance) {
		log.debug("removing KhoMhSize instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public KhoMhSize merge(KhoMhSize detachedInstance) {
		log.debug("merging KhoMhSize instance");
		try {
			KhoMhSize result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public KhoMhSize findById(KhoMhSizeId id) {
		log.debug("getting KhoMhSize instance with id: " + id);
		try {
			KhoMhSize instance = entityManager.find(KhoMhSize.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
