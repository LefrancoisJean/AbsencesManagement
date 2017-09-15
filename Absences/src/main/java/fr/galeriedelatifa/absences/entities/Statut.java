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
public class Statut implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2908183402381030150L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name = "statut_code",nullable=false )
	private String statutCode;
	

	@Column(name = "statut_name",columnDefinition="[a-zA-Z0-9]",nullable=false )
	private String statutName;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


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
