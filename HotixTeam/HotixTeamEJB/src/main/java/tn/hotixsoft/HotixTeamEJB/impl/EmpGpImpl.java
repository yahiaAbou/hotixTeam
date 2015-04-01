package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.hotixsoft.HotixTeamEJB.entities.EmpGp;
import tn.hotixsoft.HotixTeamEJB.interfaces.IEmpGpLocal;


@Stateless
public class EmpGpImpl implements IEmpGpLocal{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void AddEmpGp(EmpGp eg) {
		em.persist(eg);
		
	}

	@Override
	public List<EmpGp> FindAllEmpGp() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
