package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmpGp
 * 
 */
@Entity
public class EmpGp implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="idUser", insertable=false, updatable=false)
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name="idGroupe", insertable=false, updatable=false)
	private Groupe groupe;
	
	@EmbeddedId
	private EmpGpPK empGpPK;

	
	public EmpGp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmpGp(Employee employee, Groupe group) {
		super();
		this.employee = employee;
		this.groupe = group;
		this.empGpPK=new EmpGpPK(employee.getIdUser(), group.getIdGroupe()); 
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Groupe getGroupe() {
		return groupe;
	}


	public void setGroupe(Groupe group) {
		this.groupe = group;
	}


	public EmpGpPK getEmpGpPK() {
		return empGpPK;
	}


	public void setEmpGpPK(EmpGpPK empGpPK) {
		this.empGpPK = empGpPK;
	}


	
	
	
	
	
	
}
