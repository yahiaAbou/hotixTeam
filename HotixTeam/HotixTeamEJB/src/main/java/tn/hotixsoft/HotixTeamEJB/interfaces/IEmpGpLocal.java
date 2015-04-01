package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.EmpGp;

@Local
public interface IEmpGpLocal {

	
	public void AddEmpGp(EmpGp eg);
	public List<EmpGp> FindAllEmpGp();
	
}
