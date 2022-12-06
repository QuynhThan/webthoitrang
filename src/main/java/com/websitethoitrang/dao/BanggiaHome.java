package com.websitethoitrang.dao;
// Generated Dec 6, 2022, 2:29:31 PM by Hibernate Tools 4.3.5.Final

//Mimport javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.websitethoitrang.entities.Banggia;
import com.websitethoitrang.entities.BanggiaId;

/**
 * Home object for domain model class Banggia.
 * @see com.websitethoitrang.dao.Banggia
 * @author Hibernate Tools
 */
//@Stateless
public class BanggiaHome {

	private static final Log log = LogFactory.getLog(BanggiaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Banggia transientInstance) {
		log.debug("persisting Banggia instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Banggia persistentInstance) {
		log.debug("removing Banggia instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Banggia merge(Banggia detachedInstance) {
		log.debug("merging Banggia instance");
		try {
			Banggia result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Banggia findById(BanggiaId id) {
		log.debug("getting Banggia instance with id: " + id);
		try {
			Banggia instance = entityManager.find(Banggia.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
