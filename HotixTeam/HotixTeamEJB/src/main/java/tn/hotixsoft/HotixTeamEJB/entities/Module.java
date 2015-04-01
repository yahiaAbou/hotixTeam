package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "module")
public class Module implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_m")
	private int Id_m;

	@Column(name = "title_m", nullable = false)
	private String Title_m;

	@OneToMany(mappedBy = "module", cascade = CascadeType.MERGE)
	private List<Contrat> contrats;
	
	public int getId_m() {
		return Id_m;
	}

	public void setId_m(int id_m) {
		Id_m = id_m;
	}

	public String getTitle_m() {
		return Title_m;
	}

	public void setTitle_m(String title_m) {
		Title_m = title_m;
	}

	public Module(String title_m) {
		super();
		Title_m = title_m;
	}

	public Module() {
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
