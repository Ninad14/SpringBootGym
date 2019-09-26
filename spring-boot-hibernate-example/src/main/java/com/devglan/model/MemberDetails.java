package com.devglan.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table
public class MemberDetails {

	public TrainerDetails getTrainerDetails() {
		return trainerDetails;
	}

	public void setTrainerDetails(TrainerDetails trainerDetails) {
		this.trainerDetails = trainerDetails;
	}

	public List<FeesDetails> getFeesDetails() {
		return feesDetails;
	}

	public void setFeesDetails(List<FeesDetails> feesDetails) {
		this.feesDetails = feesDetails;
	}

	public MemberDetails() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date creationDate = new Date();
	
	@Column
	private String firstName;
	
	@Column
	private String middleName;
	
	@Column
	private String lastName;
	
	@Column
	private String bloodGroup;
	
	@Column
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date birthDate;
	
	@Column
	private int age;
	
	@Column
	private String height;
	
	@Column
	private String weight;
	
	@Column
	private String education;
	
	@Column
	private String school_college;
	
	@Column
	private String occupation;
	
	@Column
	private String department;
	
	@Column
	private String address;
	
	@Column
	private String mobileNumber;
	
	@Column
	private String refNumber;
	
	@Column
	private String email;
	
	@Column
	private String website;
	
	@Column
	private String staffOrNo;
	
	@Column
	private String purposeOfJoining;
	
	@Column
	private String medicalHistory;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.ALL)
	private TrainerDetails trainerDetails;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JsonManagedReference
	@OneToMany(mappedBy = "memberDetails"  , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<FeesDetails> feesDetails;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreationDate() {
		return creationDate.toLocaleString();
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBirthDate() {
		return birthDate.toLocaleString();
	}

	public void setBirthDate(Date birthDate) {
		/*
		 * Date convertedDate = null; try { convertedDate = new
		 * SimpleDateFormat("dd-MM-yyyy").parse(birthDate); } catch (ParseException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSchool_college() {
		return school_college;
	}

	public void setSchool_college(String school_college) {
		this.school_college = school_college;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getStaffOrNo() {
		return staffOrNo;
	}

	public void setStaffOrNo(String staffOrNo) {
		this.staffOrNo = staffOrNo;
	}

	public String getPurposeOfJoining() {
		return purposeOfJoining;
	}

	public void setPurposeOfJoining(String purposeOfJoining) {
		this.purposeOfJoining = purposeOfJoining;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public MemberDetails(int id, Date creationDate, String firstName, String middleName, String lastName,
			String bloodGroup, Date birthDate, int age, String height, String weight, String education,
			String school_college, String occupation, String department, String address, String mobileNumber,
			String refNumber, String email, String website, String staffOrNo, String purposeOfJoining,
			String medicalHistory) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.bloodGroup = bloodGroup;
		this.birthDate = birthDate;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.education = education;
		this.school_college = school_college;
		this.occupation = occupation;
		this.department = department;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.refNumber = refNumber;
		this.email = email;
		this.website = website;
		this.staffOrNo = staffOrNo;
		this.purposeOfJoining = purposeOfJoining;
		this.medicalHistory = medicalHistory;
	}

	@Override
	public String toString() {
		return "MemberDetais [id=" + id + ", creationDate=" + creationDate + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", bloodGroup=" + bloodGroup
				+ ", birthDate=" + birthDate + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", education=" + education + ", school_college=" + school_college + ", occupation=" + occupation
				+ ", department=" + department + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", refNumber=" + refNumber + ", email=" + email + ", website=" + website + ", staffOrNo=" + staffOrNo
				+ ", purposeOfJoining=" + purposeOfJoining + ", medicalHistory=" + medicalHistory + "]";
	}
	
	
	
}
