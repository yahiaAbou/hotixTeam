package tn.hotixsoft.HotixTeamWeb.mb;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.hotixsoft.HotixTeamEJB.entities.Groupe;
import tn.hotixsoft.HotixTeamEJB.interfaces.IGroupLocal;


@ManagedBean(name = "GroupMB")
@ViewScoped
public class GroupMB {

	@EJB
	private IGroupLocal metier;
	
	private String titleGp;
	private List<Groupe>groupes;
	

	public List<Groupe> FAllGroup(){
		return metier.FindAllGroup();
	}
	
	@PostConstruct
	public void chercher(){
		setGroupes(FAllGroup());
		
	}
	
	
	
	public void AjouterGroup(){
		metier.AddGroup(new Groupe(titleGp));
		titleGp=null;
	}
	
	
	
	
	
	
	public String getTitleGp() {
		return titleGp;
	}

	public void setTitleGp(String titleGp) {
		this.titleGp = titleGp;
	}









	public List<Groupe> getGroupes() {
		return groupes;
	}






	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}






	
	
	
	
}
