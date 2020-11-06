package com.example.assignement.helper;

public enum ApplicationStatus {
	
	APPLIED("Applied"),
	INVITED("Invited"),
	REJECTED("Rejected"),
	HIRED("Hired");
	
	
	
	private final String applicationStatus;

	private ApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	/**
	 * getApplicationStatus 
	 *
	 * @return the applicationStatus
	 */
	public String getApplicationStatus() {
		return applicationStatus;
	}
	

}
