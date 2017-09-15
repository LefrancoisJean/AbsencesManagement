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
@Table(name = "rh_department")
public class RhDepartment implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3690538347007626035L;

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	@Column(name = "rh_department_code",nullable=false )
	private String rhCode;
	
	@Column(name = "rh_department_name",columnDefinition="[a-zA-Z0-9]",nullable=false)
	private String rhName;
	
	@Column (name = "rh_department_email",columnDefinition="^[a-zA-Z0-9._-]+@[a-z0-9.-_]{2,}.[a-z]{2,4}$",nullable=false)
	private String rhEmail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getRhEmail() {
		return rhEmail;
	}

	public void setRhEmail(String rhEmail) {
		this.rhEmail = rhEmail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
