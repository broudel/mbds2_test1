package mbds2.test1.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="etudiant")

public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String noms;
	private Date datenaissance;
	private String sexe;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNoms() {
		return noms;
	}
	public void setNoms(String noms) {
		this.noms = noms;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	
	
	

}
