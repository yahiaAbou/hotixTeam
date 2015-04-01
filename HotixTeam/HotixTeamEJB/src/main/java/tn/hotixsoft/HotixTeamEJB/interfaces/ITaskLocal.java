package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.Client;
import tn.hotixsoft.HotixTeamEJB.entities.Employee;
import tn.hotixsoft.HotixTeamEJB.entities.Module;
import tn.hotixsoft.HotixTeamEJB.entities.Project;
import tn.hotixsoft.HotixTeamEJB.entities.Task;

@Local
public interface ITaskLocal {

	public void AddTask(Task t);

	public void DeleteTask(Task t);

	public void UpdateTask(Task t);

	public Task DoGetTask(int code);
	
	public List<Task> FindAllTask();

	public List<Module> loadModulesForClient(Client cs);

	 public List<Project> loadModulesForProject(Client cs);

	List<Task> FindAllTasksEmployee(Employee emp);

}
