package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MissionExterne extends Mission implements Serializable {

	private static final long serialVersionUID = -3046278688391172322L;


	private String emailFacturation;

	private float tauxJournalierMoyen;

	public MissionExterne() {
		super();
	}

	public MissionExterne(int id, String name, String description, String emailFacturation, float tauxJournalierMoyen) {
		super(id, name, description);
		this.emailFacturation = emailFacturation;
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}

	public MissionExterne(String name, String description, String emailFacturation, float tauxJournalierMoyen) {
		super(name, description);
		this.emailFacturation = emailFacturation;
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}
	
	public MissionExterne(int id, String name, String description) {
		super(id, name, description);
		// TODO Auto-generated constructor stub
	}

	public MissionExterne(String emailFacturation, float tauxJournalierMoyen) {
		super();
		this.emailFacturation = emailFacturation;
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}

	public MissionExterne(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	public String getEmailFacturation() {
		return emailFacturation;
	}

	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}

	public float getTauxJournalierMoyen() {
		return tauxJournalierMoyen;
	}

	public void setTauxJournalierMoyen(float tauxJournalierMoyen) {
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}

}
