package com.devglan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class TrainerDetails {

	public TrainerDetails() {
		
	}
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String trainerName;
	
	@Column
	private String trainerMobileNumber;
	
	@Column 
	private String trainerAddress;
	
	/*
	 * @OneToMany private MemberDetails memberDetails;
	 */ 
	
	
	public TrainerDetails(int id, String trainerName, String trainerMobileNumber, String trainerAddress) {
		super();
		this.id = id;
		this.trainerName = trainerName;
		this.trainerMobileNumber = trainerMobileNumber;
		this.trainerAddress = trainerAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerMobileNumber() {
		return trainerMobileNumber;
	}

	public void setTrainerMobileNumber(String trainerMobileNumber) {
		this.trainerMobileNumber = trainerMobileNumber;
	}

	public String getTrainerAddress() {
		return trainerAddress;
	}

	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
		
	}

	@Override
	public String toString() {
		return "TrainerDetails [id=" + id + ", trainerName=" + trainerName + ", trainerMobileNumber="
				+ trainerMobileNumber + ", trainerAddress=" + trainerAddress + "]";
	}
	
	
	
		
	
	
}
