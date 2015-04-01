package tn.hotixsoft.HotixTeamWeb.mb;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

import tn.hotixsoft.HotixTeamEJB.entities.Module;
import tn.hotixsoft.HotixTeamEJB.interfaces.IModuleLocal;



@ManagedBean(name="ModuleMB")
@ViewScoped
public class ModuleMB {
	@EJB
	private IModuleLocal metier;
	
	private String titleModule;
	
	private List<Module> modules;
	
	public void AjouterModule(){
		metier.AddModule(new Module(titleModule));
		titleModule=null;
	}

	
	public List<Module> FindAllModule(){
		return metier.FindAllModule();
	}
	
	
	@PostConstruct
	public void ChercherModules(){
		setModules(FindAllModule());
	}
	
	
	public String getTitleModule() {
		return titleModule;
	}





	public void setTitleModule(String titleModule) {
		this.titleModule = titleModule;
	}





	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	
	
	
	

}
