package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="etat")
public class Stat implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_et")
	private int Id_et;
	
	@Column (name="etat")
	private String Etat;

	public int getId_et() {
		return Id_et;
	}

	public void setId_et(int id_et) {
		Id_et = id_et;
	}

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public Stat(String etat) {
		super();
		Etat = etat;
	}

	public Stat() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
