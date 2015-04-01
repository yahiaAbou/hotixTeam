package tn.hotixsoft.HotixTeamWeb.mb;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.hotixsoft.HotixTeamEJB.entities.Stat;
import tn.hotixsoft.HotixTeamEJB.interfaces.IStateLocal;



@ManagedBean(name = "StatMB")
@ViewScoped
public class StatMB {
	
	@EJB
	private IStateLocal metier;
	
	private String Etat;
	private Stat st;

	
	
	
	
	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}




	public Stat getSt() {
		return st;
	}




	public void setSt(Stat st) {
		this.st = st;
	}
	
	

}
