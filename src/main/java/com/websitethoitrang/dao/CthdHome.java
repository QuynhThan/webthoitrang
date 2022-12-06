package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Cthd;
import com.websitethoitrang.entities.CthdId;

/**
 * Home object for domain model class Cthd.
 * @see com.websitethoitrang.dao.Cthd
 * @author Hibernate Tools
 */
//@Stateless
public class CthdHome {

	private static final Log log = LogFactory.getLog(CthdHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cthd transientInstance) {
		log.debug("persisting Cthd instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cthd persistentInstance) {
		log.debug("removing Cthd instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cthd merge(Cthd detachedInstance) {
		log.debug("merging Cthd instance");
		try {
			Cthd result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cthd findById(CthdId id) {
		log.debug("getting Cthd instance with id: " + id);
		try {
			Cthd instance = entityManager.find(Cthd.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
