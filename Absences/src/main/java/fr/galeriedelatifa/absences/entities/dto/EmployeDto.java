package fr.galeriedelatifa.absences.entities.dto;

import java.io.Serializable;
import java.util.List;

public class EmployeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8545993576554941587L;

	private String lastName;
	
	private String firstName;
	
	private String email;
	
	private String registration;
	
	private TeamDto team;
	
	private RhDepartmentDto rhDepartment;
	
	private ReliquatDto reliquat;
	
	private List<AbsencesDto> absences;
	
	private UserDto user;

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

	public TeamDto getTeam() {
		return team;
	}

	public void setTeam(TeamDto team) {
		this.team = team;
	}

	public RhDepartmentDto getRhDepartment() {
		return rhDepartment;
	}

	public void setRhDepartment(RhDepartmentDto rhDepartment) {
		this.rhDepartment = rhDepartment;
	}

	public ReliquatDto getReliquat() {
		return reliquat;
	}

	public void setReliquat(ReliquatDto reliquat) {
		this.reliquat = reliquat;
	}

	public List<AbsencesDto> getAbsences() {
		return absences;
	}

	public void setAbsences(List<AbsencesDto> absences) {
		this.absences = absences;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
