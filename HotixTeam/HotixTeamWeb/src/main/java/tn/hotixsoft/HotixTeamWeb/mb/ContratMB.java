package tn.hotixsoft.HotixTeamWeb.mb;
import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.hotixsoft.HotixTeamEJB.entities.Client;
import tn.hotixsoft.HotixTeamEJB.entities.Contrat;
import tn.hotixsoft.HotixTeamEJB.entities.Module;
import tn.hotixsoft.HotixTeamEJB.interfaces.IContratLocal;




@ManagedBean(name = "ContratMB")
@ViewScoped
public class ContratMB {
	
	@EJB
	private IContratLocal metier;
	
	
	
	private Client client;
	private Module module;
	private Date startDate;
	private Date endDate;
	
	String format = "dd/MM/yy "; 

	java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); 
	java.util.Date date = new java.util.Date();
	
	
	public void AddContrat(){
		
		metier.AddContrat(new Contrat(formater.format(startDate),formater.format(endDate), module, client));
	}
	
	
	
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}





	public Date getStartDate() {
		return startDate;
	}





	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}





	public Date getEndDate() {
		return endDate;
	}





	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	

}
