package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.hotixsoft.HotixTeamEJB.entities.Employee;
import tn.hotixsoft.HotixTeamEJB.entities.Groupe;
import tn.hotixsoft.HotixTeamEJB.entities.Project;
import tn.hotixsoft.HotixTeamEJB.entities.Type;
import tn.hotixsoft.HotixTeamEJB.interfaces.IGroupLocal;

@Stateless
public class GroupImpl implements IGroupLocal {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void AddGroup(Groupe gp) {
		em.persist(gp);

	}

	@Override
	public List<Groupe> FindAllGroup() {
		Query req = em.createQuery("select g from Groupe g ");
		return (List<Groupe>) req.getResultList();
	}
	
	@Override
	public List<Project> GetListVisibility(Employee Emp) {
		Query query = em
				.createQuery(
						"SELECT p FROM Visibility V JOIN V.project p join V.groupe g WHERE"
						+ "  g.idGroupe in "
						+ "( SELECT g FROM EmpGp egp JOIN egp.Groupe g WHERE egp.Employee.idUser=:id) ")
				.setParameter("id", Emp.getIdUser());
		return (List<Project>) query.getResultList();
	}
	

}
