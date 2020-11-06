package com.example.assignement.model;

public class Application {
	
	private String jobId;
	private String jobTitle;
	private String userEmailId;
	private String resumeUrl;
	private String applicationStatus;
	
	public Application(String jobId, String jobTitle, String userEmailId, String resumeUrl, String applicationStatus) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.userEmailId = userEmailId;
		this.resumeUrl = resumeUrl;
		this.applicationStatus = applicationStatus;
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
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getResumeUrl() {
		return resumeUrl;
	}
	public void setResumeUrl(String resumeUrl) {
		this.resumeUrl = resumeUrl;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	
	
}
