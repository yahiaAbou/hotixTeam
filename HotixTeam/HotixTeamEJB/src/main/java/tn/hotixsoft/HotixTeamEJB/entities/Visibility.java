package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Visibility
 *
 */
@Entity

public class Visibility implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private VisibilityPK vpk;
	
	@ManyToOne
	@JoinColumn(name="idProject", insertable=false, updatable=false)
	private Project project;
	
	@ManyToOne
	@JoinColumn(name="idGroup", insertable=false, updatable=false)
	private Groupe groupe;

	public Visibility() {
		super();
	}

	public Visibility(Project project, Groupe groupe) {
		super();
		this.project = project;
		this.groupe = groupe;
		this.vpk = new VisibilityPK(project != null ? project.getIdProject() : null, groupe.getIdGroupe());
		
	}


	public VisibilityPK getVpk() {
		return vpk;
	}

	public void setVpk(VisibilityPK vpk) {
		this.vpk = vpk;
	}
   
}
