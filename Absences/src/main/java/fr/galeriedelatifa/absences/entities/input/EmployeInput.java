package fr.galeriedelatifa.absences.entities.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class EmployeInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4705954559538272395L;

	@NotBlank(message = "Nom obligatoire")
	@Length(min = 2, message = "Le nom doit avoir au moins 2 caractères")
	private String lastName;
	
	@NotBlank(message = "Prénom obligatoire")
	@Length(min = 2, message = "Le prénom doit avoir au moins 2 caractères")
	private String firstName;
	
	@NotBlank(message = "Email obligatoire")
	@Length(min=2,message="L'adresse email est deja utilisée")
	@Email(regexp="^[a-zA-Z0-9._-]+@[a-z0-9.-_]{2,}.[a-z]{2,4}$")
	private String email;
	
	@NotBlank(message = "Matricule obligatoire")
	@Length(min = 2, message = "Le matricule doit avoir au moins 2 caractères")
	private String registration;
	
	@NotNull(message = "Le champs Equipe ne doit pas être vide")
	private String teamName;
	
	@NotNull(message = "Le champs Service RH ne doit pas être vide")
	private String rhName;
	
	@NotNull(message = "Niveau d'accréditation obligatoire")
	private String roleName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getRhName() {
		return rhName;
	}

	public void setRhName(String rhName) {
		this.rhName = rhName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
