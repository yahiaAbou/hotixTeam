package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.Stat;



@Local
public interface IStateLocal {

	public void AddState(Stat st);

	public void UpdateState(Stat st);

	public void DeleteState(Stat st);
	
	public List<Stat> FAllState();
	
	public List<Stat> FindTodoStat();
	
}
