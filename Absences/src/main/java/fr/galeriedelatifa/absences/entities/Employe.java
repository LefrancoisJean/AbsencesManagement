package fr.galeriedelatifa.absences.entities;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "employes")

public class Employe implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2614097161700802920L;

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	@Column(name = "last_name",columnDefinition="[a-zA-Z0-9]",nullable=false )
	private String lastName;
	
	@Column(name = "first_name",columnDefinition="[a-zA-Z0-9]",nullable=false)
	private String firstName;
	
	@Column (name = "email",columnDefinition="^[a-zA-Z0-9._-]+@[a-z0-9.-_]{2,}.[a-z]{2,4}$",nullable=false)
	private String email;
	
	@Column(name = "registration",columnDefinition="[a-zA-Z0-9]",nullable=false )
	private String registration;
	
	@Column(name = "team_id", nullable=false)
	private Team team;
	
	@Column(name = "rh_department_id", nullable=false)
	private RhDepartment rhDepartment;
	
	@Column(name = "users_id", nullable=false)
	private Users user;
	
//	private List<Absences> absences;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public RhDepartment getRhDepartment() {
		return rhDepartment;
	}

	public void setRhDepartment(RhDepartment rhDepartment) {
		this.rhDepartment = rhDepartment;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

//	public List<Absences> getAbsences() {
//		return absences;
//	}
//
//	public void setAbsences(List<Absences> absences) {
//		this.absences = absences;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	

}
