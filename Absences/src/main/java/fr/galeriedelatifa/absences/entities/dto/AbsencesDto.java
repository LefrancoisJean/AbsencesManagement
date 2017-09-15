package fr.galeriedelatifa.absences.entities.dto;

import java.io.Serializable;
import java.util.Date;

public class AbsencesDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6319939126369803446L;

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public StatutDto getStatut() {
		return statut;
	}

	public void setStatut(StatutDto statut) {
		this.statut = statut;
	}

	public TypeDto getType() {
		return type;
	}

	public void setType(TypeDto type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Date requestDate;
	
	private String requestNumber;
	
	private Date beginDate;
	
	private Date endDate;
	
	private StatutDto statut;
	
	private TypeDto type;
	
	

}
