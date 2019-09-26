package com.devglan.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class FeesDetails {

	public FeesDetails() {
		
	}
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int feesAmount;
	
	@Column
	private Boolean isStaff;
	
	@Column
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date fromDate;
	
	@Column
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date toDate;
	
	@Column
	private String paymentType;
	
	@ManyToOne
	@JsonBackReference
	private MemberDetails memberDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFeesAmount() {
		return feesAmount;
	}

	public void setFeesAmount(int feesAmount) {
		this.feesAmount = feesAmount;
	}

	public Boolean getIsStaff() {
		return isStaff;
	}

	public void setIsStaff(Boolean isStaff) {
		this.isStaff = isStaff;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		
		
		/*
		 * Date convertedDate = null; try { convertedDate = new
		 * SimpleDateFormat("dd-MM-yyyy").parse(toDate); } catch (ParseException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
		this.toDate = toDate;
		
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public MemberDetails getMemberDetails() {
		return memberDetails;
	}

	public void setMemberDetails(MemberDetails memberDetails) {
		this.memberDetails = memberDetails;
	}

	@Override
	public String toString() {
		return "FeesDetails [id=" + id + ", feesAmount=" + feesAmount + ", isStaff=" + isStaff + ", fromDate="
				+ fromDate + ", toDate=" + toDate + ", paymentType=" + paymentType + ", memberDetails=" + memberDetails
				+ "]";
	} 
	
	
	
}
