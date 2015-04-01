package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: VisibilityPK
 *
 */
@Embeddable
public class VisibilityPK implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int idProject;
	private int idGroup;

	public VisibilityPK() {
		super();
	}
	
	public VisibilityPK(int idProject, int idGroup) {
		super();
		this.idProject = idProject;
		this.idGroup = idGroup;
	}



	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public int getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idGroup;
		result = prime * result + idProject;
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
		VisibilityPK other = (VisibilityPK) obj;
		if (idGroup != other.idGroup)
			return false;
		if (idProject != other.idProject)
			return false;
		return true;
	}
}
