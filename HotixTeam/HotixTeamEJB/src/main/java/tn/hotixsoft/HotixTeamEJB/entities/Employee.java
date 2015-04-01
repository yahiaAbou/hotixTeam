package tn.hotixsoft.HotixTeamEJB.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Employee")
public class Employee extends User {
	private static final long serialVersionUID = 1L;

	@Column(name = "firstNameUser")
	private String firstNameUser;
	public String getFirstNameUser() {
		return firstNameUser;
	}

	public void setFirstNameUser(String firstName_u) {
		firstNameUser = firstName_u;
	}

	public String getLastNameUser() {
		return lastNameUser;
	}

	public void setLastNameUser(String lastName_u) {
		lastNameUser = lastName_u;
	}

	@Column(name = "lastNameUser")
	private String lastNameUser;

	@Column(name = "cinemp")
	private String cinEmp;

	public String getCinEmp() {
		return cinEmp;
	}

	public void setCinEmp(String cin_emp) {
		cinEmp = cin_emp;
	}

	public Employee(String email_u,
			String userName_u, String password_u, int phone_u, String cin_emp,String firstName_u,String lastName_u) {
		super(email_u, userName_u, password_u, phone_u);
		cinEmp = cin_emp;
		firstNameUser = firstName_u;
		lastNameUser = lastName_u;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
