package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Chinhanh;

/**
 * Home object for domain model class Chinhanh.
 * @see com.websitethoitrang.dao.Chinhanh
 * @author Hibernate Tools
 */
//@Stateless
public class ChinhanhHome {

	private static final Log log = LogFactory.getLog(ChinhanhHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Chinhanh transientInstance) {
		log.debug("persisting Chinhanh instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Chinhanh persistentInstance) {
		log.debug("removing Chinhanh instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Chinhanh merge(Chinhanh detachedInstance) {
		log.debug("merging Chinhanh instance");
		try {
			Chinhanh result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Chinhanh findById(String id) {
		log.debug("getting Chinhanh instance with id: " + id);
		try {
			Chinhanh instance = entityManager.find(Chinhanh.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
