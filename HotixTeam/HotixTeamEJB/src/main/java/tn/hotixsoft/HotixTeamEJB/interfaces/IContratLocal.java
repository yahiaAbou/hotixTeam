package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.Contrat;


@Local
public interface IContratLocal {

	public void AddContrat(Contrat co);
	public List<Contrat> FindAllContrat();
	
}
