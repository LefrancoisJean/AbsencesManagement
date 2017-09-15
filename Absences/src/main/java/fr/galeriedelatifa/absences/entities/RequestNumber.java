package fr.galeriedelatifa.absences.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Galerie de Latifa
 *
 */

@Entity
@Table(name = "request_number")
public class RequestNumber implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7903528379245274664L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name = "absence_type_code",nullable=false )
	private String absenceTypeCode;
	

	@Column(name = "request_number",columnDefinition="[a-zA-Z0-9]",nullable=false )
	private String requestNumber;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAbsenceTypeCode() {
		return absenceTypeCode;
	}


	public void setAbsenceTypeCode(String absenceTypeCode) {
		this.absenceTypeCode = absenceTypeCode;
	}


	public String getRequestNumber() {
		return requestNumber;
	}


	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
