package com.blz.candidatespringbatch.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateModel {
	@Id
	@Column(name = "CANDIDATE_ID")
	private int id;
	
	@Column(name = "CICID")
	private String cicId;
	
	@Column(name = "FULLNAME")
	private String fullName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "MOBILENUM")
	private String mobileNum;
	
	@Column(name = "HIREDDATE")
	private String hiredDate;
	
	@Column(name = "DEGREE")
	private String degree;
	
	@Column(name = "AGGRPER")
	private Double aggrPer;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "PREFEREDJOBLOCATION")
	private String preferredJobLocation;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "PASSEDOUTYEAR")
	private String passedOutYear;
	
	@Column(name = "CREATERUSER")
	private String creatorUser;
	
	@Column(name = "CANDIDATESTATUS")
	private String candidateStatus;
}

