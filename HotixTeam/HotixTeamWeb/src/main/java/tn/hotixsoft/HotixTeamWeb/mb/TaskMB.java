package tn.hotixsoft.HotixTeamWeb.mb;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import tn.hotixsoft.HotixTeamEJB.entities.Client;
import tn.hotixsoft.HotixTeamEJB.entities.Employee;
import tn.hotixsoft.HotixTeamEJB.entities.Module;
import tn.hotixsoft.HotixTeamEJB.entities.Project;
import tn.hotixsoft.HotixTeamEJB.entities.Stat;
import tn.hotixsoft.HotixTeamEJB.entities.Task;
import tn.hotixsoft.HotixTeamEJB.entities.Type;
import tn.hotixsoft.HotixTeamEJB.entities.User;
import tn.hotixsoft.HotixTeamEJB.interfaces.IStateLocal;
import tn.hotixsoft.HotixTeamEJB.interfaces.ITaskLocal;

@ManagedBean(name = "TaskMB")
@ViewScoped
public class TaskMB {
	@EJB
	private ITaskLocal metier;
	
	@EJB
	private IStateLocal me;
	
	private UserMB userMB;
	private User user;
	private String Title;
	private String Description;
	private boolean Visib;
	private boolean Visibc;
	private String Datec;
	private String Dated;
	private String Datef;
	private String Datedm;
	private Stat etatTache;
	private Type typeTache;
	private Module moduleTache;
	private Project projetTache;
	private Date datedebut;
	private Date datefin;
	private Client clientSelected;
	private Employee afectedEmployee;
	private Employee employeeTache;
	private List<Module> modulesClient;
	private List<Project> projetsClient;
	private List<Task> tasks;

	private List<Task> TheTasksEmployee = new ArrayList<Task>();
	
	
	
public Stat OneStat(){
		
		List<Stat> li = me.FindTodoStat();
		return li.get(0);
	}


	public void AjouterTask(){
		
		userMB = (UserMB) FacesContext.getCurrentInstance().getExternalContext()
				.getSessionMap().get("UserMB");
		user=(userMB.getUser());
		
		Employee emp= new Employee() ;
			emp =	(Employee) user;
		
		String format = "dd/MM/yy H:mm:ss";
		String format2 = "dd/MM/yy";

		java.text.SimpleDateFormat formating = new java.text.SimpleDateFormat( format2 ); 
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); 
		java.util.Date date = new java.util.Date(); 
		
		metier.AddTask(new Task(Title, Description, true, Visibc, formater.format( date ), formating.format( datedebut ),formating.format( datefin ), Datedm, OneStat(), typeTache, moduleTache, projetTache, emp, afectedEmployee));
		Description=null;
		Title=null;
		datedebut=null;
		datefin=null;
		System.out.println("added");
	}
	
	 public void execute() {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Executed", "La tache est ajoutée."));
	    }
	 
	 
	 public void onDateSelect(SelectEvent event) {
	        FacesContext facesContext = FacesContext.getCurrentInstance();
	        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }
	 
	
	 public List<Task> FindAllTasks(){
			return metier.FindAllTask();
		}
	 
	 @PostConstruct
		public void ChercherTasks(){
			setTasks(FindAllTasks());
			setTheTasksEmployee(UpdateTaskEmployee());
	 }
	 
	 
	 public List<Task> UpdateTaskEmployee(){
		 	userMB = (UserMB) FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().get("UserMB");
			user = userMB.getUser();
			Employee emp = (Employee) user;
			return metier.FindAllTasksEmployee(emp);
		}
	 
	 public void changeClient(){
		    
		    modulesClient=metier.loadModulesForClient(clientSelected);
		    projetsClient=metier.loadModulesForProject(clientSelected);
		    System.out.println("modules client empty : "+modulesClient.isEmpty());
		}
	 
	
		
	 

	public ITaskLocal getMetier() {
		return metier;
	}

	public void setMetier(ITaskLocal metier) {
		this.metier = metier;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public boolean isVisib() {
		return Visib;
	}

	public void setVisib(boolean visib) {
		Visib = visib;
	}

	public boolean isVisibc() {
		return Visibc;
	}

	public void setVisibc(boolean visibc) {
		Visibc = visibc;
	}

	public String getDatec() {
		return Datec;
	}

	public void setDatec(String datec) {
		Datec = datec;
	}

	public String getDated() {
		return Dated;
	}

	public void setDated(String dated) {
		Dated = dated;
	}

	public String getDatef() {
		return Datef;
	}

	public void setDatef(String datef) {
		Datef = datef;
	}

	public String getDatedm() {
		return Datedm;
	}

	public void setDatedm(String datedm) {
		Datedm = datedm;
	}

	public Stat getEtatTache() {
		return etatTache;
	}

	public void setEtatTache(Stat etatTache) {
		this.etatTache = etatTache;
	}

	public Type getTypeTache() {
		return typeTache;
	}

	public void setTypeTache(Type typeTache) {
		this.typeTache = typeTache;
	}

	public Module getModuleTache() {
		return moduleTache;
	}

	public void setModuleTache(Module moduleTache) {
		this.moduleTache = moduleTache;
	}

	public Project getProjetTache() {
		return projetTache;
	}

	public void setProjetTache(Project projetTache) {
		this.projetTache = projetTache;
	}

	

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}



	public Client getClientSelected() {
		return clientSelected;
	}



	public void setClientSelected(Client clientSelected) {
		this.clientSelected = clientSelected;
	}



	public List<Module> getModulesClient() {
		return modulesClient;
	}



	public void setModulesClient(List<Module> modulesClient) {
		this.modulesClient = modulesClient;
	}



	public List<Project> getProjetsClient() {
		return projetsClient;
	}



	public void setProjetsClient(List<Project> projetsClient) {
		this.projetsClient = projetsClient;
	}



	public List<Task> getTasks() {
		return tasks;
	}



	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}





	public Employee getAfectedEmployee() {
		return afectedEmployee;
	}





	public void setAfectedEmployee(Employee afectedEmployee) {
		this.afectedEmployee = afectedEmployee;
	}





	public Employee getEmployeeTache() {
		return employeeTache;
	}





	public void setEmployeeTache(Employee employeeTache) {
		this.employeeTache = employeeTache;
	}





	public UserMB getUserMB() {
		return userMB;
	}





	public void setUserMB(UserMB userMB) {
		this.userMB = userMB;
	}





	public User getUser() {
		return user;
	}





	public void setUser(User user) {
		this.user = user;
	}


	public List<Task> getTheTasksEmployee() {
		return TheTasksEmployee;
	}


	public void setTheTasksEmployee(List<Task> theTasksEmployee) {
		TheTasksEmployee = theTasksEmployee;
	}


	

}
