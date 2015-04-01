package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.Branch;

@Local
public interface IBranchLocal {
	
	void AddBranch(Branch br);

	void DeleteBranch(Branch br);

	void UpdateBranch(Branch br);

	List<Branch> FindAllBranchs();

}
