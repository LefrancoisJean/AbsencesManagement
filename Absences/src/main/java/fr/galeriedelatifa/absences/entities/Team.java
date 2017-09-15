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
@Table(name = "teams")
public class Team implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2450160000050945922L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name = "team_code",nullable=false )
	private String teamCode;
	

	@Column(name = "team_name",columnDefinition="[a-zA-Z0-9]",nullable=false )
	private String teamName;
	
	@Column(name = "responsable_name",columnDefinition="[a-zA-Z0-9]",nullable=false )
	private String teamRespName;
	

	@Column(name = "responsable_email",columnDefinition="^[a-zA-Z0-9._-]+@[a-z0-9.-_]{2,}.[a-z]{2,4}$",nullable=false )
	private String teamRespEmail;
	
	@Column(name = "backup_name",columnDefinition="[a-zA-Z0-9]",nullable=false )
	private String teamBackupName;
	

	@Column(name = "backup_email",columnDefinition="^[a-zA-Z0-9._-]+@[a-z0-9.-_]{2,}.[a-z]{2,4}$",nullable=false )
	private String teamBackupEmail;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTeamCode() {
		return teamCode;
	}


	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getTeamRespName() {
		return teamRespName;
	}


	public void setTeamRespName(String teamRespName) {
		this.teamRespName = teamRespName;
	}


	public String getTeamRespEmail() {
		return teamRespEmail;
	}


	public void setTeamRespEmail(String teamRespEmail) {
		this.teamRespEmail = teamRespEmail;
	}


	public String getTeamBackupName() {
		return teamBackupName;
	}


	public void setTeamBackupName(String teamBackupName) {
		this.teamBackupName = teamBackupName;
	}


	public String getTeamBackupEmail() {
		return teamBackupEmail;
	}


	public void setTeamBackupEmail(String teamBackupEmail) {
		this.teamBackupEmail = teamBackupEmail;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
