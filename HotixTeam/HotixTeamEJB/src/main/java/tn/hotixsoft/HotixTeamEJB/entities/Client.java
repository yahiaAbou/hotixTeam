package tn.hotixsoft.HotixTeamEJB.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Client")
public class Client extends User {

	private static final long serialVersionUID = 1L;

	@Column(name = "adress_c")
	private String Adress_c;

	@Column(name = "name_c")
	private String Name_c;

	@Column(name = "father")
	private boolean Father;

	@Column(name = "fax_c")
	private String Fax_c;

	// //////// =========== >>>>> cle etrangere pour client pere

	@ManyToOne
	@JoinColumn(name = "client_father")
	private Client Client_father;

	@OneToMany(mappedBy = "client", cascade = CascadeType.MERGE)
	private List<Contrat> contrats;

	public String getAdress_c() {
		return Adress_c;
	}

	public void setAdress_c(String adress_c) {
		Adress_c = adress_c;
	}

	public String getName_c() {
		return Name_c;
	}

	public void setName_c(String name_c) {
		Name_c = name_c;
	}

	public String getFax_c() {
		return Fax_c;
	}

	public void setFax_c(String fax_c) {
		Fax_c = fax_c;
	}

	public Client(String email_u, String userName_u, String password_u,
			int phone_u, String adress_c, String name_c, boolean father,
			String fax_c, Client client_father) {
		super(email_u, userName_u, password_u, phone_u);
		Adress_c = adress_c;
		Name_c = name_c;
		Father = father;
		Fax_c = fax_c;
		Client_father = client_father;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}

}
