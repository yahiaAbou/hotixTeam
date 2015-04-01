package tn.hotixsoft.HotixTeamEJB.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.hotixsoft.HotixTeamEJB.entities.Administrator;
import tn.hotixsoft.HotixTeamEJB.entities.Branch;
import tn.hotixsoft.HotixTeamEJB.entities.Client;
import tn.hotixsoft.HotixTeamEJB.entities.Employee;
import tn.hotixsoft.HotixTeamEJB.entities.EmployeeBranch;
import tn.hotixsoft.HotixTeamEJB.entities.User;
import tn.hotixsoft.HotixTeamEJB.interfaces.IUserLocal;
@Stateless
public class UserImpl implements IUserLocal {

	@PersistenceContext
	private EntityManager em;

//	add client employee administrator
	
	@Override
	public int AddEmployee(Employee emp) {
		em.persist(emp);
		em.flush();
		return emp.getIdUser();

	}
	
	@Override
	public void addBranch(Branch br){
		em.persist(br);
	}
	@Override
	public List<Branch> findBranch(){
		Query req = em.createQuery("select b from Branch b ");
		return (List<Branch>) req.getResultList();
	}
	
	
	@Override
	public void addEmployeeBranch(EmployeeBranch eb){
		em.persist(eb);
	}
	
	
	@Override
	public void AddClient(Client cl) {
		em.persist(cl);

	}
	
	@Override
	public void addAdministrator(Administrator admin) {
		em.persist(admin);

	}

	
	@Override
	public User Login(String username, String password) {
		System.out.println("hi...");
		

		Query query = em
				.createQuery(
						"SELECT e FROM User e WHERE e.userNameUser=:UserName  AND e.passwordUser=:PassWord")
				.setParameter("UserName", username)
				.setParameter("PassWord", password);
		if (query.getResultList().size() >= 1) {
			System.out.println(query.getResultList().size());
				return  (User) query.getResultList().get(0);
			

		}else return null;
		

	}
	
	
	

	@Override
	public List<Client> findAllClientFather() {
		Query req = em.createQuery("select cl from Client cl where cl.Client_father=null ");
		return (List<Client>) req.getResultList();
	}

	
	@Override
	public List<Client> findAllClient() {
		Query req = em.createQuery("select cl from Client cl ");
		return (List<Client>) req.getResultList();
	}



	@Override
	public List<Employee> findAllEmployee() {
		Query req = em.createQuery("select emp from Employee emp ");
		return (List<Employee>) req.getResultList();
	}
	
	@Override
	public List<Branch> findListEmployeeBranch(Employee Emp){
		Query query = em.createQuery("SELECT b FROM EmployeeBranch eb JOIN eb.Branch b WHERE eb.Employee.idUser=:id ")
				.setParameter("id",Emp.getIdUser() );
		return (List<Branch>) query.getResultList();
	}
	
	
}
