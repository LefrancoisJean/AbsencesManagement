package fr.galeriedelatifa.absences.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author Galerie de Latifa
 *
 */

@Entity
@Table(name = "absences")
public class Absences implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6890242260566309988L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "request_date", nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-jj")
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	
	@Column(name = "request_number", nullable=false)
	private String requestNumber;
	
	@Column(name = "begin_date") 
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-jj")
	@Temporal(TemporalType.DATE)
	@Future(message = "La date doit être postérieure à la date du jour")
	private Date beginDate;
	
	@Column(name = "end_date")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-jj")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name = "commentaire",columnDefinition="[a-zA-Z0-9]",nullable=false)
	private String commentaire;
	
	@Column(name = "statut_id", nullable=false)
	private Statut statut;
	
	@Column(name = "type_id", nullable=false)
	private Type type;
	
	@Column(name = "employe_id", nullable = false)
	private Employe employe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
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
