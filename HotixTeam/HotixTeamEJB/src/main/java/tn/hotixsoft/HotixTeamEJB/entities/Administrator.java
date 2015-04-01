package tn.hotixsoft.HotixTeamEJB.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Administrator")
public class Administrator extends User {

	@Column(name = "cin_admin")
	private String Cin_admin;
	private static final long serialVersionUID = 1L;

	public String getCin() {
		return Cin_admin;
	}

	public void setCin(String cin_admin) {
		Cin_admin = cin_admin;
	}

	
	
	public Administrator(String cin_admin) {
		super();
		Cin_admin = cin_admin;
	}

	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
