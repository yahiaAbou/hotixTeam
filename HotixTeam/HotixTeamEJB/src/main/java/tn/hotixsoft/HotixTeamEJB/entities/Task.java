package tn.hotixsoft.HotixTeamEJB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="task")                                                                                                                                                                                                                                                                                                                                                                       
public class Task implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_t")
	private int Id_t;
	
	@Column(name="title_t")
	private String Title_t;
	
	@Column(name="description_t")
	private String Description_t;
	
	@Column(name="visib_t")	
	private boolean Visib_t;
	
	@Column(name="visibc_t")
	private boolean Visibc_t;
	
	
	@Column(name="datec_t")
	private String Datec_t;
	
	@Column(name="dated_t")
	private String Dated_t;
	
	@Column(name="datef_t")
	private String Datef_t;
	
	@Column(name="datedm_t")
	private String Datedm_t;
	

	  @ManyToOne
	  @JoinColumn(name = "etat_tache")
	  private Stat etatTache;
	  
	  @ManyToOne
	  @JoinColumn(name = "type_tache")
	  private Type typeTache;
	  
	  @ManyToOne
	  @JoinColumn(name = "module_tache")
	  private Module moduleTache;
	  
	  @ManyToOne
	  @JoinColumn(name = "projet_tache")
	private Project projetTache;
	  
	  @ManyToOne
	  @JoinColumn(name = "employee_tache")
	private Employee employeeTache;
	  
	  @ManyToOne
	  @JoinColumn(name = "affected_employee")
	private Employee affectedEmployee;
	  
	  
	  

	public int getId_t() {
		return Id_t;
	}

	public void setId_t(int id_t) {
		Id_t = id_t;
	}

	public Employee getEmployeeTache() {
		return employeeTache;
	}

	public void setEmployeeTache(Employee employeeTache) {
		this.employeeTache = employeeTache;
	}

	public Employee getAffectedEmployee() {
		return affectedEmployee;
	}

	public void setAffectedEmployee(Employee affectedEmployee) {
		this.affectedEmployee = affectedEmployee;
	}

	public String getTitle_t() {
		return Title_t;
	}

	public void setTitle_t(String title_t) {
		Title_t = title_t;
	}

	public String getDescription_t() {
		return Description_t;
	}

	public void setDescription_t(String description_t) {
		Description_t = description_t;
	}

	public boolean isVisib_t() {
		return Visib_t;
	}

	public void setVisib_t(boolean visib_t) {
		Visib_t = visib_t;
	}

	public boolean isVisibc_t() {
		return Visibc_t;
	}

	public void setVisibc_t(boolean visibc_t) {
		Visibc_t = visibc_t;
	}

	public String getDatec_t() {
		return Datec_t;
	}

	public void setDatec_t(String datec_t) {
		Datec_t = datec_t;
	}

	public String getDated_t() {
		return Dated_t;
	}

	public void setDated_t(String dated_t) {
		Dated_t = dated_t;
	}

	public String getDatef_t() {
		return Datef_t;
	}

	public void setDatef_t(String datef_t) {
		Datef_t = datef_t;
	}

	public String getDatedm_t() {
		return Datedm_t;
	}

	public void setDatedm_t(String datedm_t) {
		Datedm_t = datedm_t;
	}

	public Stat getEtatTache() {
		return etatTache;
	}

	public void setEtatTache(Stat etatTache) {
		this.etatTache = etatTache;
	}

	public Type getTypeTache() {
		return typeTache;
	}

	public void setTypeTache(Type typeTache) {
		this.typeTache = typeTache;
	}

	public Module getModuleTache() {
		return moduleTache;
	}

	public void setModuleTache(Module moduleTache) {
		this.moduleTache = moduleTache;
	}

	public Project getProjetTache() {
		return projetTache;
	}

	public void setProjetTache(Project projetTache) {
		this.projetTache = projetTache;
	}

	
	
	
	

	public Task(String title_t, String description_t, boolean visib_t,
			boolean visibc_t, String datec_t, String dated_t, String datef_t,
			String datedm_t, Stat etatTache, Type typeTache,
			Module moduleTache, Project projetTache, Employee employeeTache,
			Employee affectedEmployee) {
		super();
		Title_t = title_t;
		Description_t = description_t;
		Visib_t = visib_t;
		Visibc_t = visibc_t;
		Datec_t = datec_t;
		Dated_t = dated_t;
		Datef_t = datef_t;
		Datedm_t = datedm_t;
		this.etatTache = etatTache;
		this.typeTache = typeTache;
		this.moduleTache = moduleTache;
		this.projetTache = projetTache;
		this.employeeTache = employeeTache;
		this.affectedEmployee = affectedEmployee;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	

	
	

	
	
	
	
	
	
}
