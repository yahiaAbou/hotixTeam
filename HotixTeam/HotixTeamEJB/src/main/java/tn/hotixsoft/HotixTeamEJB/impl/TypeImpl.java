package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.hotixsoft.HotixTeamEJB.entities.Type;
import tn.hotixsoft.HotixTeamEJB.interfaces.ITypeLocal;



@Stateless
public class TypeImpl implements ITypeLocal{
	@PersistenceContext
	private EntityManager em;


	@Override
	public void AddType(Type ty) {
		em.persist(ty);
		
		
	}

	@Override
	public void UpdateType(Type ty) {
		
	}

	@Override
	public void DeleteType(Type ty) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public List<Type> FAllType() {
		Query req = em.createQuery("select t from Type t ");
		return (List<Type>) req.getResultList();
		
	}

}
