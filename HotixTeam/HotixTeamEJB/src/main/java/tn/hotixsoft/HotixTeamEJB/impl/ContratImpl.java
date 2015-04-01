package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.hotixsoft.HotixTeamEJB.entities.Contrat;
import tn.hotixsoft.HotixTeamEJB.interfaces.IContratLocal;


@Stateless
public class ContratImpl implements IContratLocal{


	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void AddContrat(Contrat co) {
		em.persist(co);
		
	}

	@Override
	public List<Contrat> FindAllContrat() {
		// TODO Auto-generated method stub
		return null;
	}

}
