package fr.galeriedelatifa.absences.entities.dto;

import java.io.Serializable;

public class TeamDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 153003395331640136L;

	private String teamCode;
	
	private String teamName;
	
	private String respName;
	
	private String respEmail;
	
	private String backName;
	
	private String backEmail;

	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

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

	public String getRespEmail() {
		return respEmail;
	}

	public void setRespEmail(String respEmail) {
		this.respEmail = respEmail;
	}

	public String getBackName() {
		return backName;
	}

	public void setBackName(String backName) {
		this.backName = backName;
	}

	public String getBackEmail() {
		return backEmail;
	}

	public void setBackEmail(String backEmail) {
		this.backEmail = backEmail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
