package fr.galeriedelatifa.absences.entities.dto;

import java.io.Serializable;

public class ReliquatDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -438701385360218776L;

	private int caNumber;
	
	private int rttNumber;
	
	private int rcNumber;
	
	private int cmNumber;
	
	private int atNumber;
	
	private int diversNumber;

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

	public int getDiversNumber() {
		return diversNumber;
	}

	public void setDiversNumber(int diversNumber) {
		this.diversNumber = diversNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
