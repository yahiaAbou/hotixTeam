package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.Module;


@Local
public interface IModuleLocal {
	
	public void AddModule(Module mo);
	public List<Module> FindAllModule();
	

}
