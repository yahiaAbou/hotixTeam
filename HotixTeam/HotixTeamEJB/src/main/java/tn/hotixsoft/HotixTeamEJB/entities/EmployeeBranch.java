package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmployeeBranch
 *
 */
@Entity


public class EmployeeBranch implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private EmployeeBranchPK EBpk;
	
	@ManyToOne
	@JoinColumn(name="idEmployee", insertable=false, updatable=false)
	private Employee Employee;
	
	@ManyToOne
	@JoinColumn(name="idBranch", insertable=false, updatable=false)
	private Branch Branch;
	
	
	public EmployeeBranch() {
		super();
	}

	public EmployeeBranch(Employee Employee, Branch Branch) {
		super();
		this.Employee = Employee;
		this.Branch = Branch;
		this.EBpk = new EmployeeBranchPK(Employee != null ? Employee.getIdUser() : null, Branch.getIdBranch());
		
	}
	
	

	public EmployeeBranchPK getEBpk() {
		return EBpk;
	}

	public void setEBpk(EmployeeBranchPK eBpk) {
		EBpk = eBpk;
	}

	public Employee getEmployee() {
		return Employee;
	}

	public void setEmployee(Employee employee) {
		Employee = employee;
	}

	public Branch getBranch() {
		return Branch;
	}

	public void setBranch(Branch branch) {
		Branch = branch;
	}
	
   
}
