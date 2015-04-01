package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.hotixsoft.HotixTeamEJB.entities.Client;
import tn.hotixsoft.HotixTeamEJB.entities.Employee;
import tn.hotixsoft.HotixTeamEJB.entities.Module;
import tn.hotixsoft.HotixTeamEJB.entities.Project;
import tn.hotixsoft.HotixTeamEJB.entities.Task;
import tn.hotixsoft.HotixTeamEJB.interfaces.ITaskLocal;

@Stateless
public class TaskImpl implements ITaskLocal {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void AddTask(Task t) {
		em.persist(t);

	}
	
	

	@Override
	public void DeleteTask(Task t) {

	}

	@Override
	public void UpdateTask(Task t) {

		em.merge(t);

	}

	@Override
	public Task DoGetTask(int code) {

		Task t = em.find(Task.class, code);

		return t;
	}



	@Override
	public List<Module> loadModulesForClient(Client cs) {
		Query req = em.createQuery("select m from Contrat c join c.module m where c.client.idUser=:idclient ").setParameter("idclient",cs.getIdUser() );
		return (List<Module>) req.getResultList();
	}



	@Override
	public List<Project> loadModulesForProject(Client cs) {
		Query req = em.createQuery("select p from Project p where p.ClientProject.idUser=:idclient").setParameter("idclient",cs.getIdUser());
		return (List<Project>) req.getResultList();
	}



	@Override
	public List<Task> FindAllTask() {
		Query req = em.createQuery("select t from Task t");
		return (List<Task>) req.getResultList();
	}
	
	@Override
	public List<Task> FindAllTasksEmployee(Employee emp ){
    	
		
    	Query query = em.createQuery("SELECT t FROM Task t WHERE t.projetTache IN (SELECT p FROM Visibility V JOIN V.project p join V.groupe g WHERE"
				+ "  g.idGroupe in "
				+ "( SELECT g FROM EmpGp egp JOIN egp.groupe g WHERE egp.employee.idUser=:id)) ")
		.setParameter("id", emp.getIdUser());
		return (List<Task>) query.getResultList();
    }
	
	
}
