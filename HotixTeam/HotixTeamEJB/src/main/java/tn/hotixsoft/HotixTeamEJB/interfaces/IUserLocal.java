package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.Administrator;
import tn.hotixsoft.HotixTeamEJB.entities.Client;
import tn.hotixsoft.HotixTeamEJB.entities.Employee;
import tn.hotixsoft.HotixTeamEJB.entities.EmployeeBranch;
import tn.hotixsoft.HotixTeamEJB.entities.User;
import tn.hotixsoft.HotixTeamEJB.entities.Branch;



@Local
public interface IUserLocal {
	
	public int AddEmployee(Employee emp);
	public void AddClient(Client cl);
	public List<Client> findAllClientFather() ;
	public List<Client> findAllClient();
	public List<Employee> findAllEmployee();
	User Login(String username, String password);
	void addAdministrator(Administrator admin);
	List<Branch> findListEmployeeBranch(Employee Emp);
	void addBranch(Branch br);
	void addEmployeeBranch(EmployeeBranch eb);
	List<Branch> findBranch();	
	


}
