package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.Employee;
import tn.hotixsoft.HotixTeamEJB.entities.Groupe;
import tn.hotixsoft.HotixTeamEJB.entities.Project;

@Local
public interface IGroupLocal {

	public void AddGroup(Groupe gp);
	public List<Groupe> FindAllGroup();
	public List<Project> GetListVisibility(Employee Emp);
	
	
}
