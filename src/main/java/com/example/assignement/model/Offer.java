package com.example.assignement.model;
import java.util.Date;

public class Offer {

	private String jobId;
	private String jobTitle;
	private Date startDate;
	private Integer numOfApplication;
	
	public Offer(String jobId, String jobTitle, Date startDate, Integer numOfApplication) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.startDate = startDate;
		this.numOfApplication = numOfApplication;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getNumOfApplication() {
		return numOfApplication;
	}

	public void setNumOfApplication(Integer numOfApplication) {
		this.numOfApplication = numOfApplication;
	}
		
	
}
