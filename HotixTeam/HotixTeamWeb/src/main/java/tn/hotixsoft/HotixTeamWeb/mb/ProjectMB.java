package tn.hotixsoft.HotixTeamWeb.mb;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import tn.hotixsoft.HotixTeamEJB.entities.Client;
import tn.hotixsoft.HotixTeamEJB.entities.EmpGp;
import tn.hotixsoft.HotixTeamEJB.entities.Groupe;
import tn.hotixsoft.HotixTeamEJB.entities.Project;
import tn.hotixsoft.HotixTeamEJB.entities.Task;
import tn.hotixsoft.HotixTeamEJB.entities.Visibility;
import tn.hotixsoft.HotixTeamEJB.interfaces.IProjectLocal;





@ManagedBean(name = "ProjectMB")
@SessionScoped
public class ProjectMB {
	
	@EJB
	private IProjectLocal metier;
	
	private String TitleProject;
	private String DescriptionProject;
	private Client ClientProject;
	private List<Project> projects;
	private List<Groupe> groupeSelected;
	
	
	public List<Project> FindAllProject(){
		
		return metier.FindAllProject();
	}
	
	
	public void AjouterProjet(){
		String format = "dd/MM/yy H:mm:ss"; 

		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); 
		java.util.Date date = new java.util.Date(); 
		
		Project project = new Project(TitleProject, DescriptionProject, formater.format( date ), ClientProject);
		metier.AddProject(project);
		TitleProject=null;
		DescriptionProject=null;
		
		for (Groupe g : groupeSelected) {
			metier.addVisibility(new Visibility(project, g));
			System.out.println(g);
		}
		
	}
	
	
	
	@PostConstruct
	public void FAllProject(){
		setProjects(FindAllProject());
	}
	
	
	
	
	public String getTitleProject() {
		return TitleProject;
	}
	public void setTitleProject(String titleProject) {
		TitleProject = titleProject;
	}
	public String getDescriptionProject() {
		return DescriptionProject;
	}
	public void setDescriptionProject(String descriptionProject) {
		DescriptionProject = descriptionProject;
	}
	public Client getClientProject() {
		return ClientProject;
	}
	public void setClientProject(Client clientProject) {
		ClientProject = clientProject;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}


	public List<Groupe> getGroupeSelected() {
		return groupeSelected;
	}


	public void setGroupeSelected(List<Groupe> groupeSelected) {
		this.groupeSelected = groupeSelected;
	}
	
	
	
	

}
