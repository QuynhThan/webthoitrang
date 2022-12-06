package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Taikhoan;

/**
 * Home object for domain model class Taikhoan.
 * @see com.websitethoitrang.dao.Taikhoan
 * @author Hibernate Tools
 */
//@Stateless
public class TaikhoanHome {

	private static final Log log = LogFactory.getLog(TaikhoanHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Taikhoan transientInstance) {
		log.debug("persisting Taikhoan instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Taikhoan persistentInstance) {
		log.debug("removing Taikhoan instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Taikhoan merge(Taikhoan detachedInstance) {
		log.debug("merging Taikhoan instance");
		try {
			Taikhoan result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Taikhoan findById(String id) {
		log.debug("getting Taikhoan instance with id: " + id);
		try {
			Taikhoan instance = entityManager.find(Taikhoan.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
