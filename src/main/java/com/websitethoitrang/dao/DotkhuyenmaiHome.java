package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Dotkhuyenmai;

/**
 * Home object for domain model class Dotkhuyenmai.
 * @see com.websitethoitrang.dao.Dotkhuyenmai
 * @author Hibernate Tools
 */
//@Stateless
public class DotkhuyenmaiHome {

	private static final Log log = LogFactory.getLog(DotkhuyenmaiHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Dotkhuyenmai transientInstance) {
		log.debug("persisting Dotkhuyenmai instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Dotkhuyenmai persistentInstance) {
		log.debug("removing Dotkhuyenmai instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Dotkhuyenmai merge(Dotkhuyenmai detachedInstance) {
		log.debug("merging Dotkhuyenmai instance");
		try {
			Dotkhuyenmai result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Dotkhuyenmai findById(String id) {
		log.debug("getting Dotkhuyenmai instance with id: " + id);
		try {
			Dotkhuyenmai instance = entityManager.find(Dotkhuyenmai.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
