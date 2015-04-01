package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idBranch")
	@GeneratedValue
	private int idBranch;
	
	@Column(name = "titleBranch")
	private String titleBranch;
	
	@OneToMany(mappedBy="Branch", cascade=CascadeType.MERGE)
	private List<EmployeeBranch> employeeBranch;

	public int getIdBranch() {
		return idBranch;
	}

	public void setIdBranch(int idBranch) {
		this.idBranch = idBranch;
	}

	public String getTitleBranch() {
		return titleBranch;
	}

	public void setTitleBranch(String titleBranch) {
		this.titleBranch = titleBranch;
	}

	public List<EmployeeBranch> getEmployeeBranch() {
		return employeeBranch;
	}

	public void setEmployeeBranch(List<EmployeeBranch> employeeBranch) {
		this.employeeBranch = employeeBranch;
	}

	public Branch(String titleBranch) {
		super();
		this.titleBranch = titleBranch;
	}

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

	
	
	

}
