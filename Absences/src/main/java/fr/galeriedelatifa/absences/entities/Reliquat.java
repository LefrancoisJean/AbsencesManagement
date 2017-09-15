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
@Table(name = "reliquat")
public class Reliquat implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1008339437431030593L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "ca_number")
	private int caNumber;
	
	@Column(name = "rtt_number")
	private int rttNumber;
	
	@Column(name = "rc_number")
	private int rcNumber;
	
	@Column(name = "cm_number")
	private int cmNumber;
	
	@Column(name = "at_number")
	private int atNumber;
	
	@Column(name = "divers_number")
	private int divNumber;
	
	@Column(name = "employe_id")
	private Employe employe;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(int caNumber) {
		this.caNumber = caNumber;
	}

	public int getRttNumber() {
		return rttNumber;
	}

	public void setRttNumber(int rttNumber) {
		this.rttNumber = rttNumber;
	}

	public int getRcNumber() {
		return rcNumber;
	}

	public void setRcNumber(int rcNumber) {
		this.rcNumber = rcNumber;
	}

	public int getCmNumber() {
		return cmNumber;
	}

	public void setCmNumber(int cmNumber) {
		this.cmNumber = cmNumber;
	}

	public int getAtNumber() {
		return atNumber;
	}

	public void setAtNumber(int atNumber) {
		this.atNumber = atNumber;
	}

	public int getDivNumber() {
		return divNumber;
	}

	public void setDivNumber(int divNumber) {
		this.divNumber = divNumber;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
