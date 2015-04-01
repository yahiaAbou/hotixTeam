package tn.hotixsoft.HotixTeamWeb.mb;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import tn.hotixsoft.HotixTeamEJB.entities.Type;
import tn.hotixsoft.HotixTeamEJB.impl.TaskImpl;
import tn.hotixsoft.HotixTeamEJB.interfaces.ITypeLocal;

@ManagedBean(name = "TypeMB")
@ViewScoped
public class TypeMB {
	@EJB
	private ITypeLocal metier;

	private String type;
	
	private List<Type> types;

	public List<Type> FindAllType() {
		return metier.FAllType();
	}
	
	public void addType(){
		metier.AddType(new Type(type));
	}
	
	
	@PostConstruct
	public void init(){
		setTypes(FindAllType());
	}

	

	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Type> getTypes() {
		return types;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}

}
