package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeBranchPK  implements Serializable {   
   
	private static final long serialVersionUID = 1L;
	
	private int idEmployee;
	private int idBranch;

	public EmployeeBranchPK() {
		super();
	}
	
	public EmployeeBranchPK(int idEmployee, int idBranch) {
		super();
		this.idEmployee = idEmployee;
		this.idBranch = idBranch;
	}



	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public int getIdBranch() {
		return idBranch;
	}

	public void setIdBranch(int idBranch) {
		this.idBranch = idBranch;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idBranch;
		result = prime * result + idEmployee;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBranchPK other = (EmployeeBranchPK) obj;
		if (idBranch != other.idBranch)
			return false;
		if (idEmployee != other.idEmployee)
			return false;
		return true;
	}
}
