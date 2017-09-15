package fr.galeriedelatifa.absences.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3830489606444074932L;

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	@Column(name = "registration",columnDefinition="[a-zA-Z0-9]",nullable=false )
	private String registration;
	
	@Column(name = "password",columnDefinition="[a-zA-Z0-9]",nullable=false)
	private String password;
	
	@Column(name = "role_id",nullable=false )
	private Role role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
