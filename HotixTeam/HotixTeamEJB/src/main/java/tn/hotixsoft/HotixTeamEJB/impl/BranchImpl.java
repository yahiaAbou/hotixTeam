package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.hotixsoft.HotixTeamEJB.entities.Branch;
import tn.hotixsoft.HotixTeamEJB.interfaces.IBranchLocal;

@Stateless
public class BranchImpl implements IBranchLocal{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void AddBranch(Branch br) {
		em.persist(br);
	}

	@Override
	public void DeleteBranch(Branch br) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateBranch(Branch br) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Branch> FindAllBranchs() {
		Query req = em.createQuery("select b from Branch b ");
		System.out.println(req.getResultList().size());
		return (List<Branch>) req.getResultList();
	}

}
