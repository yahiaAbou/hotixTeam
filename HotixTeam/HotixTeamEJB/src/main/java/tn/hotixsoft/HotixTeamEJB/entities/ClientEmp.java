package tn.hotixsoft.HotixTeamEJB.entities;

import javax.persistence.*;


@Entity 
@DiscriminatorValue("Administrator")
public class ClientEmp extends User {

	
	

	
	private static final long serialVersionUID = 1L;
}
