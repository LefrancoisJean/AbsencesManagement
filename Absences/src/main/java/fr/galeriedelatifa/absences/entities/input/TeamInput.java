package fr.galeriedelatifa.absences.entities.input;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class TeamInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -435389954698000787L;

	@NotBlank(message = "Nom obligatoire")
	@Length(min = 2, message = "Le nom doit avoir au moins 2 caractères")
	private String teamName;
	
	@Length(min = 2, message = "Le nom doit avoir au moins 2 caractères")
	private String respName;
	
	@Length(min = 2, message = "Le nom doit avoir au moins 2 caractères")
	private String backName;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getRespName() {
		return respName;
	}

	public void setRespName(String respName) {
		this.respName = respName;
	}

	public String getBackName() {
		return backName;
	}

	public void setBackName(String backName) {
		this.backName = backName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
