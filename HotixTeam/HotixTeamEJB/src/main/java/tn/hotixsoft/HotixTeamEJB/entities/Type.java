package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="type")
public class Type implements Serializable
{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_ty")
	private int Id_ty;
	
	@Column(name="type_ty", nullable = false)
	private String Type_ty;

	public String getType_ty() {
		return Type_ty;
	}

	public void setType_ty(String type_ty) {
		Type_ty = type_ty;
	}

	public Type(String type_ty) {
		super();
		Type_ty = type_ty;
	}

	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
