package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * ID class for entity: Contrat
 * 
 */
@Embeddable
public class ContratPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idModule;
	private int id_u;

	public ContratPK() {

	}
	
	
	

	public ContratPK(int idModule, int id_u) {
		super();
		this.idModule = idModule;
		this.id_u = id_u;
	}




	public int getIdModule() {
		return idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	public int getId_u() {
		return id_u;
	}

	public void setId_u(int id_u) {
		this.id_u = id_u;
	}
	
	
	
	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idModule;
		result = prime * result + id_u;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContratPK other = (ContratPK) obj;
		if (idModule != other.idModule)
			return false;
		if (id_u != other.id_u)
			return false;
		return true;
	}
}
