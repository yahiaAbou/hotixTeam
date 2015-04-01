package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmpGpPK  implements Serializable {   
   
	         
	private int idUser;         
	private int idGroupe;
	private static final long serialVersionUID = 1L;

	public EmpGpPK() {}

	
	





	public EmpGpPK(int idUser, int idGroupe) {
		super();
		this.idUser = idUser;
		this.idGroupe = idGroupe;
	}








	public int getIdUser() {
		return idUser;
	}








	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}








	public int getIdGroupe() {
		return idGroupe;
	}








	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}








	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idGroupe;
		result = prime * result + idUser;
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
		EmpGpPK other = (EmpGpPK) obj;
		if (idGroupe != other.idGroupe)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}








	
	

	
   
	

   
}
