package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "UserType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("User")
@Table(name = "user")
public class User implements Serializable {

	@Id
	@Column(name = "iduser")
	@GeneratedValue
	private int idUser;
	
	@Column(name = "emailuser")
	private String emailUser;
	@Column(name = "username_u")
	private String userNameUser;
	@Column(name = "password_u")
	private String passwordUser;
	@Column(name = "phone_u")
	private int phoneUser;

	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int id_u) {
		this.idUser = id_u;
	}

	

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String email_u) {
		emailUser = email_u;
	}

	public String getUserNameUser() {
		return userNameUser;
	}

	public void setUserNameUser(String userName_u) {
		userNameUser = userName_u;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String password_u) {
		passwordUser = password_u;
	}

	public int getPhoneUser() {
		return phoneUser;
	}

	public void setPhoneUser(int phone_u) {
		phoneUser = phone_u;
	}

	public User( String email_u,
			String userName_u, String password_u, int phone_u) {
		super();
		
		emailUser = email_u;
		userNameUser = userName_u;
		passwordUser = password_u;
		phoneUser = phone_u;
	}
	
	

}
