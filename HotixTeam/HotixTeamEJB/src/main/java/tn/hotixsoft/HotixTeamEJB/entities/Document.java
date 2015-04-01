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
@Table (name="document")
public class Document implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_doc")
	private int Id_doc;
	
	@Column(name="uri_doc" , nullable = false)
	private String Uri_doc;

	 @ManyToOne
	  @JoinColumn(name = "doctache")
	  private Task docTache;

	public String getUri_doc() {
		return Uri_doc;
	}

	public void setUri_doc(String uri_doc) {
		Uri_doc = uri_doc;
	}

	public Task getDocTache() {
		return docTache;
	}

	public void setDocTache(Task docTache) {
		this.docTache = docTache;
	}

	public Document(String uri_doc, Task docTache) {
		super();
		Uri_doc = uri_doc;
		this.docTache = docTache;
	}

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}


	 

}
