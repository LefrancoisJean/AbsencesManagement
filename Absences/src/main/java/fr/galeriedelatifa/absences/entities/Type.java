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
@Table(name = "type")
public class Type implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 8009744152175305178L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name = "type_code",nullable=false )
	private String typeCode;
	

	@Column(name = "type_name",columnDefinition="[a-zA-Z0-9]",nullable=false )
	private String typeName;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


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
