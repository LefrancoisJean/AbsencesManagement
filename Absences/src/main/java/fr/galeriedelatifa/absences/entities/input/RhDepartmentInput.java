package fr.galeriedelatifa.absences.entities.input;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class RhDepartmentInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6212521143874820073L;

	@NotBlank(message = "Nom obligatoire")
	@Length(min = 2, message = "Le nom doit avoir au moins 2 caractères")
	private String rhName;
	
	@NotBlank(message = "Email obligatoire")
	@Length(min=2,message="L'adresse email est deja utilisée")
	@Email(regexp="^[a-zA-Z0-9._-]+@[a-z0-9.-_]{2,}.[a-z]{2,4}$")
	private String rhEmail;

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
