package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.hotixsoft.HotixTeamEJB.entities.Module;
import tn.hotixsoft.HotixTeamEJB.interfaces.IModuleLocal;


@Stateless
public class ModuleImlp implements IModuleLocal {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void AddModule(Module mo) {
		em.persist(mo);
		
	}

	@Override
	public List<Module> FindAllModule() {
		Query req = em.createQuery("select m from Module m ");
		return (List<Module>) req.getResultList();
	}

}
