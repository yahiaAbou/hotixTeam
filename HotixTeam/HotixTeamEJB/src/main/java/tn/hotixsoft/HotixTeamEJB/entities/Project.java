package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "projet")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idProject")
	private int idProject;

	@Column(name = "titleProject", nullable = false)
	private String titleProject;

	@Column(name = "descriptionProject")
	private String descriptionProject;

	@Column(name = "datec_p")
	private String Datec_p;

	@ManyToOne
	@JoinColumn(name = "clientproject")
	private Client ClientProject;

	public String getTitleProject() {
		return titleProject;
	}

	public void setTitleProject(String title_p) {
		titleProject = title_p;
	}

	public String getDescriptionProject() {
		return descriptionProject;
	}

	public void setDescriptionProject(String description_p) {
		descriptionProject = description_p;
	}

	public String getDatec_p() {
		return Datec_p;
	}

	public void setDatec_p(String datec_p) {
		Datec_p = datec_p;
	}
	
	
	

	
	
	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int id_p) {
		idProject = id_p;
	}

	public Client getClientProject() {
		return ClientProject;
	}

	public void setClientProject(Client clientProject) {
		ClientProject = clientProject;
	}

	public Project(String title_p, String description_p, String datec_p,
			Client clientProject) {
		super();
		titleProject = title_p;
		descriptionProject = description_p;
		Datec_p = datec_p;
		ClientProject = clientProject;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
