package fr.galeriedelatifa.absences.entities.dto;

import java.io.Serializable;

public class StatutDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3589943863427651277L;
	
	private String statutCode;
	
	private String statutName;

	public String getStatutCode() {
		return statutCode;
	}

	public void setStatutCode(String statutCode) {
		this.statutCode = statutCode;
	}

	public String getStatutName() {
		return statutName;
	}

	public void setStatutName(String statutName) {
		this.statutName = statutName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
