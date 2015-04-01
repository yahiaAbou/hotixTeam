package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Groupe implements Serializable {



	@Id
	@Column(name = "id_gp")
	@GeneratedValue
	private int idGroupe;

	@Column(name = "title_gp")
	private String titleGroup;

	// ////////////======== Cle etrangere Succursale

//	@ManyToOne
//	@JoinColumn(name = "Succursale_id")
//	private Succursale succursale;

	private static final long serialVersionUID = 1L;
	

	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int id_gp) {
		idGroupe = id_gp;
	}

	public String getTitleGroup() {
		return titleGroup;
	}

	public void setTitleGroup(String title_gp) {
		this.titleGroup = title_gp;
	}

//	public Succursale getSuccursale() {
//		return succursale;
//	}
//
//	public void setSuccursale(Succursale succursale) {
//		this.succursale = succursale;
//	}

	public Groupe(String title_gp) {
		super();
		this.titleGroup = title_gp;
//		this.succursale = succursale;
	}

	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return titleGroup+ "";
	}

}
