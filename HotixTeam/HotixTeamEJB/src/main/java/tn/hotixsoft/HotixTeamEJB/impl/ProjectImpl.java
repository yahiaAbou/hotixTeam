package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.hotixsoft.HotixTeamEJB.entities.EmpGp;
import tn.hotixsoft.HotixTeamEJB.entities.Project;
import tn.hotixsoft.HotixTeamEJB.entities.Type;
import tn.hotixsoft.HotixTeamEJB.entities.Visibility;
import tn.hotixsoft.HotixTeamEJB.interfaces.IProjectLocal;

@Stateless
public class ProjectImpl implements IProjectLocal {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Project AddProject(Project p) {
		em.persist(p);
		em.flush();
		return  p ;
		
	}
	
	@Override
	public void addVisibility(Visibility vi) {
		em.persist(vi);
		
	}
	
	@Override
	public void   AddVisibility(Visibility V) {
		
		
		em.persist(V);
		
	}

	
	
	
	@Override
	public void DeleteProject(Project p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateProject(Project p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Project> FindAllProject() {
		Query req = em.createQuery("select p from Project p ");
		return (List<Project>) req.getResultList();
	}

}
