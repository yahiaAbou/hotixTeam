package tn.hotixsoft.HotixTeamEJB.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.hotixsoft.HotixTeamEJB.entities.Type;

@Local
public interface ITypeLocal {

	public void AddType(Type ty);

	public void UpdateType(Type ty);

	public void DeleteType(Type ty);
	
	public List<Type> FAllType();

}
