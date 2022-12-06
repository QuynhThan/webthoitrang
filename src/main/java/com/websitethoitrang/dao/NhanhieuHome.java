package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Nhanhieu;

/**
 * Home object for domain model class Nhanhieu.
 * @see com.websitethoitrang.dao.Nhanhieu
 * @author Hibernate Tools
 */
//@Stateless
public class NhanhieuHome {

	private static final Log log = LogFactory.getLog(NhanhieuHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Nhanhieu transientInstance) {
		log.debug("persisting Nhanhieu instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Nhanhieu persistentInstance) {
		log.debug("removing Nhanhieu instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Nhanhieu merge(Nhanhieu detachedInstance) {
		log.debug("merging Nhanhieu instance");
		try {
			Nhanhieu result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Nhanhieu findById(String id) {
		log.debug("getting Nhanhieu instance with id: " + id);
		try {
			Nhanhieu instance = entityManager.find(Nhanhieu.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
