package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contrat
 *
 */
@Entity
public class Contrat implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String startDate;
	private String endDate;
	
	@ManyToOne
	@JoinColumn(name="idModule", insertable=false, updatable=false)
	private Module module;
	@ManyToOne
	@JoinColumn(name="id_u", insertable=false, updatable=false)
	private Client client;
	@EmbeddedId
	private ContratPK contratPK;

	public Contrat() {
		super();
	}
	
	
	public Contrat(String startDate, String endDate, Module module,
			Client client) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.module = module;
		this.client = client;
		this.contratPK=new ContratPK(module.getId_m(), client.getIdUser());  
	
	}

	public ContratPK getContratPK() {
		return contratPK;
	}

	public void setContratPK(ContratPK contratPK) {
		this.contratPK = contratPK;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	
	
	
	
}
