package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.hotixsoft.HotixTeamEJB.entities.Stat;
import tn.hotixsoft.HotixTeamEJB.interfaces.IStateLocal;


@Stateless
public class StatImpl implements IStateLocal{

	
	@PersistenceContext
	private EntityManager em;
	@Override
	public void AddState(Stat st) {
		em.persist(st);
		
	}

	@Override
	public void UpdateState(Stat st) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteState(Stat st) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Stat> FAllState() {
		Query req = em.createQuery("select s from Stat s ");
		return (List<Stat>) req.getResultList();
	}

	@Override
	public List<Stat> FindTodoStat() {
		Query req =em.createQuery("select s from Stat s where s.Etat='todo'");
		return ( List<Stat>) req.getResultList();
	}

}
