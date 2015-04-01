package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profil")
public class Profil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int idProfil;
	
	
	public Profil() {
		super();
	}

	private boolean taskR;
	private boolean taskW;
	private boolean projectR;
	private boolean projectW;

	public Profil(boolean taskR, boolean taskW, boolean projectR,
			boolean projectW) {
		super();
		this.taskR = taskR;
		this.taskW = taskW;
		this.projectR = projectR;
		this.projectW = projectW;
	}

	

	public int getIdProfil() {
		return idProfil;
	}



	public void setIdProfil(int idProfil) {
		this.idProfil = idProfil;
	}



	public boolean isTaskR() {
		return taskR;
	}

	public void setTaskR(boolean taskR) {
		this.taskR = taskR;
	}

	public boolean isTaskW() {
		return taskW;
	}

	public void setTaskW(boolean taskW) {
		this.taskW = taskW;
	}

	public boolean isProjectR() {
		return projectR;
	}

	public void setProjectR(boolean projectR) {
		this.projectR = projectR;
	}

	public boolean isProjectW() {
		return projectW;
	}

	public void setProjectW(boolean projectW) {
		this.projectW = projectW;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
