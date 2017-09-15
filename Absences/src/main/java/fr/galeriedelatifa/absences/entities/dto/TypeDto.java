package fr.galeriedelatifa.absences.entities.dto;

import java.io.Serializable;

public class TypeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8305573158363321250L;
	
	private String typeCode;
	
	private String typeName;

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
