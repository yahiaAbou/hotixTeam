package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.Project;
import tn.hotixsoft.HotixTeamEJB.entities.Visibility;



@Local
public interface IProjectLocal {
	
	public Project AddProject(Project p);

	public void DeleteProject(Project p);

	public void UpdateProject(Project p);
	
	public List<Project> FindAllProject();

	void AddVisibility(Visibility V);

	void addVisibility(Visibility vi);
	

}
