package fr.galeriedelatifa.absences.entities.dto;

import java.io.Serializable;

public class RhDepartmentDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1123390671151740359L;

	private String rhCode;
	
	private String rhName;

	public String getRhCode() {
		return rhCode;
	}

	public void setRhCode(String rhCode) {
		this.rhCode = rhCode;
	}

	public String getRhName() {
		return rhName;
	}

	public void setRhName(String rhName) {
		this.rhName = rhName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
